package com.javarush.island.ivanenko;

import com.javarush.island.ivanenko.entity.animals.predators.Wolf;
import com.javarush.island.ivanenko.island.Cell;
import com.javarush.island.ivanenko.island.Island;

public class Main {
    public static void main(String[] args) {
        Island island = new Island();
        Cell cell = island.getCell(5, 5);
        Wolf wolf = new Wolf("Wolf", island.getCell(5, 5));
        cell.addAnimal(wolf);
        wolf.act(island);
        wolf.act(island);
        wolf.act(island);
        wolf.act(island);
    }
}
