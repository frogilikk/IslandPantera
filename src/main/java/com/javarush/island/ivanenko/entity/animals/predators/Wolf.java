package com.javarush.island.ivanenko.entity.animals.predators;

import com.javarush.island.ivanenko.entity.animals.Animal;
import com.javarush.island.ivanenko.logics.Move;
import com.javarush.island.ivanenko.world.World;

public class Wolf extends Animal {
    private final World world;
    private final int x;
    private final int y;
    private Wolf wolf;
    private Move move = new Move(wolf);

    public Wolf(World world, int x, int y) {
        super(50, 30, 3, 8);
        this.world = world;
        this.x = x;
        this.y = y;
    }

    @Override
    public void run() {
        move.makeMove(world, x, y, movementLimit);
    }
}
