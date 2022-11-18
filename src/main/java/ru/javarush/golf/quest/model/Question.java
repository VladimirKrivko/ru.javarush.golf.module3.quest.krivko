package ru.javarush.golf.quest.model;

import java.io.Serializable;
import java.util.List;

public class Question implements Serializable {

    private static final long serialVersionUID = 1L;
    private final int id;

    private final int nextID;
    private final String textQuestion;
    private final String correctlyAnswer;
    private final List<String> answers;

    public Question(int id, int nextID, String textQuestion, String correctlyAnswer, List<String> answers) {
        this.id = id;
        this.nextID = nextID;
        this.textQuestion = textQuestion;
        this.answers = answers;
        this.correctlyAnswer = correctlyAnswer;
    }

    public int getId() {
        return id;
    }

    public String getTextQuestion() {
        return textQuestion;
    }

    public String getCorrectlyAnswer() {
        return correctlyAnswer.toLowerCase();
    }

    public List<String> getAnswers() {
        return answers;
    }

    public boolean isCorrectly(String userAnswer) {
        return getCorrectlyAnswer().equals(userAnswer.toLowerCase());
    }
}