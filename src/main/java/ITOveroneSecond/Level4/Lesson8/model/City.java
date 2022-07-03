package ITOveroneSecond.Level4.Lesson8.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

    @Entity
    public class City {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        public int id;
        public String name;

        public City(String name) {
            this.name = name;
        }

        public City(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public City(int id) {
            this.id = id;
        }

        public City() {
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "City{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    '}';
        }
    }

