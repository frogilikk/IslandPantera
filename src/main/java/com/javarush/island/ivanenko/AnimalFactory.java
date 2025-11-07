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
                case 0: animal = new Wolf();
                case 1: animal = new Snake();
                case 2: animal = new Fox();
                case 3: animal = new Eagle();
                case 4: animal = new Bear();
                case 5: animal = new Sheep();
                case 6: animal = new Rabbit();
                case 7: animal = new Mouse();
                case 8: animal = new Horse();
                case 9: animal = new Goat();
                case 10: animal = new Duck();
                case 11: animal = new Deer();
                case 12: animal = new Buffalo();
                case 13: animal = new Boar();
                default: animal = new Caterpillar();
            };
            cell.addAnimal(animal);
            new Thread(animal).start();
        }
    }
}
