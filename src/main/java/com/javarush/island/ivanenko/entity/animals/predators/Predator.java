package com.javarush.island.ivanenko.entity.animals.predators;

import com.javarush.island.ivanenko.entity.animals.Animal;
import com.javarush.island.ivanenko.island.Cell;
import com.javarush.island.ivanenko.island.Island;

import java.util.List;
import java.util.Objects;
import java.util.Random;

public abstract class Predator extends Animal {
    public Predator(String speciesName, Cell cell) {super(speciesName, cell);}

    public void move(Island island) {
        for (int i = 0; i < speed; i++) {
            Cell[] neighbors = island.getNeighbors(cell);
            Cell neighbor = chooseRandomNonNull(List.of(neighbors));
            cell.removeAnimal(this);
            cell = neighbor;
            cell.addAnimal(this);
            System.out.println(this.getClass().getName() + "на: " + cell.getX() + ", " + cell.getY());
        }
    }

    public void eat() {

    }

    public void reproduce() {

    }

    public static <T> T chooseRandomNonNull(List<T> list) {
        Random random = new Random();
        List<T> nonNull = list.stream()
                          .filter(Objects::nonNull)
                          .toList();

        if (nonNull.isEmpty()) return null;

        return nonNull.get(random.nextInt(nonNull.size()));
    }

}
