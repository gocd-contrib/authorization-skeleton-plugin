package cd.go.authorization.skeleton;

import com.thoughtworks.go.plugin.api.GoPluginIdentifier;

import java.util.Collections;

public interface Constants {
    // The type of this extension
    String EXTENSION_TYPE = "authorization";

    // The extension point API version that this plugin understands
    String EXTENSION_API_VERSION = "2.0";

    // the identifier of this plugin
    GoPluginIdentifier PLUGIN_IDENTIFIER = new GoPluginIdentifier(EXTENSION_TYPE, Collections.singletonList(EXTENSION_API_VERSION));
}
