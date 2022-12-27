package ru.javarush.golf.quest.repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import ru.javarush.golf.quest.config_provider.PropertiesSessionFactoryProvider;
import ru.javarush.golf.quest.model.Question;

import java.util.ArrayList;
import java.util.List;

public class RepositoryQuestion {

    private final List<Question> questions = new ArrayList<>();

    public RepositoryQuestion() {
        init();
    }

    public List<Question> getQuestions() {
        return questions;
    }

    private void init() {
        PropertiesSessionFactoryProvider properties = new PropertiesSessionFactoryProvider();
        SessionFactory sessionFactory = properties.getSessionFactory();
        Session session = sessionFactory.openSession();

        Query<Question> query = session.createQuery("FROM Question", Question.class);
        List<Question> resultList = query.getResultList();
        for (Question question : resultList) {
            questions.add(question);
        }
    }

    // удолить!!!
    public static void main(String[] args) {
        PropertiesSessionFactoryProvider properties = new PropertiesSessionFactoryProvider();
        SessionFactory sessionFactory = properties.getSessionFactory();
        Session session = sessionFactory.openSession();

        /*
        Transaction transaction = session.beginTransaction();

        session.persist(new Question("Кого называют \"Царь зверей\"?", "лев", List.of("медведь", "волк", "лев", "слон")));
        session.persist(new Question("Сколько лапок у паука?", "8", List.of("4", "6", "9", "8")));
        session.persist(new Question("Какая нота идет перед нотой \"До\"?", "си", List.of("ре", "си", "ми", "соль")));
        session.persist(new Question("Как называют замерзшую воду?", "лед", List.of("струя", "пар", "леденец", "лед")));
        session.persist(new Question("Как называется сумка у туриста?", "рюкзак", List.of("рюкзак", "авоська", "барсетка", "портфель")));
        System.out.println("ok");

        transaction.commit();
        */

        Query<Question> query = session.createQuery("FROM Question", Question.class);
        List<Question> resultList = query.getResultList();
        for (Question question : resultList) {
            System.out.println(question);
        }
    }
}