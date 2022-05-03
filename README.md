# sonarqube-webapi-client
 A Java client for interacting with the SonarQube server via Sonarqube web apis. \
 For SonarQube Version 7.9.5 . 
# User Guide

```java
public class SonarClientTest {

    private static final String SERVER_URL = "http://localhost:9000/";
    private static final String USER = "username";
    private static final String PASSWORD = "password";
    private static final String TOKEN = "access_token";

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
# TODO List
| API | Coding | Testing |
|:---|---|---|
|api/authentication|[x]|[ ]|
|api/ce|[x]|[ ]|
|api/components|[x]|[ ]|
|api/duplications|[x]|[ ]|
|api/favorites|[x]|[ ]|
|api/issues|[x]|[ ]|
|api/languages|[x]|[ ]|
|api/measures|[x]|[ ]|
|api/metrics|[x]|[ ]|
|api/notifications|[x]|[ ]|
|api/permissions|[ ]|[ ]|
|api/plugins|[ ]|[ ]|
|api/project_analyses|[ ]|[ ]|
|api/project_badges|[ ]|[ ]|
|api/project_branches|[ ]|[ ]|
|api/project_links|[ ]|[ ]|
|api/project_pull_requests|[ ]|[ ]|
|api/project_tags|[ ]|[ ]|
|api/projects|[x]|[ ]|
|api/qualitygates|[ ]|[ ]|
|api/qualityprofiles|[ ]|[ ]|
|api/rules|[ ]|[ ]|
|api/server|[x]|[ ]|
|api/settings|[ ]|[ ]|
|api/sources|[ ]|[ ]|
|api/system|[x]|[ ]|
|api/updatecenter|[ ]|[ ]|
|api/user_groups|[ ]|[ ]|
|api/user_tokens|[ ]|[ ]|
|api/users|[x]|[ ]|
|api/webhooks|[x]|[ ]|
|api/webservices|[x]|[ ]|

# Contribution
### Library
Contributing to standard library follows standard workflow. Create feature/bugfix branch, implement, create pull request with me as a reviewer and merge after approval :-)

### Testing
The library is tested manually at this point. If you are interested in implementing any kind of testing, unit testing, integration testing, end-to-end testing, potentially including some virtualization you are welcome to do so. Please follow the same workflow as for any work on library itself.