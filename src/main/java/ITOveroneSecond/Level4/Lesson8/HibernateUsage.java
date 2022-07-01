package ITOveroneSecond.Level4.Lesson8;

import ITOveroneSecond.Level4.Lesson8.model.City;
import ITOveroneSecond.Level4.Lesson8.model.Person;
import ITOveroneSecond.Level4.Lesson8.repository.CityRepository;
import ITOveroneSecond.Level4.Lesson8.repository.PersonRepository;

import java.util.List;

public class HibernateUsage {
    public static void main(String[] args) {
//        Session session = SessionCreator.getSession();
        CityRepository cityRepository =new CityRepository();
//        cityRepository.add(new City("Vitebsk"));
        /*cityRepository.add(new City("Berlin"));
        cityRepository.add(new City("Hrodna"));
        cityRepository.add(new City("Brest"));
        cityRepository.add(new City("Piter"));*/
//        City city = cityRepository.getByID(2);
//        System.out.println(city);
//        cityRepository.update(new City(2, "Vitebsk"));
//        cityRepository.delete(new City(5));
        List<City> cities = cityRepository.getALL();
        System.out.println(cities);
//        PersonRepository personRepository = new PersonRepository();
//        personRepository.add(new Person(  "polina", 18, new City(2)));
//        personRepository.add(new Person(  "John", 50, new City(1)));
//        personRepository.add(new Person(  "Jack", 25, new City(4)));
//        personRepository.add(new Person(  "Natalie", 40, new City(3)));
//        Person person = personRepository.getByID(2);
//        personRepository.update(new Person(4, "Ksenia", 20, new City(1)));
//        personRepository.update(new Person(2, "Polina", 18, new City(2)));
//        personRepository.delete(new Person(6));
//        List<Person> people = personRepository.getALL();
//        System.out.println(people);
    }
}
