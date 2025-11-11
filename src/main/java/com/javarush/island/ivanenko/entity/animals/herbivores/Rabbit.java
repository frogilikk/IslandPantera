package com.javarush.island.ivanenko.entity.animals.herbivores;

import com.javarush.island.ivanenko.entity.animals.Animal;
import com.javarush.island.ivanenko.island.Cell;

public class Rabbit extends Animal {
    public Rabbit(String speciesName, Cell cell)
    {
        super(speciesName, cell);
        this.speed = 0;
    }
    @Override
    public void run() {
        move();
    }

    @Override
    public void eat() {}

    @Override
    public void reproduce() {}
}
