package ITOveroneSecond.Level4.Lesson7JDBC;

import ITOveroneSecond.Level4.Lesson7JDBC.model.City;
import ITOveroneSecond.Level4.Lesson7JDBC.repositoty.CityRepository;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public class RepositoryUsage {
    public static void main(String[] args) throws SQLException, IOException, ClassNotFoundException {
        CityRepository repository = new CityRepository();
        City city = new City(5, "Vitebsk");
//        City newYork = new City("New York");
//        repository.add(newYork);
        City receivedCity = repository.getById(5);
        System.out.println("Получил город из базы данных: " + receivedCity);
        System.out.println("Меняю название города: " + receivedCity + " на: " + city);
        repository.update(city);


        List<City> cities = repository.getAll();
        System.out.println("Получил все города из базы данных: " + cities);
    }
}
