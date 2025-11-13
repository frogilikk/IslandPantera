package com.javarush.island.ivanenko.simulation;

import com.javarush.island.ivanenko.Main;
import com.javarush.island.ivanenko.config.Config;
import com.javarush.island.ivanenko.entity.animals.Animal;
import com.javarush.island.ivanenko.island.Cell;
import com.javarush.island.ivanenko.utils.AnimalFactory;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Launch {
        public static void populateIslandRandomly() {
            String[] species = {
                              "Wolf", "Boa", "Fox", "Bear", "Eagle", "Horse", "Deer",
                              "Rabbit", "Mouse", "Goat", "Sheep", "Boar", "Buffalo",
                              "Duck", "Caterpillar"
            };

            Random random = new Random();
            int totalToPlace = Config.INITIAL_ANIMALS;

            Cell[][] cells = Main.island.getCells();
            int width = cells.length;
            int height = cells[0].length;

            while (totalToPlace > 0) {
                String type = species[random.nextInt(species.length)];
                int x = random.nextInt(width);
                int y = random.nextInt(height);
                Cell cell = cells[x][y];

                int currentCount = cell.search(type).size();
                int maxPerCell = getMaxCount(type);

                if (currentCount < maxPerCell) {
                    int age = random.nextInt(10);
                    boolean canReproduce = random.nextBoolean();
                    Animal animal = AnimalFactory.create(type, cell, age, canReproduce);
                    cell.addAnimal(animal);
                    totalToPlace--;
                }
            }
        }


    private static int getMaxCount(String speciesName) {
        return switch (speciesName) {
            case "Wolf" -> 30;
            case "Boa" -> 30;
            case "Fox" -> 30;
            case "Bear" -> 5;
            case "Eagle" -> 20;
            case "Horse" -> 20;
            case "Deer" -> 20;
            case "Rabbit" -> 150;
            case "Mouse" -> 500;
            case "Goat" -> 140;
            case "Sheep" -> 140;
            case "Boar" -> 50;
            case "Buffalo" -> 10;
            case "Duck" -> 200;
            case "Caterpillar" -> 1000;
            default -> 0;
        };
    }
}
