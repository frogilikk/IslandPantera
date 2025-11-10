package com.javarush.island.ivanenko.entity.animals;

import com.javarush.island.ivanenko.island.Cell;
import com.javarush.island.ivanenko.island.Island;

public abstract class Animal {
    protected final String speciesName;
    protected int weight;
    protected int maxCountPerCell;
    protected int speed;
    protected int foodNeeded;
    protected int currentSatiety;
    protected boolean alive = true;
    protected Cell cell;

    protected final long id;

    public Animal(String speciesName, Cell cell) {
        this.speciesName = speciesName;
        this.cell = cell;
        this.id = System.nanoTime() + cell.getX()*31 + cell.getY();
        cell.addAnimal(this);
    }

    public abstract void act(Island island);

    abstract public void move(Island island);
    abstract public void eat();
    abstract public void reproduce();

    public void die() {
        alive = false;
        cell.removeAnimal(this);
    }

    public boolean isAlive() { return alive; }
    public String getSpeciesName() { return speciesName; }
}
