package ITOveroneSecond.Level4.Lesson7JDBC.repositoty;

import ITOveroneSecond.Level4.Lesson7JDBC.model.City;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

// Порядок работы с БД
// 1. добавить драйвер.
// 2. подключиться к бд.
// 3. создать Statement.
// 4. Выполнить запрос.
// 5. Обработать ResultSet.
// 6. Закрыть соединение.

// 1,2 Подключение к БД
public class CityRepository {
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
    // CRUD: Create - Read - Update - Delete
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

//    Read
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
    public List<City> getAll() throws SQLException, IOException, ClassNotFoundException {
        Connection connection = getConnection();
        // 3
        String sql = "select * from city";
        PreparedStatement statement = connection.prepareStatement(sql);
        // 4
        statement.execute();
        // 5
        List<City> cities = new ArrayList<>();
        ResultSet resultSet = statement.getResultSet();
        while (resultSet.next()) {
            int id = resultSet.getInt("id");
            String name = resultSet.getString("name");

            City receivedCity = new City(id, name);
            cities.add(receivedCity);
        }
        // 6
        connection.close();

        return cities;
    }
    public void update(City city) throws IOException, ClassNotFoundException, SQLException {
        Connection connection = getConnection();
        // 3
        String sql = "update city set name = ? where id = ?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, city.name);
        statement.setInt(2, city.id);
        // 4
        statement.execute();
        // 6
        connection.close();
    }
    public void delete(int id) throws SQLException, IOException, ClassNotFoundException {
        Connection connection = getConnection();
        // 3
        String sql = "delete from city where id = ?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setInt(1, id);
        // 4
        statement.execute();
        // 6
        connection.close();
    }
}

