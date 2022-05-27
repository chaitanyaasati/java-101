package com.chaitanya.springcore.e1.sr_004_injectingReferenceConstructor;

import java.util.Set;

public class College {
    private String name;
    private int ranking;
    private Set<String> companies;

    public College() {
        System.out.println("I am College's default constructor");
    }

    public College(String name, int ranking, Set<String> companies) {
        System.out.println("I am College's parameterized constructor");
        System.out.println("I am initializing College object's all instance variable");
        this.name = name;
        this.ranking = ranking;
        this.companies = companies;
    }

    @Override
    public String toString() {
        return "College{" +
                "name='" + name + '\'' +
                ", ranking=" + ranking +
                ", companies=" + companies +
                '}';
    }
}
