package ru.javarush.golf.quest.repository;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import ru.javarush.golf.quest.model.Question;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertSame;

@ExtendWith(MockitoExtension.class)
class RepositoryQuestionTest {

    @Mock
    RepositoryQuestion repository;

    private final List<Question> questions = List.of(   new Question("testQuestion1", "testCorrectlyAnswer", List.of("testAnswer", "testAnswer", "testCorrectlyAnswer")),
                                                        new Question("testQuestion2", "testCorrectlyAnswer", List.of("testAnswer", "testAnswer", "testCorrectlyAnswer")),
                                                        new Question("testQuestion3", "testCorrectlyAnswer", List.of("testAnswer", "testAnswer", "testCorrectlyAnswer"))
    );

    @Test
    void getQuestionsShouldBeReturnListQuestions() {
        Mockito.when(repository.getQuestions()).thenReturn(questions);
        List<Question> expected = questions;
        List<Question> actual = repository.getQuestions();              // чот нагородил! и в чем смысл?!

        assertSame(expected, actual);
    }
}