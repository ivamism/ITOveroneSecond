package ITOveroneSecond.Level4.Lesson8.repository;

import ITOveroneSecond.Level4.Lesson8.SessionCreator;
import ITOveroneSecond.Level4.Lesson8.model.Person;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class PersonRepository {
    public void add(Person person) {
        Session session = SessionCreator.getSession();
        Transaction transaction = session.beginTransaction();
        session.persist(person);
        transaction.commit();
        session.close();
    }

    public Person getByID(int id) {
        Session session = SessionCreator.getSession();
        Person foundPerson = session.get(Person.class, id);
        session.close();
        return foundPerson;

    }

    public List<Person> getALL() {
        Session session = SessionCreator.getSession();
        List<Person> people = (List<Person>) session.createQuery("from Person", Person.class)
                .list();

        session.close();
        return people;
    }

    public void update(Person person) {
        Session session = SessionCreator.getSession();
        Transaction transaction = session.beginTransaction();
        session.update(person);
        transaction.commit();
        session.close();
    }

    public void delete(Person person) {
        Session session = SessionCreator.getSession();
        Transaction transaction = session.beginTransaction();
        session.delete(person);
        transaction.commit();
        session.close();
    }
}
