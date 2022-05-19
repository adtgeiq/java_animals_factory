package com.ge.adt.factory;

import com.ge.adt.animals.Cat;
import com.ge.adt.animals.Penguin;
import com.ge.adt.animals.descriptions.Animal;

public class AnimalsFactory {
    public Animal getAnimal(String animal) {
        if (animal.isEmpty() || null == animal)
            return null;
        else if (animal.equalsIgnoreCase("cat"))
            return new Cat();
        else if (animal.equalsIgnoreCase("dolphin"))
            return new Penguin();
        else if (animal.equalsIgnoreCase("penguin"))
            return new Penguin();
        else
            return null;
    }
}
