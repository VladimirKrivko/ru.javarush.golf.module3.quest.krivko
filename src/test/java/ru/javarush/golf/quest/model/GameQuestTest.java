package ru.javarush.golf.quest.model;

import org.junit.jupiter.api.Test;
import org.mockito.MockedStatic;
import org.mockito.Mockito;
import ru.javarush.golf.quest.repository.RepositoryQuestion;

import static org.junit.jupiter.api.Assertions.*;

class GameQuestTest {

    MockedStatic<RepositoryQuestion> mockedStatic = Mockito.mockStatic(RepositoryQuestion.class);

    GameQuest game = new GameQuest((RepositoryQuestion) mockedStatic);

    @Test
    void getFinalWinMessage() {
    }

    @Test
    void getFinalLostMessage() {
    }

    @Test
    void hasNextQuestion() {
    }

    @Test
    void getNextQuestion() {
    }

    @Test
    void resetIndexQuestion() {
    }
}