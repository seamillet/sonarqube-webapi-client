package com.geewaza.sonarqube.webapi.client.http;

import com.geewaza.sonarqube.webapi.util.HttpResponseValidator;
import com.geewaza.sonarqube.webapi.util.HttpResponseWrapper;
import org.apache.commons.lang3.StringUtils;
import org.apache.http.Consts;
import org.apache.http.NameValuePair;
import org.apache.http.auth.AuthScope;
import org.apache.http.auth.UsernamePasswordCredentials;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.auth.BasicScheme;
import org.apache.http.impl.client.BasicCredentialsProvider;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.protocol.BasicHttpContext;
import org.apache.http.protocol.HttpContext;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 *
 * @author wangheng
 * @date 2017/6/20
 */
public class BaseHttpClient {
    /**
     * Host url
     */
    private final URI uri;
    /**
     * HttpClient
     */
    private final HttpClient client;

    private HttpContext localContext;

    public BaseHttpClient(URI uri, HttpClient client) {
        this.uri = uri;
        this.client = client;
    }

    public BaseHttpClient(URI uri, HttpClientBuilder builder) {
        this(uri, builder.build());
    }

    public BaseHttpClient(URI uri) {
        this(uri, HttpClientBuilder.create());
    }

    public BaseHttpClient(URI uri, String username, String password) {
        this(uri, addAuthentication(HttpClientBuilder.create(), uri, username, password));
        if (!StringUtils.isEmpty(username)) {
            this.localContext = new BasicHttpContext();
            this.localContext.setAttribute("preemptive-auth", new BasicScheme());
        }
    }


    private void releaseConnection(HttpRequestBase httpRequestBase) {
        httpRequestBase.releaseConnection();
    }

    /**
     * Send GET request, format response with specified class
     *
     * @param path          url path
     * @param params        url params
     * @param cls           specified class
     * @param <T>           template
     * @return              response body
     * @throws IOException  error
     */
    public <T> T get(String path, Map<String, Object> params, Class<T> cls) throws IOException {
        String content = get(path, params);
        return HttpResponseWrapper.wrap(content, cls);
    }

    /**
     * Send GET request
     *
     * @param path          url path
     * @param params        url params
     * @return              response body
     * @throws IOException  error
     */
    public String get(String path, Map<String, Object> params) throws IOException {
        path = appendParams(path, params);
        HttpGet getMethod = new HttpGet(this.api(path));
        CloseableHttpResponse response = (CloseableHttpResponse) this.client.execute(getMethod, this.localContext);

        String var;
        try {
            HttpResponseValidator.validateResponse(response);
            var = EntityUtils.toString(response.getEntity());
        } finally {
            EntityUtils.consume(response.getEntity());
            this.releaseConnection(getMethod);
        }
        return var;
    }

    /**
     * Send POST Request, format response with specified class
     *
     * @param path          url path
     * @param params        url params
     * @param jsonBody      post body
     * @param cls           specified class
     * @param <T>           template
     * @return              response body
     * @throws IOException  error
     */
    public <T> T post(String path, Map<String, Object> params, String jsonBody, Class<T> cls) throws IOException {
        String content = post(path, params, jsonBody);
        return HttpResponseWrapper.wrap(content, cls);
    }

    /**
     * Send POST Request
     *
     * @param path          url path
     * @param params        url params
     * @param jsonBody      post body
     * @return              response body
     * @throws IOException  error
     */
    public String post(String path, Map<String, Object> params, String jsonBody) throws IOException {
//        path = appendParams(path, params);
        HttpPost httpPost = new HttpPost(this.api(path));

        if (null != params && params.size() > 0) {
            List<NameValuePair> form = new ArrayList<>();
            for (String name : params.keySet()) {
                form.add(new BasicNameValuePair(name, params.get(name).toString()));
            }
            UrlEncodedFormEntity entity = new UrlEncodedFormEntity(form, Consts.UTF_8);
            httpPost.setEntity(entity);
        }

        if (StringUtils.isNotBlank(jsonBody)) {
            StringEntity se = new StringEntity(jsonBody, ContentType.create("application/json", Consts.UTF_8));
            httpPost.setEntity(se);
        }
        CloseableHttpResponse response = null;
        try {
            response = (CloseableHttpResponse) this.client.execute(httpPost, this.localContext);
            HttpResponseValidator.validateResponse(response);
            return (response.getEntity() == null)? "null" : EntityUtils.toString(response.getEntity());
        } finally {
            if (null != response) {
                EntityUtils.consume(response.getEntity());
            }
            this.releaseConnection(httpPost);
        }
    }

    /**
     * Append params to URL
     *
     * @param path      URL path
     * @param params    params
     * @return          URL path with params
     * @throws UnsupportedEncodingException
     */
    private String appendParams(String path, Map<String, Object> params) throws UnsupportedEncodingException {
        if (null != params && params.size() > 0) {
            StringBuilder pathBuilder = new StringBuilder(path);
            boolean isFirst = true;
            for (Map.Entry<String, Object> entry : params.entrySet()) {
                if (!path.contains("?") && isFirst) {
                    pathBuilder.append("?");
                    isFirst = false;
                } else {
                    pathBuilder.append("&");
                }
                pathBuilder.append(URLEncoder.encode(entry.getKey(), "UTF-8"))
                        .append("=")
                        .append(URLEncoder.encode(entry.getValue().toString(), "UTF-8"));
            }
            return pathBuilder.toString();
        } else {
            return path;
        }
    }

    private URI api(String path) {
        return this.uri.resolve("/").resolve(path.replace(" ", "%20"));
    }

    private static HttpClientBuilder addAuthentication(HttpClientBuilder builder, URI uri, String username, String password) {
        if (!StringUtils.isEmpty(username)) {
            BasicCredentialsProvider provider = new BasicCredentialsProvider();
            AuthScope scope = new AuthScope(uri.getHost(), uri.getPort());
            UsernamePasswordCredentials credentials = new UsernamePasswordCredentials(username, password);
            provider.setCredentials(scope, credentials);
            builder.setDefaultCredentialsProvider(provider);
            builder.addInterceptorFirst(new PreemptiveAuth());
        }
        return builder;
    }

}
