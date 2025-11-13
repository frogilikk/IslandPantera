package com.javarush.island.ivanenko.entity.animals;

import com.javarush.island.ivanenko.Main;
import com.javarush.island.ivanenko.config.Config;
import com.javarush.island.ivanenko.island.Cell;
import com.javarush.island.ivanenko.island.Island;
import com.javarush.island.ivanenko.simulation.Statistics;
import com.javarush.island.ivanenko.utils.AnimalFactory;
import lombok.Getter;

import java.util.List;
import java.util.Objects;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;

public abstract class Animal implements Runnable {
    protected final String speciesName;

    protected int maxSteps;
    protected int stepsLeft = maxSteps;
    protected int age;
    protected float weight;
    protected int maxCountPerCell;
    protected float foodNeeded;
    protected float currentSatiety = 0;

    protected boolean alive = true;
    protected boolean canReproduce;

    protected Cell cell;
    protected Island island = Main.island;

    @Getter
    protected final long id;

    public Animal(String speciesName, Cell cell) {
        this.speciesName = speciesName;
        this.cell = cell;
        this.id = System.nanoTime() + cell.getX()*31 + cell.getY();
        cell.addAnimal(this);
    }

    public abstract void run();

    protected synchronized void move() {
        Cell firstCell = cell;
        for (int i = 0; i < maxSteps; i++) {
            Cell[] neighbors = island.getNeighbors(cell);
            Cell neighbor = chooseRandomNonNull(List.of(neighbors));

            if (neighbor == null) continue;

            cell.removeAnimal(this);
            cell = neighbor;
            cell.addAnimal(this);
        }

        Statistics.moves.add(
                          this.speciesName + " с id: " + this.id +
                                            " переместился из клетки [X: " + firstCell.getX() + ", Y: " + firstCell.getY() + "]" +
                                            " в клетку [X: " + cell.getX() + ", Y: " + cell.getY() + "]"
        );

        if (age > Config.MAX_AGE) {
            this.die();
            Statistics.eats.add(this.speciesName + " с id: " + id + " умер от старости");
        } else {
            age++;
        }

        if (currentSatiety == 0) {
            if (weight <= 0) {
                this.die();
                Statistics.eats.add(this.speciesName + " с id: " + id + " умер от голода");
            } else {
                weight--;
            }
        } else {
            currentSatiety--;
        }

        canReproduce = true;
        stepsLeft = maxSteps;
    }

    abstract protected void eat();

    protected void reproduce() {
        synchronized (speciesName.intern()) {
            List<Animal> sameSpecies = cell.getAnimals().stream()
                              .filter(a -> a != this)
                              .filter(a -> a.getSpeciesName().equals(this.speciesName))
                              .filter(a -> a.canReproduce && age >= 5 && stepsLeft >= 1)
                              .collect(Collectors.toList());

            if (sameSpecies.size() >= 1 && age >= 5 && canReproduce && maxCountPerCell > cell.search(speciesName).size()) {
                Animal a = AnimalFactory.create(this.speciesName, this.cell, 0, false);

                Statistics.reproductions.add(
                                  this.speciesName + " с id: " + this.id +
                                                    " размножился и породил " + a.getSpeciesName() + " с id: " + a.id +
                                                    " в клетке [X: " + cell.getX() + ", Y: " + cell.getY() + "]"
                );

                canReproduce = false;
                stepsLeft--;
            }
        }
    }

    public void die() {
        alive = false;
        cell.removeAnimal(this);
    }

    public boolean isAlive() { return alive; }
    public String getSpeciesName() { return speciesName; }

    public static <T> T chooseRandomNonNull(List<T> list) {
        List<T> nonNull = list.stream()
                          .filter(Objects::nonNull)
                          .toList();

        if (nonNull.isEmpty()) return null;

        return nonNull.get(ThreadLocalRandom.current().nextInt(nonNull.size()));
    }
}
