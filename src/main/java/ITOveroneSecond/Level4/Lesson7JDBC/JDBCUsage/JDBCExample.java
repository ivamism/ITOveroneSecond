package ITOveroneSecond.Level4.Lesson7JDBC.JDBCUsage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

public class JDBCExample {
    // 1. добавить драйвер.
// 2. подключиться к бд.
// 3. создать Statement.
// 4. Выполнить запрос.
// 5. Обработать ResultSet.
// 6. Закрыть соединение.
    public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {
        // 1
        Properties properties = new Properties();
        properties.load(new FileInputStream("src/main/resources/jdbc.properties"));
        Class.forName(properties.getProperty("driver-class-name"));
        // 2: url, login, password
        String url = properties.getProperty("url");
        String login = properties.getProperty("login");
        String password = properties.getProperty("password");
        Connection connection = DriverManager.getConnection(url, login, password);
        // 3
        String sql = "select * from city";
        PreparedStatement statement = connection.prepareStatement(sql);
        // 4
        statement.execute();
        // 5
        ResultSet resultSet = statement.getResultSet();
        while (resultSet.next()) {
            int id = resultSet.getInt("id");
            String name = resultSet.getString("name");
            System.out.println(id + " " + name);
        }
        // 6
        connection.close();
    }
//    public static void main(String[] args) throws ClassNotFoundException, SQLException {
////        добавить драйвер
//        Class.forName ("org.postgresql.Driver");
//        String url = "jdbc:postgresql://localhost:5432/bank";
//        String login = "postgres";
//        String password = "DerVatter";
//        Connection connection = DriverManager.getConnection(url, login, password);
////
//        String sql = "select * from city";
//        PreparedStatement statement = connection.prepareCall(sql);
////
//        statement.execute();
////        обработать запрос
//        ResultSet resultSet = statement.getResultSet();
//        while (resultSet.next());
//        int id = resultSet.getInt("id");
//        String name = resultSet.getString("name");
//        System.out.println(id + " " + name);
//        connection.close();
//    }
}
