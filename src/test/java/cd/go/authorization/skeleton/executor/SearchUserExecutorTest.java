package cd.go.authorization.skeleton.executor;

import org.junit.jupiter.api.Test;

public class SearchUserExecutorTest {

    @Test
    public void shouldSearch() throws Exception {
        new SearchUserExecutor(null).execute();
    }
}