package ITOveroneSecond.Level4.Lesson7JDBC.repositoty;

import ITOveroneSecond.Level4.Lesson7JDBC.model.City;
import ITOveroneSecond.Level4.Lesson7JDBC.model.Person;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class PersonRepository {
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
//    public void add (City city) throws IOException, ClassNotFoundException, SQLException {
//        // 1,2
//        Connection connection = getConnection();
//        // 3
//        String sql = "insert into city (name) values (?)";
//        PreparedStatement statement = connection.prepareStatement(sql);
//        statement.setString(1, city.name);
//        // 4
//        statement.execute();
////         6
//        connection.close();
//    }

    //    Read
    public Person getById(int id) throws SQLException, IOException, ClassNotFoundException {
        Connection connection = getConnection();
        // 3
        String sql = "select person.id, person.name, age, city.id as cityID, city.name as cityName from person join city on person.city_id = city.id where person.id = ?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setInt(1, id);
        // 4
        statement.execute();
        // 5
        Person person = new Person();
        ResultSet resultSet = statement.getResultSet();
        if (resultSet.next()) {
            String name = resultSet.getString("name");
            int age = resultSet.getInt("age");
            int cityID = resultSet.getInt("cityID");
            String cityName = resultSet.getString("cityName");
            person.id = id;
            person.name = name;
            person.age = age;
            City city = new City();
            city.id = cityID;
            city.name = cityName;
            person.city = city;


//            String sql2 = "select * from city where id = cityID";
//            PreparedStatement statement2 = connection.prepareStatement(sql2);
////            statement.setInt(1, id);
//            // 4
//            statement2.execute();
//            // 5
//            City city = new City();
//            ResultSet resultSet2 = statement.getResultSet();
//            if (resultSet2.next()) {
//                String cityName = resultSet.getString("name");
//                city.id = cityID;
//                city.name = cityName;
//                person.city = city;
//            }


//
//            ResultSet cityResultSet = statement.getResultSet();
//            if (resultSet.next()) {
//                String cityName = cityResultSet.getString("name");
//                city.id = ;
//                city.name = name;
//                cityResultSet.close();
//                person.city = city;
//            }
        }
        // 6
        connection.close();
        return person;
    }
//    public List<City> getAll() throws SQLException, IOException, ClassNotFoundException {
//        Connection connection = getConnection();
//        // 3
//        String sql = "select * from city";
//        PreparedStatement statement = connection.prepareStatement(sql);
//        // 4
//        statement.execute();
//        // 5
//        List<City> cities = new ArrayList<>();
//        ResultSet resultSet = statement.getResultSet();
//        while (resultSet.next()) {
//            int id = resultSet.getInt("id");
//            String name = resultSet.getString("name");
//
//            City receivedCity = new City(id, name);
//            cities.add(receivedCity);
//        }
//        // 6
//        connection.close();
//
//        return cities;
//    }
//    public void update(City city) throws IOException, ClassNotFoundException, SQLException {
//        Connection connection = getConnection();
//        // 3
//        String sql = "update city set name = ? where id = ?";
//        PreparedStatement statement = connection.prepareStatement(sql);
//        statement.setString(1, city.name);
//        statement.setInt(2, city.id);
//        // 4
//        statement.execute();
//        // 6
//        connection.close();
//    }
//    public void delete(int id) throws SQLException, IOException, ClassNotFoundException {
//        Connection connection = getConnection();
//        // 3
//        String sql = "delete from city where id = ?";
//        PreparedStatement statement = connection.prepareStatement(sql);
//        statement.setInt(1, id);
//        // 4
//        statement.execute();
//        // 6
//        connection.close();
//    }
}
