package org.example;

import org.example.model.Person;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;


public class App {
    public static void main(String[] args) {
        Configuration configuration = new Configuration().addAnnotatedClass(Person.class);

        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.getCurrentSession();

        try {
            session.beginTransaction();

            session.createQuery("delete from Person where age < 30").executeUpdate();
            List<Person> people = session.createQuery("from Person ").getResultList();

            for (Person person : people) {
                System.out.println(person);
            }

        } finally {
            sessionFactory.close();
        }
    }
}
