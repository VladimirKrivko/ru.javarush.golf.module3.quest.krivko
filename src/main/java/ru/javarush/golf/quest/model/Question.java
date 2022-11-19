package ru.javarush.golf.quest.model;

import java.util.List;

public class Question {

    private final String textQuestion;
    private final String correctlyAnswer;
    private final List<String> answers;

    public Question(String textQuestion, String correctlyAnswer, List<String> answers) {
        this.textQuestion = textQuestion;
        this.answers = answers;
        this.correctlyAnswer = correctlyAnswer;
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