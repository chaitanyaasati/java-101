package com.chaitanya.hibernate.d1.sr_005_oneToOne;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Answer {

    @Id
    @Column(name = "answer_id")
    private int id;
    private String answer;

    public Answer() {
    }

    public Answer(int id, String answer) {
        this.id = id;
        this.answer = answer;
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
