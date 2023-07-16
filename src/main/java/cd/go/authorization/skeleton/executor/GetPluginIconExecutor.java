package cd.go.authorization.skeleton.executor;


import cd.go.authorization.skeleton.utils.Util;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.thoughtworks.go.plugin.api.response.DefaultGoPluginApiResponse;
import com.thoughtworks.go.plugin.api.response.GoPluginApiResponse;

import java.util.Base64;

public class GetPluginIconExecutor implements RequestExecutor {
    private static final Gson GSON = new Gson();

    @Override
    public GoPluginApiResponse execute() throws Exception {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("content_type", getContentType());
        jsonObject.addProperty("data", Base64.getEncoder().encodeToString(Util.readResourceBytes(getIcon())));
        DefaultGoPluginApiResponse defaultGoPluginApiResponse = new DefaultGoPluginApiResponse(200, GSON.toJson(jsonObject));
        return defaultGoPluginApiResponse;

    }

    private String getContentType() {
        throw new RuntimeException("Implement me!");
    }

    private String getIcon() {
        throw new RuntimeException("Implement me!");
    }
}
