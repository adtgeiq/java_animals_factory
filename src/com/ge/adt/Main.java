package com.ge.adt;

import com.ge.adt.animals.descriptions.Animal;
import com.ge.adt.factory.AnimalsFactory;

public class Main {

    public static void main(String[] args) {
        AnimalsFactory animalsFactory = new AnimalsFactory();

        Animal cat = animalsFactory.getAnimal("cat");
        cat.setName("Mr. Tom");
        System.out.println(cat.getName() + " walks " + cat.walk());

    }
}
