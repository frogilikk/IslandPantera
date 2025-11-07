package com.javarush.island.ivanenko.world;

import com.javarush.island.ivanenko.entity.animals.Animal;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Cell {
    private final int x, y;
    private final List<Animal> animals = new CopyOnWriteArrayList<>();

    public Cell(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public List<Animal> getAnimals() {
        return animals;
    }

    public synchronized void addAnimal(Animal animal) {
        animals.add(animal);
    }

    public synchronized void removeAnimal(Animal animal) {
        animals.remove(animal);
    }
}
