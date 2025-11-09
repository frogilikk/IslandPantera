package com.javarush.island.ivanenko.entity.animals.herbivores;

import com.javarush.island.ivanenko.entity.animals.Animal;
import com.javarush.island.ivanenko.logics.Move;
import com.javarush.island.ivanenko.world.World;

public class Buffalo extends Animal {
    private final World world;
    private final int x;
    private final int y;
    private Buffalo buffalo;
    private Move move = new Move(buffalo);

    public Buffalo(World world, int x, int y) {
        super(700, 10, 3, 100);
        this.world = world;
        this.x = x;
        this.y = y;
    }

    public void run() {
        move.makeMove(world, x, y, movementLimit);
    }
}
