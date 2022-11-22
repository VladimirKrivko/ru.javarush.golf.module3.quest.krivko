package ru.javarush.golf.quest.model;

import java.util.List;

public class GameQuest {
    public static final String FINAL_WIN_MESSAGE = "Victory!";
    public static final String FINAL_LOST_MESSAGE = "You lost.";
    private final List<Question> questions;
    private Integer indexQuestion = 0;

    public GameQuest(List<Question> questions) {
        this.questions = questions;
    }

    public boolean hasNextQuestion() {
        return indexQuestion < questions.size();
    }

    public Question getNextQuestion() {
        return questions.get(indexQuestion++);
    }

    public Integer getIndexQuestion() {
        return indexQuestion;
    }

    public void resetIndexQuestion() {
        indexQuestion = 0;
    }
}