package com.chaitanya.springcore.e1.sr_003_injectingReferenceSetter;

public class College{
    private String name;
    private int ranking;

    public College() {
        System.out.println("I am College's default Constructor");
    }

    public College(String name, int ranking) {
        System.out.println("I am College's parameterized constructor");
        System.out.println("I am setting College's object all instance variables");
        this.name = name;
        this.ranking = ranking;
    }

    public void setName(String name) {
        System.out.println("Setting college's name");
        this.name = name;
    }

    public void setRanking(int ranking) {
        System.out.println("Setting college's ranking");
        this.ranking = ranking;
    }

    @Override
    public String toString() {
        return "College{" +
                "name='" + name + '\'' +
                ", ranking=" + ranking +
                '}';
    }
}
