package com.javarush.island.ivanenko.entity.animals.herbivores;

import com.javarush.island.ivanenko.entity.animals.predators.Predator;
import com.javarush.island.ivanenko.island.Cell;

public class Boar extends Herbivore {
    public Boar(String speciesName, Cell cell, int age, boolean canReproduce) {
        super(speciesName, cell);
        this.canReproduce = canReproduce;
        this.weight = 400;
        this.maxCountPerCell = 50;
        this.maxSteps = 2;
        this.foodNeeded = 50;
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
