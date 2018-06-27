package group.two.two.lab3.controller.model;

import com.google.common.hash.Hashing;
import java.nio.charset.StandardCharsets;

public class Login {
    private String username;
    private String password;
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = Hashing.sha256().hashString(password, StandardCharsets.UTF_8).toString();;
    }

    public Login() {
    }

    public Login(String username, String password) {
        this.username = username;
        this.password = password;
    }
}
