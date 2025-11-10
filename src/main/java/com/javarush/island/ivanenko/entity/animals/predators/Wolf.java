package com.javarush.island.ivanenko.entity.animals.predators;

import com.javarush.island.ivanenko.island.Cell;
import com.javarush.island.ivanenko.island.Island;

public class Wolf extends Predator {
    public Wolf(String speciesName, Cell cell) {
        super(speciesName, cell);
    this.speed = 3;
    }

    @Override
    public void act(Island island) {
        move(island);
    }
}
