package com.chaitanya.hibernate.d1.sr_006_oneToOne;

import jakarta.persistence.*;

@Entity
public class Question {

    @Id
    @Column(name="question_id")
    private int id;
    private String question;
    @OneToOne
    @JoinColumn(name = "answer_id")
    private Answer answer;

    public Question() {
    }

    public Question(int id, String question, Answer answer) {
        this.id = id;
        this.question = question;
        this.answer = answer;
    }

    public Answer getAnswer() {
        return answer;
    }

    public void setAnswer(Answer answer) {
        this.answer = answer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    @Override
    public String toString() {
        return "Question{" +
                "id=" + id +
                ", question='" + question + '\'' +
                ", answer=" + answer +
                '}';
    }
}
