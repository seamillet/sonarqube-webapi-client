# sonarqube-webapi-client
 A Java client for interacting with the SonarQube server via Sonarqube web apis. For SonarQube Version 7.9.5 . 
# User Guide

```java
public class SonarClientTest {

    private static final String SERVER_URL = "http://localhost:9000/";
    private static final String USER = "username";
    private static final String PASSWORD = "password";
    private static final String TOKEN = "accesstoken";

    @Test
    public void initSonarClientWithUserPassword() throws URISyntaxException, IOException {
        SonarClient client = new SonarClientImpl(new URI(SERVER_URL), USER, PASSWORD);
        Groups groups = client.getUserClient().getUserGroups(USER, null, null, null, null);
        System.out.println(JSONObject.toJSONString(groups));
        Assert.assertNotNull(groups);
    }

    @Test
    public void initSonarClientWithToken() throws URISyntaxException, IOException {
        SonarClient client = new SonarClientImpl(new URI(SERVER_URL), TOKEN);
        Groups groups = client.getUserClient().getUserGroups(USER, null, null, null, null);
        System.out.println(JSONObject.toJSONString(groups));
        Assert.assertNotNull(groups);
    }

}
```