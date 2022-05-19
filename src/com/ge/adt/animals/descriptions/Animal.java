package com.ge.adt.animals.descriptions;

import com.ge.adt.interfaces.AnimalInterface;

public abstract class Animal implements AnimalInterface {
    private String n;
    private String a;
    private String w;
    private String c;

    public String getName() {
        return n;
    }

    public void setName(String n) {
        this.n = n;
    }

    public String getAge() {
        return a;
    }

    public void setAge(String a) {
        this.a = a;
    }

    public String getWeight() {
        return w;
    }

    public void setWeight(String w) {
        this.w = w;
    }

    public String getColor() {
        return c;
    }

    public void setColor(String c) {
        this.c = c;
    }
}
