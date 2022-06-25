package ITOveroneSecond.Level4.Lesson7JDBC.JDBCUsage.repositoty;

import ITOveroneSecond.Level4.Lesson7JDBC.JDBCUsage.model.City;
import ITOveroneSecond.Level4.Lesson7JDBC.JDBCUsage.model.Person;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import static ITOveroneSecond.Level4.Lesson7JDBC.JDBCUsage.DBConnection.getConnection;

public class PersonRepository {

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
        }
        // 6
        connection.close();
        return person;
    }

    public List<Person> getAll() throws SQLException, IOException, ClassNotFoundException {
        Connection connection = getConnection();
        // 3
        String sql = "SELECT person.id AS Id, person.name, age, city.id AS cityID, city.name AS cityName FROM person JOIN city ON person.city_id = city.id";
        PreparedStatement statement = connection.prepareStatement(sql);
        // 4
        statement.execute();
        // 5
        List<Person> persons = new ArrayList<>();
        ResultSet resultSet = statement.getResultSet();
        while (resultSet.next()) {
//            int id = resultSet.getInt("ID");
            String name = resultSet.getString("name");
            int age = resultSet.getInt("age");
            int id = resultSet.getInt("Id");
            int cityID = resultSet.getInt("cityID");
            String cityName = resultSet.getString("cityName");
            City city = new City();
            city.id = cityID;
            city.name = cityName;
            Person receivedPerson = new Person(id,name, age,city);
            persons.add(receivedPerson);
        }
        // 6
        connection.close();

        return persons;
    }
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
