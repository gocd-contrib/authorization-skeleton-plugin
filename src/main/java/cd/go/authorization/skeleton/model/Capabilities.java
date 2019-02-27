package cd.go.authorization.skeleton.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import static cd.go.authorization.skeleton.utils.Util.GSON;

public class Capabilities {
    @Expose
    @SerializedName("supported_auth_type")
    private final SupportedAuthType supportedAuthType;

    @Expose
    @SerializedName("can_search")
    private final boolean canSearch;

    @Expose
    @SerializedName("can_authorize")
    private final boolean canAuthorize;

    @Expose
    @SerializedName("can_get_user_roles")
    private final boolean canGetUserRoles;

    public Capabilities(SupportedAuthType supportedAuthType, boolean canSearch, boolean canAuthorize, boolean canGetUserRoles) {
        this.supportedAuthType = supportedAuthType;
        this.canSearch = canSearch;
        this.canAuthorize = canAuthorize;
        this.canGetUserRoles = canGetUserRoles;
    }

    public static Capabilities fromJSON(String json) {
        return GSON.fromJson(json, Capabilities.class);
    }

    public SupportedAuthType getSupportedAuthType() {
        return supportedAuthType;
    }

    public boolean canSearch() {
        return canSearch;
    }

    public boolean canAuthorize() {
        return canAuthorize;
    }

    public boolean canGetUserRoles() {
        return canGetUserRoles;
    }

    public String toJSON() {
        return GSON.toJson(this);
    }
}
