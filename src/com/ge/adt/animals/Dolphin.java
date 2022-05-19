package com.ge.adt.animals;

import com.ge.adt.interfaces.AnimalInterface;

public class Dolphin implements AnimalInterface {
    @Override
    public String makeASound() {
        return "whistles";
    }

    @Override
    public String walk() {
        return "swims";
    }
}
