package com.javarush.island.ivanenko.entity.animals.predators;

import com.javarush.island.ivanenko.entity.animals.Animal;
import com.javarush.island.ivanenko.logics.Move;
import com.javarush.island.ivanenko.world.World;

public class Bear extends Animal {
    private final World world;
    private final int x;
    private final int y;
    private Bear bear;
    private Move move = new Move(bear);

    public Bear(World world, int x, int y) {
        super(500, 5, 2, 80);
        this.world = world;
        this.x = x;
        this.y = y;
    }

    public void run() {
        move.makeMove(world, x, y, movementLimit);
    }
}
