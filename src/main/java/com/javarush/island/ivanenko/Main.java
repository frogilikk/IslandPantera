package com.javarush.island.ivanenko;

import com.javarush.island.ivanenko.entity.animals.Animal;
import com.javarush.island.ivanenko.entity.animals.herbivores.Rabbit;
import com.javarush.island.ivanenko.entity.animals.predators.Wolf;
import com.javarush.island.ivanenko.island.Cell;
import com.javarush.island.ivanenko.island.Island;
import com.javarush.island.ivanenko.utils.Threads;

public class Main {
    public static Island island = new Island();
    public static void main(String[] args) {
        Wolf wolf = new Wolf("Wolf", island.getCell(5, 5));
        Rabbit rabbit = new Rabbit("Rabbit", island.getCell(5, 5));
        Threads.executor.submit(wolf);
        Threads.executor.submit(rabbit);
        Threads.executor.shutdown();
    }
}
