package com.javarush.island.ivanenko.entity.animals.predators;

import com.javarush.island.ivanenko.island.Cell;

public class Eagle extends Predator {
    public Eagle(String speciesName, Cell cell, int age, boolean canReproduce) {
        super(speciesName, cell);
        this.canReproduce = canReproduce;
        this.weight = 6;
        this.maxCountPerCell = 20;
        this.maxSteps = 3;
        this.foodNeeded = 1;
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
