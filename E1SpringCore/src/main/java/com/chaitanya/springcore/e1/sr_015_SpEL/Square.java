package com.chaitanya.springcore.e1.sr_015_SpEL;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Square {
    @Value("#{45+45}")
    private int x;
    @Value("#{56-34}")
    private int y;
    @Value("#{T(java.lang.Math).sqrt(25)}")
    private double sqrt;

    @Value("#{T(java.lang.Math).E}")
    private double eval;

    @Value("#{new java.lang.String('Durgesh Tiwari')}")
    private String name;

    @Value("#{8>3}")
    private boolean isActive;

    public Square() {
        System.out.println("I am square default constructor");
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getEval() {
        return eval;
    }

    public void setEval(double eval) {
        this.eval = eval;
    }

    public double getSqrt() {
        return sqrt;
    }

    public void setSqrt(double sqrt) {
        this.sqrt = sqrt;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Square{" +
                "x=" + x +
                ", y=" + y +
                ", sqrt=" + sqrt +
                ", eval=" + eval +
                ", name='" + name + '\'' +
                ", isActive=" + isActive +
                '}';
    }
}
