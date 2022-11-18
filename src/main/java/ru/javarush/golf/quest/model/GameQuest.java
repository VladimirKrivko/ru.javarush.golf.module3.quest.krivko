package ru.javarush.golf.quest.model;

import ru.javarush.golf.quest.repository.RepositoryQuestion;

import java.io.Serializable;
import java.util.List;

public class GameQuest implements Serializable {

    private static final long serialVersionUID = 1L;
    private final List<Question> questions;

    private static final String FINAL_WIN_MESSAGE = "Victory!";

    private static final String FINAL_LOST_MESSAGE = "You lost.";

    private Integer indexQuestion = 0;

    public GameQuest(RepositoryQuestion repositoryQuestion) {
        this.questions = repositoryQuestion.getQuestions();
    }


    public List<Question> getQuestions() {
        return questions;
    }

    public String getFinalWinMessage() {
        return FINAL_WIN_MESSAGE;
    }

    public String getFinalLostMessage() {
        return FINAL_LOST_MESSAGE;
    }

    // TODO: переписать логику на ID

    public boolean hasNextQuestion() {
        if (indexQuestion < questions.size()) {
            indexQuestion++;
            return true;
        }
//        return !questions.isEmpty();
        indexQuestion = 0;
        return false;
    }

    public Question getNextQuestion() {
        return questions.get(indexQuestion);
//        return questions.remove(0);
    }

    public Integer getIndexQuestion() {
        return indexQuestion;
    }

    public void chkIndexQuestion(Integer currentIndex) {
        if (currentIndex >= questions.size()) {
            indexQuestion = 0;
        }
    }
}
