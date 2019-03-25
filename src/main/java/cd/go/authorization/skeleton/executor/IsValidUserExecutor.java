package cd.go.authorization.skeleton.executor;

import com.thoughtworks.go.plugin.api.request.GoPluginApiRequest;
import com.thoughtworks.go.plugin.api.response.GoPluginApiResponse;

public class IsValidUserExecutor implements RequestExecutor {
    private final GoPluginApiRequest request;

    public IsValidUserExecutor(GoPluginApiRequest request) {
        this.request = request;
    }

    @Override
    public GoPluginApiResponse execute() {
        throw new RuntimeException("Implement me!");
    }
}
