package com.javarush.island.ivanenko.entity.animals.predators;

import com.javarush.island.ivanenko.island.Cell;

public class Fox extends Predator {
    public Fox(String speciesName, Cell cell, int age, boolean canReproduce) {
        super(speciesName, cell);
        this.canReproduce = canReproduce;
        this.weight = 8;
        this.maxCountPerCell = 30;
        this.maxSteps = 2;
        this.foodNeeded = 2;
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
