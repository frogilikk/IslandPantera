package com.javarush.island.ivanenko.island;

import com.javarush.island.ivanenko.entity.animals.Animal;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Cell {
    private final int x;
    private final int y;
    private final List<Animal> animals = new CopyOnWriteArrayList<>();
    private int plants = 100;

    public Cell(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void addAnimal(Animal animal) {animals.add(animal);}
    public void removeAnimal(Animal animal) {animals.remove(animal);}
    public List<Animal> getAnimals() {return animals;}

    public void growthPlants() {plants++;}
    public synchronized void eatPlants(float eatenPlants) {
        plants -= eatenPlants;
    }
    public int getPlants() {return plants;}

    public List<Animal> search(String name) {
        List<Animal> animalList = new ArrayList<>();
        for (Animal a : animals) {
            if (a.getSpeciesName().equals(name)) {
                animalList.add(a);
            }
        }
        return animalList;
    }

    public int getX() {return x;}
    public int getY() {return y;}
}
