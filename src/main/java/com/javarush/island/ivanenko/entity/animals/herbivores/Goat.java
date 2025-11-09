package com.javarush.island.ivanenko.entity.animals.herbivores;

import com.javarush.island.ivanenko.entity.animals.Animal;
import com.javarush.island.ivanenko.logics.Move;
import com.javarush.island.ivanenko.world.World;

public class Goat extends Animal {
    private final World world;
    private final int x;
    private final int y;
    private final Move move;

    public Goat(World world, int x, int y) {
        super(60, 140, 3, 10);
        this.world = world;
        this.x = x;
        this.y = y;
        this.move = new Move(this);
    }

    public void run() {
        move.makeMove(world, x, y, movementLimit);
    }
}
