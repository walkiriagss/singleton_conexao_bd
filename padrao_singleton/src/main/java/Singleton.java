import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Singleton {

    private String url = "jdbc:localhost://localhost:5432/teteSensio";
    private String user = "postgres";
    private String senha = "3015";

    private Singleton() {};
    private static Singleton instance = new Singleton();
    public static Singleton getInstance() {
        return instance;
    }


    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public static void setInstance(Singleton instance) {
        Singleton.instance = instance;
    }
}
