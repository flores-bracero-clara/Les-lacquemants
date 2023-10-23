import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.client.methods.CloseableHttpResponse;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

class GitLab {
    private String apiToken;
    private String projectId;

    public GitLab setApiToken(String token) {
        this.apiToken = token;
        return this;
    }

    public GitLab setProjectId(String id) {
        this.projectId = id;
        return this;
    }

    public String build() {
        try {
            URIBuilder uriBuilder = new URIBuilder()
                    .setScheme("https")
                    .setHost("gitlab.com")
                    .setPath("/api/v4/projects/" + projectId)
                    .setParameter("private_token", apiToken);

            URI uri = uriBuilder.build();

            HttpGet httpGet = new HttpGet(uri);

            CloseableHttpClient httpClient = HttpClients.createDefault();

            CloseableHttpResponse response = httpClient.execute(httpGet);

            return EntityUtils.toString(response.getEntity());

        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        } catch (ClientProtocolException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}