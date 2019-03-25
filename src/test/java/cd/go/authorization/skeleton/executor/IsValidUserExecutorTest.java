package cd.go.authorization.skeleton.executor;

import com.thoughtworks.go.plugin.api.request.GoPluginApiRequest;
import com.thoughtworks.go.plugin.api.response.DefaultGoPluginApiResponse;
import com.thoughtworks.go.plugin.api.response.GoPluginApiResponse;
import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.mock;

public class IsValidUserExecutorTest {
    @Test
    public void shouldReturnSuccessResponseIfUserIsValid() {
        final GoPluginApiResponse response = new IsValidUserExecutor(mock(GoPluginApiRequest.class)).execute();

        assertThat(response.responseCode(), is(DefaultGoPluginApiResponse.SUCCESS_RESPONSE_CODE));
    }


    @Test
    public void shouldReturnErrorResponseIfUserIsValid() {
        final GoPluginApiResponse response = new IsValidUserExecutor(mock(GoPluginApiRequest.class)).execute();

        assertThat(response.responseCode(), is(DefaultGoPluginApiResponse.INTERNAL_ERROR));
    }
}