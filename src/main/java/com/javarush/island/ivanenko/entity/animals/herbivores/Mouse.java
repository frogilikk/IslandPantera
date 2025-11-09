package com.javarush.island.ivanenko.entity.animals.herbivores;

import com.javarush.island.ivanenko.entity.animals.Animal;
import com.javarush.island.ivanenko.logics.Move;
import com.javarush.island.ivanenko.world.World;

public class Mouse extends Animal {
    private final World world;
    private final int x;
    private final int y;
    private Mouse mouse;
    private Move move = new Move(mouse);

    public Mouse(World world, int x, int y) {
        super(0.05f, 500, 1, 0.01f);
        this.world = world;
        this.x = x;
        this.y = y;
    }

    public void run() {
        move.makeMove(world, x, y, movementLimit);
    }
}
