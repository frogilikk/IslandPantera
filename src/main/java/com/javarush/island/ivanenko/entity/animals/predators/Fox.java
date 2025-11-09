package com.javarush.island.ivanenko.entity.animals.predators;

import com.javarush.island.ivanenko.entity.animals.Animal;
import com.javarush.island.ivanenko.logics.Move;
import com.javarush.island.ivanenko.world.World;

public class Fox extends Animal {
    private final World world;
    private final int x;
    private final int y;
    private Fox fox;
    private Move move = new Move(fox);

    public Fox(World world, int x, int y) {
        super(8, 30, 2, 2);
        this.world = world;
        this.x = x;
        this.y = y;
    }

    public void run() {
        move.makeMove(world, x, y, movementLimit);
    }
}
