package ITOveroneSecond.Level4.Lesson7JDBC.JDBCUsage;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBConnection {
    public static Connection getConnection () throws IOException, ClassNotFoundException, SQLException {
        Properties properties = new Properties();
        properties.load(new FileInputStream("src/main/resources/jdbc.properties"));
        Class.forName(properties.getProperty("driver-class-name"));
        // 2: url, login, password
        String url = properties.getProperty("url");
        String login = properties.getProperty("login");
        String password = properties.getProperty("password");
        Connection connection = DriverManager.getConnection(url, login, password);
        return DriverManager.getConnection(url, login, password);
    }
}
