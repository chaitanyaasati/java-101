package com.chaitanya.hibernate.d1.sr_007_oneToOneMappedBy;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Answer {

    @Id
    @Column(name = "answer_id")
    private int id;

    private String answer;

    @OneToOne(mappedBy = "answer")
    private Question question;

    public Answer(int id, String answer, Question question) {
        this.id = id;
        this.answer = answer;
        this.question = question;
    }

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
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
