package cd.go.authorization.skeleton.executor;

import com.thoughtworks.go.plugin.api.request.GoPluginApiRequest;
import com.thoughtworks.go.plugin.api.response.GoPluginApiResponse;
import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.mock;

public class GetUseRolesExecutorTest {
    @Test
    public void shouldGetRolesForTheUser() {
        final GoPluginApiResponse response = new GetUseRolesExecutor(mock(GoPluginApiRequest.class)).execute();

        assertThat(response.responseCode(), is(200));
        assertThat(response.responseBody(), is("[\"blackbird\", \"spacetiger\"]"));
    }
}