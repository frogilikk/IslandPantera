package com.javarush.island.ivanenko.entity.animals.herbivores;

import com.javarush.island.ivanenko.entity.animals.predators.Predator;
import com.javarush.island.ivanenko.island.Cell;

public class Caterpillar extends Herbivore {
    public Caterpillar(String speciesName, Cell cell, int age, boolean canReproduce) {
        super(speciesName, cell);
        this.canReproduce = canReproduce;
        this.weight = 0.01f;
        this.maxCountPerCell = 1000;
        this.maxSteps = 0;
        this.foodNeeded = 0;
        this.age = age;
        this.stepsLeft = 3;
    }


    @Override
    public void run() {
        eat();
        reproduce();
        move();
    }
}
