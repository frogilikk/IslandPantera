package com.javarush.island.ivanenko.utils;

import com.javarush.island.ivanenko.entity.animals.Animal;
import com.javarush.island.ivanenko.entity.animals.herbivores.*;
import com.javarush.island.ivanenko.entity.animals.predators.*;
import com.javarush.island.ivanenko.island.Cell;

public class AnimalFactory {
    public static Animal create(String speciesName, Cell cell, int age, boolean canReproduce) {
        return switch (speciesName) {
            case "Wolf" -> new Wolf(speciesName, cell, age, canReproduce);
            case "Boa" -> new Boa(speciesName, cell, age, canReproduce);
            case "Fox" -> new Fox(speciesName, cell, age, canReproduce);
            case "Bear" -> new Bear(speciesName, cell, age, canReproduce);
            case "Eagle" -> new Eagle(speciesName, cell, age, canReproduce);
            case "Horse" -> new Horse(speciesName, cell, age, canReproduce);
            case "Deer" -> new Deer(speciesName, cell, age, canReproduce);
            case "Rabbit" -> new Rabbit(speciesName, cell, age, canReproduce);
            case "Mouse" -> new Mouse(speciesName, cell, age, canReproduce);
            case "Goat" -> new Goat(speciesName, cell, age, canReproduce);
            case "Sheep" -> new Sheep(speciesName, cell, age, canReproduce);
            case "Boar" -> new Boar(speciesName, cell, age, canReproduce);
            case "Buffalo" -> new Buffalo(speciesName, cell, age, canReproduce);
            case "Duck" -> new Duck(speciesName, cell, age, canReproduce);
            case "Caterpillar" -> new Caterpillar(speciesName, cell, age, canReproduce);
            default -> throw new IllegalArgumentException("Неизвестный вид: " + speciesName);
        };

    }
}

