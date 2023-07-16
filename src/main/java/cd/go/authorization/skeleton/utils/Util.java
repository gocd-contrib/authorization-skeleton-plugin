package cd.go.authorization.skeleton.utils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.io.StringReader;
import java.nio.charset.StandardCharsets;
import java.util.Properties;

public class Util {
    public static final Gson GSON = new GsonBuilder().excludeFieldsWithoutExposeAnnotation().create();

    public static String readResource(String resourceFile) {
        return new String(readResourceBytes(resourceFile), StandardCharsets.UTF_8);
    }

    public static byte[] readResourceBytes(String resourceFile) {
        try (InputStream in = Util.class.getResourceAsStream(resourceFile)) {
            return in.readAllBytes();
        } catch (IOException e) {
            throw new RuntimeException("Could not find resource " + resourceFile, e);
        }
    }

    public static String pluginId() {
        String s = readResource("/plugin.properties");
        try {
            Properties properties = new Properties();
            properties.load(new StringReader(s));
            return (String) properties.get("pluginId");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
