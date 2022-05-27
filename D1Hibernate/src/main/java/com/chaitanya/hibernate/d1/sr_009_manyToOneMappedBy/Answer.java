package com.chaitanya.hibernate.d1.sr_009_manyToOneMappedBy;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Answer {

    @Id
    @Column(name = "answer_id")
    private int id;

    private String answer;

    @ManyToOne
    private Question question;

    public Answer(int id, String answer, Question question) {
        this.id = id;
        this.answer = answer;
        this.question = question;
    }

    public Question getQuestion() {
        return question;
    }

    public void setQuestionionare(Question question) {
        this.question = question;
    }

    public Answer() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    @Override
    public String toString() {
        return "Answer{" +
                "id=" + id +
                ", answer='" + answer + '\'' +
                '}';
    }
}
