package ru.javarush.golf.quest.repository;

import ru.javarush.golf.quest.model.Question;

import java.util.*;

public class RepositoryQuestion {

    private static final List<Question> questions = new LinkedList<>();

    static {
        // создание и наполнение списка вопросами
        questions.add(new Question(1, "Кого называют \"Царь зверей\"?", "лев", List.of("медведь", "волк", "слон")));
        questions.add(new Question(2, "Сколько лапок у паука?", "8", List.of("4", "6", "9")));
        questions.add(new Question(3, "Какая нота идет перед нотой \"До\"?", "си", List.of("ре", "ми", "соль")));
        questions.add(new Question(4, "Как называют замерзшую воду?", "лед", List.of("струя", "пар", "леденец")));
        questions.add(new Question(5, "Как называется сумка у туриста?", "рюкзак", List.of("авоська", "барсетка", "портфель")));
    }

    public List<Question> getQuestions() {
        return questions;
    }
}
