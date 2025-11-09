package com.javarush.island.ivanenko.entity.animals.herbivores;

import com.javarush.island.ivanenko.entity.animals.Animal;
import com.javarush.island.ivanenko.entity.animals.predators.Wolf;
import com.javarush.island.ivanenko.logics.Move;
import com.javarush.island.ivanenko.world.World;

public class Rabbit extends Animal {
    private final World world;
    private final int x;
    private final int y;
    private Rabbit rabbit;
    private Move move = new Move(rabbit);

    public Rabbit(World world, int x, int y) {
        super(2, 150, 2, 0.45f);
        this.world = world;
        this.x = x;
        this.y = y;
    }

    public void run() {
        move.makeMove(world, x, y, movementLimit);
    }
}
