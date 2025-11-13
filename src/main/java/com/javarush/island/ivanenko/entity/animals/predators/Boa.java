package com.javarush.island.ivanenko.entity.animals.predators;

import com.javarush.island.ivanenko.island.Cell;

public class Boa extends Predator {
    public Boa(String speciesName, Cell cell, int age, boolean canReproduce) {
        super(speciesName, cell);
        this.canReproduce = canReproduce;
        this.weight = 15;
        this.maxCountPerCell = 30;
        this.maxSteps = 1;
        this.foodNeeded = 3;
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
