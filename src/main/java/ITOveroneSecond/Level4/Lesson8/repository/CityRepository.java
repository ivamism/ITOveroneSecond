package ITOveroneSecond.Level4.Lesson8.repository;

import ITOveroneSecond.Level4.Lesson8.model.City;
import ITOveroneSecond.Level4.Lesson8.SessionCreator;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class CityRepository {
    public void add(City city) {
        Session session = SessionCreator.getSession();
        Transaction transaction = session.beginTransaction();
        session.persist(city);
        transaction.commit();
        session.close();
    }

    public City getByID(int id) {
        Session session = SessionCreator.getSession();
        City foundCity = session.get(City.class, id);
        session.close();
        return foundCity;
    }
    public List<City> getALL() {
        Session session = SessionCreator.getSession();
        List <City> cities = (List<City>) session.createQuery("from City",City.class )
                .list();

        session.close();
        return cities;
    }

    public void update (City city){
        Session session = SessionCreator.getSession();
        Transaction transaction = session.beginTransaction();
        session.update(city);
        transaction.commit();
        session.close();
    }
    public void delete (City city){
        Session session = SessionCreator.getSession();
        Transaction transaction = session.beginTransaction();
        session.delete(city);
        transaction.commit();
        session.close();
    }
}
