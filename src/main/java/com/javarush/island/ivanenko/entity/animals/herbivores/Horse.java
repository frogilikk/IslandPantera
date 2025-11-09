package com.javarush.island.ivanenko.entity.animals.herbivores;

import com.javarush.island.ivanenko.entity.animals.Animal;
import com.javarush.island.ivanenko.logics.Move;
import com.javarush.island.ivanenko.world.World;

public class Horse extends Animal {
    private final World world;
    private final int x;
    private final int y;
    private Horse horse;
    private Move move = new Move(horse);

    public Horse(World world, int x, int y) {
        super(400, 20, 4, 60);
        this.world = world;
        this.x = x;
        this.y = y;
    }

    public void run() {
        move.makeMove(world, x, y, movementLimit);
    }
}
