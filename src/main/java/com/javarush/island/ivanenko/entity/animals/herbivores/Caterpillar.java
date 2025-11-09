package com.javarush.island.ivanenko.entity.animals.herbivores;

import com.javarush.island.ivanenko.entity.animals.Animal;
import com.javarush.island.ivanenko.logics.Move;
import com.javarush.island.ivanenko.world.World;

public class Caterpillar extends Animal {
    private final World world;
    private final int x;
    private final int y;
    private Caterpillar caterpillar;
    private Move move = new Move(caterpillar);

    public Caterpillar(World world, int x, int y) {
        super(0.01f, 1000, 0, 0);
        this.world = world;
        this.x = x;
        this.y = y;
    }

    public void run() {
        move.makeMove(world, x, y, movementLimit);
    }
}
