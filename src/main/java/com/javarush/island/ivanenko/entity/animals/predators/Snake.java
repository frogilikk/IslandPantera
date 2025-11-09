package com.javarush.island.ivanenko.entity.animals.predators;

import com.javarush.island.ivanenko.entity.animals.Animal;
import com.javarush.island.ivanenko.logics.Move;
import com.javarush.island.ivanenko.world.World;

public class Snake extends Animal {
    private final World world;
    private final int x;
    private final int y;
    private Snake snake;
    private Move move = new Move(snake);

    public Snake(World world, int x, int y) {
        super(15, 30, 1, 3);
        this.world = world;
        this.x = x;
        this.y = y;
    }

    public void run() {
        move.makeMove(world, x, y, movementLimit);
    }
}
