package com.javarush.island.ivanenko.entity.animals.herbivores;

import com.javarush.island.ivanenko.entity.animals.predators.Predator;
import com.javarush.island.ivanenko.island.Cell;

public class Buffalo extends Herbivore {
    public Buffalo(String speciesName, Cell cell, int age, boolean canReproduce) {
        super(speciesName, cell);
        this.canReproduce = canReproduce;
        this.weight = 700;
        this.maxCountPerCell = 10;
        this.maxSteps = 3;
        this.foodNeeded = 100;
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
