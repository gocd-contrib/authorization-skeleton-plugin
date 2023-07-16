package cd.go.authorization.skeleton.annotation;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.HashMap;
import java.util.Map;

public class ProfileMetadata<T extends Metadata> {

    @Expose
    @SerializedName("key")
    private String key;

    @Expose
    @SerializedName("metadata")
    private T metadata;

    public ProfileMetadata(String key, T metadata) {
        this.key = key;
        this.metadata = metadata;
    }

    public Map<String, String> validate(String input) {
        HashMap<String, String> result = new HashMap<>();
        String validationError = doValidate(input);
        if (validationError != null && !validationError.isBlank()) {
            result.put("key", key);
            result.put("message", validationError);
        }
        return result;
    }

    protected String doValidate(String input) {
        if (isRequired()) {
            if (input == null || input.isBlank()) {
                return this.key + " must not be blank.";
            }
        }
        return null;
    }


    public String getKey() {
        return key;
    }

    public boolean isRequired() {
        return metadata.isRequired();
    }
}