package ru.javarush.golf.quest.model;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GameQuestTest {
    private final List<Question> questions = List.of(
            new Question("testTextQuestion0", "testCorrectlyAnswer0", List.of("testAnswer1321", "testAnswer278", "testCorrectlyAnswer0")),
            new Question("testTextQuestion1", "testCorrectlyAnswer1", List.of("testAnswer1231", "testAnswer213", "testCorrectlyAnswer1")),
            new Question("testTextQuestion2", "testCorrectlyAnswer2", List.of("testAnswer7771", "testAnswer254", "testCorrectlyAnswer2"))
            );
    private final GameQuest game = new GameQuest(questions);

    @Test
    void hasNextQuestionShouldBeReturnTrueIfCurrentIndexQuestionLessSizeListQuestion() {
        boolean expected = true;
        boolean actual = game.hasNextQuestion();
        assertEquals(expected, actual);
    }

    @Test
    void getNextQuestionShouldBeReturnNextQuestionFromGameQuest() {
        Question expected = new Question("testTextQuestion0", "testCorrectlyAnswer0", List.of("testAnswer1321", "testAnswer278", "testCorrectlyAnswer0"));
        Question actual = game.getNextQuestion();
        assertEquals(expected, actual);
    }

    @Test
    void getNextQuestionShouldBeIncrementCurrentIndexQuestion() {
        game.getNextQuestion();
        Integer expected = 1;
        Integer actual = game.getIndexQuestion();
        assertEquals(expected, actual);
    }

    @Test
    void resetIndexQuestionSetsValueOfTheIndexQuestionVariableToZero() {
        game.getNextQuestion();     //  indexQuestion = 1;
        game.resetIndexQuestion();  //  indexQuestion = 0;

        Integer actual = game.getIndexQuestion();
        Integer expected = 0;
        assertEquals(expected, actual);
    }
}