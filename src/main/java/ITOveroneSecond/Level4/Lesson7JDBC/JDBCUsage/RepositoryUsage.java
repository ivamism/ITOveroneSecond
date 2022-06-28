package ITOveroneSecond.Level4.Lesson7JDBC.JDBCUsage;

import ITOveroneSecond.Level4.Lesson7JDBC.JDBCUsage.model.Person;
import ITOveroneSecond.Level4.Lesson7JDBC.JDBCUsage.repositoty.PersonRepository;

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
//        Person receivedPerson = repository.getById(4);
//        System.out.println("Получил данные пользователя из базы данных: " + receivedPerson);
//        repository.delete(9);

//        List<City> cities = repository.getAll();
//        System.out.println("Получил все города из базы данных: " + cities);
        List<Person> persons = repository.getAll();
        System.out.println("Получил из базы данных список всех пользователей: " + persons);
    }
}
