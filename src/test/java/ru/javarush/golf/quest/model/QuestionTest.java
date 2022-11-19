package ru.javarush.golf.quest.model;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class QuestionTest {
    Question question = new Question("testTextQuestion", "testCorrectlyAnswer", List.of("testAnswer1", "testAnswer2", "testCorrectlyAnswer"));

    @Test
    void getTextQuestion() {
        String actual = question.getTextQuestion();
        String expected = "testTextQuestion";
        assertEquals(expected, actual);
    }

    @Test
    void getCorrectlyAnswer() {
        String actual = question.getCorrectlyAnswer();
        String expected = "testcorrectlyanswer";
        assertEquals(expected, actual);
    }

    @Test
    void getAnswers() {
        List<String> actual = question.getAnswers();
        List<String> expected = List.of("testAnswer1", "testAnswer2", "testCorrectlyAnswer");
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @ValueSource(strings = {"correcto", "noCoReCto", "123kuKareKto", " koko .& jacoco"})
    void isFalseCorrectly(String text) {
        boolean actual = question.isCorrectly(text);
        assertFalse(actual);
    }

    @Test
    void isTrueCorrectly() {
        String expected = "testCorrectlyAnswer";
        boolean actual = question.isCorrectly(expected);
        assertTrue(actual);
    }
}