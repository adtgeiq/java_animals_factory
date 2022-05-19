package com.ge.adt.animals;

import com.ge.adt.animals.descriptions.Animal;

public class Penguin extends Animal {
    @Override
    public String makeASound() {
        return "bleat";
    }

    @Override
    public String walk() {
        return "waddled";
    }
}
