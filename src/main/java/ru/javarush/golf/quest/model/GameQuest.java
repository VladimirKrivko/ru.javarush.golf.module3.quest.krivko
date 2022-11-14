package ru.javarush.golf.quest.model;

import ru.javarush.golf.quest.repository.RepositoryQuestion;

import java.util.List;
import java.util.Objects;

public class GameQuest {
    private final List<Question> questions;

    private final String finalWinMessage = "Victory!";

    private final String finalLostMessage = "You lost.";

    public GameQuest(RepositoryQuestion questions) {
        this.questions = questions.getQuestions();
    }

    public boolean hasNextQuestion() {
        return Objects.nonNull(questions);
    }

    public Question getNextQuestion() {
        return questions.remove(0);
    }

}
