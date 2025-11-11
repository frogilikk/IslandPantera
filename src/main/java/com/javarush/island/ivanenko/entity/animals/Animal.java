package com.javarush.island.ivanenko.entity.animals;

import com.javarush.island.ivanenko.Main;
import com.javarush.island.ivanenko.island.Cell;
import com.javarush.island.ivanenko.island.Island;

import java.util.List;
import java.util.Objects;
import java.util.Random;

public abstract class Animal implements Runnable {
    protected final String speciesName;
    protected int weight;
    protected int maxCountPerCell;
    protected int speed;
    protected int foodNeeded;
    protected int currentSatiety;
    protected boolean alive = true;
    protected Cell cell;
    protected Island island = Main.island;

    protected final long id;

    public Animal(String speciesName, Cell cell) {
        this.speciesName = speciesName;
        this.cell = cell;
        this.id = System.nanoTime() + cell.getX()*31 + cell.getY();
        cell.addAnimal(this);
    }

    public abstract void run();

    public void move() {
        for (int i = 0; i < speed; i++) {
            Cell[] neighbors = island.getNeighbors(cell);
            Cell neighbor = chooseRandomNonNull(List.of(neighbors));
            cell.removeAnimal(this);
            cell = neighbor;
            cell.addAnimal(this);
            System.out.println(this.getSpeciesName() + " на: " + cell.getX() + ", " + cell.getY());
        }
    };
    abstract public void eat();
    abstract public void reproduce();

    public void die() {
        alive = false;
        cell.removeAnimal(this);
    }

    public boolean isAlive() { return alive; }
    public String getSpeciesName() { return speciesName; }

    public static <T> T chooseRandomNonNull(List<T> list) {
        Random random = new Random();
        List<T> nonNull = list.stream()
                          .filter(Objects::nonNull)
                          .toList();

        if (nonNull.isEmpty()) return null;

        return nonNull.get(random.nextInt(nonNull.size()));
    }
}
