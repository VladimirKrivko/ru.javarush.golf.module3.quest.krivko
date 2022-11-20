package ru.javarush.golf.quest.model;

import org.junit.jupiter.api.Test;
import ru.javarush.golf.quest.repository.RepositoryQuestion;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class GameQuestTest {

    GameQuest game = new GameQuest(new RepositoryQuestion()); // objectUnderTest

    @Test
    void getFinalWinMessageShouldBeReturnTextFinalWinMessage() {
        String actual = game.getFinalWinMessage();
        String expected = "Victory!";
        assertEquals(expected, actual);
    }

    @Test
    void getFinalLostMessageShouldBeReturnTextFinalLostMessage() {
        String actual = game.getFinalLostMessage();
        String expected = "You lost.";
        assertEquals(expected, actual);
    }

    @Test
    void hasNextQuestionShouldBeReturnTrueWhenNextQuestionIsPresent() {
        boolean actual = game.hasNextQuestion();
        assertTrue(actual);
    }

    @Test
    void getNextQuestion() {
        Integer indexQuestion = game.getIndexQuestion();
        int sizeCollection = game.getQuestions().size();
        assertTrue(indexQuestion < sizeCollection);
    }

    @Test
    void getNextQuestionIncrementCurrentIndexQuestion() {
        game.getNextQuestion();
        Integer actual = game.getIndexQuestion();
        assertEquals(1, actual);
    }

    @Test
    void resetIndexQuestionSetsValueOfTheVariableToZero() {
        game.getNextQuestion();
        game.hasNextQuestion();
        game.resetIndexQuestion();
        Integer actual = game.getIndexQuestion();
        Integer expected = 0;
        assertEquals(expected, actual);
    }
}