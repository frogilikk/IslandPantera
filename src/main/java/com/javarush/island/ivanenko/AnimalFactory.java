package com.javarush.island.ivanenko;

import com.javarush.island.ivanenko.entity.animals.Animal;
import com.javarush.island.ivanenko.entity.animals.herbivores.*;
import com.javarush.island.ivanenko.entity.animals.predators.*;
import com.javarush.island.ivanenko.world.Cell;
import com.javarush.island.ivanenko.world.World;

import java.util.Random;

public class AnimalFactory {
    private static final Random random = new Random();

    public static void populate(World world, int count) {
        for (int i = 0; i < count; i++) {
            int x = random.nextInt(world.getWidth());
            int y = random.nextInt(world.getHeight());
            Cell cell = world.getCell(x, y);
            Animal animal;
            switch (random.nextInt(15)) {
                case 0: animal = new Wolf(world, x, y);
                case 1: animal = new Snake(world, x, y);
                case 2: animal = new Fox(world, x, y);
                case 3: animal = new Eagle(world, x, y);
                case 4: animal = new Bear(world, x, y);
                case 5: animal = new Sheep(world, x, y);
                case 6: animal = new Rabbit(world, x, y);
                case 7: animal = new Mouse(world, x, y);
                case 8: animal = new Horse(world, x, y);
                case 9: animal = new Goat(world, x, y);
                case 10: animal = new Duck(world, x, y);
                case 11: animal = new Deer(world, x, y);
                case 12: animal = new Buffalo(world, x, y);
                case 13: animal = new Boar(world, x, y);
                default: animal = new Caterpillar(world, x, y);
            };
            cell.addAnimal(animal);
            new Thread(animal).start();
        }
    }
}
