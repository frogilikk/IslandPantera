package com.javarush.island.ivanenko.logics;

import com.javarush.island.ivanenko.entity.animals.Animal;
import com.javarush.island.ivanenko.entity.animals.predators.*;
import com.javarush.island.ivanenko.world.Cell;
import com.javarush.island.ivanenko.world.World;

import java.util.concurrent.ThreadLocalRandom;


public class Move {
    private ThreadLocalRandom random;
    private Animal animal;

    public Move(Animal animal) {
        this.animal = animal;
    }

    public void who() {
        if (animal instanceof Wolf) {
            animal = (Wolf) animal;
        } else if (animal instanceof Snake) {
            animal = (Snake) animal;
        }
    }

    public void makeMove(World world, int x, int y, int movementLimit) {
        Cell cell = world.getCell(x, y);
        who();

        for (int i = 0; i < movementLimit; i++) {
            int dx = ThreadLocalRandom.current().nextInt(3) - 1;
            int dy = ThreadLocalRandom.current().nextInt(3) - 1;

            int newX = x + dx;
            int newY = y + dy;

            if (!world.isValidCoordinate(newX, newY)) {
                continue;
            }

            cell.removeAnimal(animal);
            cell = world.getCell(newX, newY);
            cell.addAnimal(animal);

            x = newX;
            y = newY;
        }

    }
}
