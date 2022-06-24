package ITOveroneSecond.Level4.Lesson7JDBC.repositoty;

import ITOveroneSecond.Level4.Lesson7JDBC.model.City;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

// 1. добавить драйвер.
// 2. подключиться к бд.
// 3. создать Statement.
// 4. Выполнить запрос.
// 5. Обработать ResultSet.
// 6. Закрыть соединение.

// CRUD: Create - Read - Update - Delete
public class CityRepository {
    //        Create
    public void add (City city) throws IOException, ClassNotFoundException, SQLException {
        // 1,2
        Connection connection = getConnection();

        // 3
        String sql = "insert into city (name) values (?)";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, city.name);
        // 4
        statement.execute();

//         6
        connection.close();
    }
    private Connection getConnection () throws IOException, ClassNotFoundException, SQLException {
        Properties properties = new Properties();
        properties.load(new FileInputStream("config/jdbc.properties"));
        Class.forName(properties.getProperty("driver-class-name"));
        // 2: url, login, password
        String url = properties.getProperty("url");
        String login = properties.getProperty("login");
        String password = properties.getProperty("password");
        Connection connection = DriverManager.getConnection(url, login, password);
        return DriverManager.getConnection(url, login, password);
    }
    public City getById(int id) throws SQLException, IOException, ClassNotFoundException {
        Connection connection = getConnection();
        // 3
        String sql = "select * from city where id = ?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setInt(1, id);
        // 4
        statement.execute();
        // 5
        City city = new City();
        ResultSet resultSet = statement.getResultSet();
        if (resultSet.next()) {
            String name = resultSet.getString("name");
            city.id = id;
            city.name = name;
        }

        // 6
        connection.close();

        return city;
    }
}

