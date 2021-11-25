import junit.framework.TestCase;
import org.junit.Test;

public class SingletonTest extends TestCase {

    @Test
    public void testSetUrl() {
        Singleton.getInstance().setUrl("jdbc:localhost://localhost:5432/teteSensio");
        assertEquals("jdbc:localhost://localhost:5432/teteSensio", Singleton.getInstance().getUrl());
    }

    @Test
    public void testSetUser() {
        Singleton.getInstance().setUser("postgres");
        assertEquals("postgres", Singleton.getInstance().getUser());
    }

    @Test
    public void testSetSenha() {
        Singleton.getInstance().setSenha("1234");
        assertEquals("1234", Singleton.getInstance().getSenha());
    }

}