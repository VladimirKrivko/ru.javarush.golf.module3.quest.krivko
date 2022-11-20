package ru.javarush.golf.quest.model;

import ru.javarush.golf.quest.repository.RepositoryQuestion;

import java.util.List;

public class GameQuest {

    private final List<Question> questions;

    private final String FINAL_WIN_MESSAGE = "Victory!";

    private final String FINAL_LOST_MESSAGE = "You lost.";

    private Integer indexQuestion = 0;

    public GameQuest(RepositoryQuestion repositoryQuestion) {
        this.questions = repositoryQuestion.getQuestions();
    }

    public String getFinalWinMessage() {
        return FINAL_WIN_MESSAGE;
    }

    public String getFinalLostMessage() {
        return FINAL_LOST_MESSAGE;
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

    public List<Question> getQuestions() {
        return questions;
    }

    public void resetIndexQuestion() {
        indexQuestion = 0;
    }
}