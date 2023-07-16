package cd.go.authorization.skeleton;

import org.junit.jupiter.api.Test;

public class AuthenticatorTest {

    @Test
    public void shouldAuthenticate() throws Exception {
        new Authenticator().authenticate(null, null);
    }
}