package com.javarush.island.ivanenko.logics;

import com.javarush.island.ivanenko.MoveExecutor;
import com.javarush.island.ivanenko.entity.animals.Animal;
import com.javarush.island.ivanenko.entity.animals.predators.*;
import com.javarush.island.ivanenko.world.Cell;
import com.javarush.island.ivanenko.world.World;

import java.util.concurrent.ThreadLocalRandom;


public class Move {
    private Animal animal;
    private MoveExecutor moveExecutor;

    public Move(Animal animal, MoveExecutor moveExecutor) {
        this.animal = animal;
        this.moveExecutor = moveExecutor;
    }

    public void makeMove(World world, int x, int y, int movementLimit) {
        moveExecutor.submitMove(() -> {
            int currentX = x;
            int currentY = y;
            Cell cell = world.getCell(currentX, currentY);

            for (int i = 0; i < movementLimit; i++) {
                int dx = ThreadLocalRandom.current().nextInt(3) - 1;
                int dy = ThreadLocalRandom.current().nextInt(3) - 1;
                if (dx == 0 && dy == 0) continue;

                int newX = currentX + dx;
                int newY = currentY + dy;

                if (!world.isValidCoordinate(newX, newY)) {
                    continue;
                }

                cell.removeAnimal(animal);
                cell = world.getCell(newX, newY);
                cell.addAnimal(animal);

                currentX = newX;
                currentY = newY;

                System.out.println(animal.getClass().getSimpleName() +
                                  " шаг на:\nx: " + currentX +
                                  "\ny: " + currentY +
                                  "\nшагов: " + (i + 1) +
                                  " из: " + movementLimit + "\n");
            }
        });
    }
}
