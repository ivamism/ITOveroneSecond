package ITOveroneSecond.Level4.Lesson7JDBC;

import ITOveroneSecond.Level4.Lesson7JDBC.model.City;
import ITOveroneSecond.Level4.Lesson7JDBC.repositoty.CityRepository;

import java.io.IOException;
import java.sql.SQLException;

public class RepositoryUsage {
    public static void main(String[] args) throws SQLException, IOException, ClassNotFoundException {
        CityRepository repository = new CityRepository();
//        City london = new City("London");
        City newYork = new City("New York");
        repository.add(newYork);
    }
}
