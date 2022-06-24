package ITOveroneSecond.Level4.Lesson7JDBC.model;

public class Person {
        public int id;
        public String name;
        public int age;
        public City city;

        public Person (int id, String name, int age, City city) {
            this.id = id;
            this.name = name;
            this.age = age;
            this.city = city;
        }

    public Person() {
    }

    @Override
    public String toString() {
        return "Person {" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", city=" + city +
                '}';
    }
}
