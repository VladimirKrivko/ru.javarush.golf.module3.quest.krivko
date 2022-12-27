package ru.javarush.golf.quest.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table (name = "questions")

@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
@EqualsAndHashCode

@ToString
public class Question {
    @Id
    private String textQuestion;
    @Column
    private String correctlyAnswer;
    @Column (table = "answers")
    @ElementCollection
    private List<String> answers = new ArrayList<>(4);

    /*public Question(String textQuestion, String correctlyAnswer, List<String> answers) {
        this.textQuestion = textQuestion;
        this.answers = answers;
        this.correctlyAnswer = correctlyAnswer;
    }

    public String getTextQuestion() {
        return textQuestion;
    }

    public String getCorrectlyAnswer() {
        return correctlyAnswer;
    }

    public List<String> getAnswers() {
        return answers;
    }*/

    public boolean isCorrectly(String userAnswer) {
        return getCorrectlyAnswer().equalsIgnoreCase(userAnswer);
    }

   /* @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Question question = (Question) o;
        return  textQuestion.equals(question.textQuestion) &&
                correctlyAnswer.equals(question.correctlyAnswer) &&
                answers.equals(question.answers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(textQuestion, correctlyAnswer, answers);
    }*/
}