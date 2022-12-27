package ru.javarush.golf.quest.model;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class QuestionTest {

    private final Question question = new Question("testTextQuestion", "testCorrectlyAnswer", List.of("testAnswer1", "testAnswer2", "testCorrectlyAnswer"));

    @Test
    void getTextQuestionShouldBeReturnTextQuestion() {
        String actual = question.getTextQuestion();
        String expected = "testTextQuestion";
        assertEquals(expected, actual);
    }

    @Test
    void getCorrectlyAnswerShouldBeReturnTextCorrectlyAnswerToLowerCase() {
        String actual = question.getCorrectlyAnswer();
        String expected = "testcorrectlyanswer";
        assertEquals(expected, actual);
    }

    @Test
    void getAnswersShouldBeReturnListAnswers() {
        List<String> actual = question.getAnswers();
        List<String> expected = List.of("testAnswer1", "testAnswer2", "testCorrectlyAnswer");
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @ValueSource(strings = {"correto", "noCoReCto", "123kuKareKto", " koko .& jacoco"})
    void isCorrectlyShouldBeReturnFalseIfParameterTextIncorrect(String text) {
        boolean actual = question.isCorrectly(text);
        assertFalse(actual);
    }

    @Test
    void isCorrectlyShouldBeReturnTrueIfParameterTextCorrect() {
        String expected = "testCorrectlyAnswer";
        boolean actual = question.isCorrectly(expected);
        assertTrue(actual);
    }
}