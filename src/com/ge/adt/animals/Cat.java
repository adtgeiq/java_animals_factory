package com.ge.adt.animals;

import com.ge.adt.animals.descriptions.Animal;

public class Cat extends Animal {
    @Override
    public String makeASound() {
        return "Meaow";
    }

    @Override
    public String walk() {
        return "stealthily";
    }

    @Override
    public void setName(String n) {
        super.setName(n);
    }
}
