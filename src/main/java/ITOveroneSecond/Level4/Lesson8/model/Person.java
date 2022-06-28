package ITOveroneSecond.Level4.Lesson8.model;


import ITOveroneSecond.Level4.Lesson8.model.City;
import jakarta.persistence.*;

@Entity
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int id;
    public String name;
    public int age;
    @ManyToOne
    public City city;

    public Person() {
    }

    public Person(int id, String name, int age, City city) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.city = city;
    }

    public Person(String name, int age, City city ) {
        this.name = name;
        this.age = age;
        this.city = city;
    }

    public Person(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", city=" + city +
                '}';
    }
}
