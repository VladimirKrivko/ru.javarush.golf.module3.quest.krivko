package ru.javarush.golf.quest.config_provider;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.Map;

public class PropertiesSessionFactoryProvider implements SessionFactoryProvider{
    @Override
    public SessionFactory getSessionFactory() {
        return new Configuration().addAnnotatedClass(ru.javarush.golf.quest.model.Question.class).buildSessionFactory();
    }
}
