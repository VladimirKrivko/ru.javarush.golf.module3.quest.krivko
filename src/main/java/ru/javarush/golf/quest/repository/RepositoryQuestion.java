package ru.javarush.golf.quest.repository;

import ru.javarush.golf.quest.model.Question;

import java.util.*;

public class RepositoryQuestion {

    private static final List<Question> QUESTIONS = new ArrayList<>();

    static {
        // создание и наполнение списка вопросами
        QUESTIONS.add(new Question(0, 1, "Кого называют \"Царь зверей\"?", "лев", List.of("медведь", "волк", "лев", "слон")));
        QUESTIONS.add(new Question(1, 2,"Сколько лапок у паука?", "8", List.of("4", "6", "9", "8")));
        QUESTIONS.add(new Question(2, 3,"Какая нота идет перед нотой \"До\"?", "си", List.of("ре", "си", "ми", "соль")));
        QUESTIONS.add(new Question(3, 4,"Как называют замерзшую воду?", "лед", List.of("струя", "пар", "леденец", "лед")));
        QUESTIONS.add(new Question(4, 0,"Как называется сумка у туриста?", "рюкзак", List.of("рюкзак", "авоська", "барсетка", "портфель")));
    }

    public List<Question> getQuestions() {
        return QUESTIONS;
    }
}
