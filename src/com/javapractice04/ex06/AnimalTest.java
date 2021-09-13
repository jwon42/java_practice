package com.javapractice04.ex06;

import java.util.ArrayList;

public class AnimalTest {
    public static void main(String[] args) {
        Animal hAnimal = new Human();
        Animal tAnimal = new Tiger();
        Animal eAnimal = new Eagle();

        ArrayList<Animal> animalList = new ArrayList<Animal>();
        animalList.add(hAnimal);
        animalList.add(tAnimal);
        animalList.add(eAnimal);

        AnimalTest test = new AnimalTest();
        test.testDownCasting(animalList);
    }

    public void testDownCasting(ArrayList<Animal> animalList) {
        for (Animal animal : animalList) {
            if (animal instanceof Human) {
                ((Human) animal).readBook();
            } else if (animal instanceof Tiger) {
                ((Tiger) animal).hunt();
            } else if (animal instanceof Eagle) {
                ((Eagle) animal).fly();
            }
        }
    }
}
