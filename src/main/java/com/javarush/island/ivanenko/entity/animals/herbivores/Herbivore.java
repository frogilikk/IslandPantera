package com.javarush.island.ivanenko.entity.animals.herbivores;

import com.javarush.island.ivanenko.entity.animals.Animal;
import com.javarush.island.ivanenko.island.Cell;

public abstract class Herbivore extends Animal {
    public Herbivore(String speciesName, Cell cell) {super(speciesName, cell);}

    @Override
    protected void eat() {

        if (cell.getPlants() > foodNeeded - currentSatiety) {
            cell.eatPlants(foodNeeded - currentSatiety);
            currentSatiety = foodNeeded;
            stepsLeft--;
        }
    }
}