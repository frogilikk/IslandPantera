package com.javarush.island.ivanenko.entity.animals.predators;

import com.javarush.island.ivanenko.island.Cell;

public class Bear extends Predator {
    public Bear(String speciesName, Cell cell, int age, boolean canReproduce) {
        super(speciesName, cell);
        this.canReproduce = canReproduce;
        this.weight = 500;
        this.maxCountPerCell = 5;
        this.maxSteps = 2;
        this.foodNeeded = 80;
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
