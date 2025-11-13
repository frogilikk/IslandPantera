package com.javarush.island.ivanenko.entity.animals.herbivores;

import com.javarush.island.ivanenko.entity.animals.predators.Predator;
import com.javarush.island.ivanenko.island.Cell;

public class Horse extends Herbivore {
    public Horse(String speciesName, Cell cell, int age, boolean canReproduce) {
        super(speciesName, cell);
        this.canReproduce = canReproduce;
        this.weight = 400;
        this.maxCountPerCell = 20;
        this.maxSteps = 4;
        this.foodNeeded = 60;
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
