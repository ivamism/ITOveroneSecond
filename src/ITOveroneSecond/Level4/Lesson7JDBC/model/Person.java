package ITOveroneSecond.Level4.Lesson7JDBC.model;

public class Person {
        public int id;
        public String name;
        public int age;
//        public  int cityID;
        public City city;

    public Person(int id, String name, int age, int cityID, City city) {
        this.id = id;
        this.name = name;
        this.age = age;
//        this.cityID = cityID;
        this.city = city;
    }

    public Person() {
    }

//    public Person(String name, int age, int cityID, City city) {
//        this.name = name;
//        this.age = age;
//        this.cityID = cityID;
//        this.city = city;
//    }

    public Person(String name, int age, City city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(String name) {
        this.name = name;
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
