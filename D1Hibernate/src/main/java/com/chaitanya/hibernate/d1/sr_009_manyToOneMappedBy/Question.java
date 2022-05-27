package com.chaitanya.hibernate.d1.sr_009_manyToOneMappedBy;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Question {

    @Id
    @Column(name="question_id")
    private int id;
    @Column(unique=true)
    private String question;

    @OneToMany(mappedBy = "question")
    private List<Answer> answers;

    public Question() {
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

    public List<Answer> getAnswers() {
        return answers;
    }

    public void setAnswers(List<Answer> answers) {
        this.answers = answers;
    }

    @Override
    public String toString() {
        return "Question{" +
                "id=" + id +
                ", question='" + question + '\'' +
                ", answers=" + answers +
                '}';
    }
}
