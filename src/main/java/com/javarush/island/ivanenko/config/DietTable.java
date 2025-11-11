package com.javarush.island.ivanenko.config;

import com.javarush.island.khmelov.entity.organizm.animals.predators.Wolf;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class DietTable {
    public static final Map<String, Map<String, Integer>> table = new ConcurrentHashMap<>();

    static {
        table.put("Wolf", Map.of(
                          "Horse", 10,
                          "Deer", 15,
                          "Rabbit", 60,
                          "Mouse", 80,
                          "Goat", 60,
                          "Sheep", 70,
                          "Boar", 15,
                          "Buffalo", 10,
                          "Duck", 40
        ));

        table.put("Boa", Map.of(
                          "Fox", 15,
                          "Rabbit", 20,
                          "Mouse", 40,
                          "Duck", 10
        ));

        table.put("Fox", Map.of(
                          "Rabbit", 70,
                          "Mouse", 90,
                          "Duck", 60,
                          "Caterpillar", 40
        ));

        table.put("Bear", Map.of(
                          "Boa", 80,
                          "Horse", 40,
                          "Deer", 80,
                          "Rabbit", 80,
                          "Mouse", 90,
                          "Goat", 70,
                          "Sheep", 70,
                          "Boar", 50,
                          "Buffalo", 20,
                          "Duck", 10
        ));

        table.put("Eagle", Map.of(
                          "Fox", 10,
                          "Rabbit", 90,
                          "Mouse", 90,
                          "Duck", 80
        ));

        table.put("Boar", Map.of(
                          "Mouse", 50,
                          "Caterpillar", 90
        ));

        table.put("Mouse", Map.of(
                          "Caterpillar", 90
        ));

        table.put("Duck", Map.of(
                          "Caterpillar", 90
        ));
    }

    public static int getProbability(String predator, String prey) {
        return table.getOrDefault(predator, Map.of()).getOrDefault(prey, 0);
    }
}
