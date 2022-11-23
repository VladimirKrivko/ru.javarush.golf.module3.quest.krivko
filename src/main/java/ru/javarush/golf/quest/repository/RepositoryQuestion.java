package ru.javarush.golf.quest.repository;

import ru.javarush.golf.quest.model.Question;

import java.util.ArrayList;
import java.util.List;

public class RepositoryQuestion {

    public static final List<Question> QUESTIONS = new ArrayList<>();

    static {
        QUESTIONS.add(new Question("Кого называют \"Царь зверей\"?", "лев", List.of("медведь", "волк", "лев", "слон")));
        QUESTIONS.add(new Question("Сколько лапок у паука?", "8", List.of("4", "6", "9", "8")));
        QUESTIONS.add(new Question("Какая нота идет перед нотой \"До\"?", "си", List.of("ре", "си", "ми", "соль")));
        QUESTIONS.add(new Question("Как называют замерзшую воду?", "лед", List.of("струя", "пар", "леденец", "лед")));
        QUESTIONS.add(new Question("Как называется сумка у туриста?", "рюкзак", List.of("рюкзак", "авоська", "барсетка", "портфель")));
    }

    private RepositoryQuestion() {
        throw new IllegalStateException("Utility class");
    }
}