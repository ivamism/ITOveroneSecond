package ITOveroneSecond.Level4.Lesson7JDBC;

import ITOveroneSecond.Level4.Lesson7JDBC.model.City;
import ITOveroneSecond.Level4.Lesson7JDBC.model.Person;
import ITOveroneSecond.Level4.Lesson7JDBC.repositoty.CityRepository;
import ITOveroneSecond.Level4.Lesson7JDBC.repositoty.PersonRepository;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public class RepositoryUsage {
    public static void main(String[] args) throws SQLException, IOException, ClassNotFoundException {


        PersonRepository repository = new PersonRepository();
//        CityRepository repository = new CityRepository();
//        City city = new City(5, "Vitebsk");
//        City newYork = new City("New York");
//        repository.add(newYork);
        Person receivedPerson = repository.getById(5);
        System.out.println("Получил данные пользователя из базы данных: " + receivedPerson);
//        repository.delete(9);

//        List<City> cities = repository.getAll();
//        System.out.println("Получил все города из базы данных: " + cities);
    }
}
