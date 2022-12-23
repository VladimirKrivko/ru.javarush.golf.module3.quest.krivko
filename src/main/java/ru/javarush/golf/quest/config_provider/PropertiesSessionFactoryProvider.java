package ru.javarush.golf.quest.config_provider;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.Map;

public class PropertiesSessionFactoryProvider implements SessionFactoryProvider{
    @Override
    public SessionFactory getSessionFactory() {
        return new Configuration().buildSessionFactory();
    }

    // удолить!!!
    public static void main(String[] args) {
        PropertiesSessionFactoryProvider properties = new PropertiesSessionFactoryProvider();
        SessionFactory sessionFactory = properties.getSessionFactory();
        for (Map.Entry<String, Object> entry : sessionFactory.getProperties().entrySet()) {
            System.out.println(entry.getKey() + "=" + entry.getValue());
        }
    }
}
