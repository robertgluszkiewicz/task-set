package homework.bank.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConnectionProperties {
    private String url;
    private String user;
    private String password;
    private final String path = "src/main/resources/connection.properties";

    public ConnectionProperties() {
        getProperties();
    }

    public String getUrl() {
        return url;
    }

    public String getUser() {
        return user;
    }

    public String getPassword() {
        return password;
    }

    private void getProperties() {
        Properties properties = new Properties();
        try {
            properties.load(new FileInputStream(path));
        } catch (IOException e) {
            System.out.println("Error:" + e.getMessage());;
        }
        url = properties.getProperty("db.url");
        user = properties.getProperty("db.user");
        password = properties.getProperty("db.password");
    }
}
