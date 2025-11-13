package com.javarush.island.ivanenko.entity.animals.herbivores;

import com.javarush.island.ivanenko.entity.animals.predators.Predator;
import com.javarush.island.ivanenko.island.Cell;

public class Goat extends Herbivore {
    public Goat(String speciesName, Cell cell, int age, boolean canReproduce) {
        super(speciesName, cell);
        this.canReproduce = canReproduce;
        this.weight = 60;
        this.maxCountPerCell = 140;
        this.maxSteps = 3;
        this.foodNeeded = 10;
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
