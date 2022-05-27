package com.chaitanya.hibernate.d1.sr_004_Embeddable;

import jakarta.persistence.Embeddable;

@Embeddable
public class Certificate {
    String course;
    String duration;

    public Certificate() {
    }

    public Certificate(String course, String duration) {
        this.course = course;
        this.duration = duration;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "Certificate{" +
                "course='" + course + '\'' +
                ", duration='" + duration + '\'' +
                '}';
    }
}