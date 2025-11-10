package com.javarush.island.ivanenko.island;

import com.javarush.island.ivanenko.entity.animals.Animal;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

public class Cell {
    private final int x;
    private final int y;
    private final List<Animal> animals = new ArrayList<>();
    private int plants = 5;

    public Cell(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void addAnimal(Animal animal) {animals.add(animal);}
    public void removeAnimal(Animal animal) {animals.remove(animal);}
    public List<Animal> getAnimals() {return animals;}

    public void growthPlants() {plants++;}
    public int getPlants() {return plants;}

    public int getX() {return x;}
    public int getY() {return y;}
}
