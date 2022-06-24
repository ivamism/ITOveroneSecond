package ITOveroneSecond.Level4.Lesson7JDBC.model;

public class City {
    public int id;
    public String name;

    public City(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public City(String name) {
        this.name = name;
    }

    public City() {
    }

    @Override
    public String toString() {
        return "City {" +
                "id = " + id +
                ", name = '" + name + '\'' +
                '}';
    }
}
