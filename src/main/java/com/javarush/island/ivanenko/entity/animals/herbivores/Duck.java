package com.javarush.island.ivanenko.entity.animals.herbivores;

import com.javarush.island.ivanenko.entity.animals.Animal;
import com.javarush.island.ivanenko.logics.Move;
import com.javarush.island.ivanenko.world.World;

public class Duck extends Animal {
    private final World world;
    private final int x;
    private final int y;
    private Duck duck;
    private Move move = new Move(duck);

    public Duck(World world, int x, int y) {
        super(1, 200, 4, 0.15f);
        this.world = world;
        this.x = x;
        this.y = y;
    }

    public void run() {
        move.makeMove(world, x, y, movementLimit);
    }
}
