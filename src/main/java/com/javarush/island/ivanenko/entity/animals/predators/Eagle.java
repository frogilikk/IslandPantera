package com.javarush.island.ivanenko.entity.animals.predators;

import com.javarush.island.ivanenko.entity.animals.Animal;
import com.javarush.island.ivanenko.logics.Move;
import com.javarush.island.ivanenko.world.World;

public class Eagle extends Animal {
    private final World world;
    private final int x;
    private final int y;
    private Eagle eagle;
    private Move move = new Move(eagle);

    public Eagle(World world, int x, int y) {
        super(6, 20, 3, 1);
        this.world = world;
        this.x = x;
        this.y = y;
    }

    public void run() {
        move.makeMove(world, x, y, movementLimit);
    }
}
