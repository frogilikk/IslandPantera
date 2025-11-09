package com.javarush.island.ivanenko.entity.animals.herbivores;

import com.javarush.island.ivanenko.entity.animals.Animal;
import com.javarush.island.ivanenko.logics.Move;
import com.javarush.island.ivanenko.world.World;

public class Deer extends Animal {
    private final World world;
    private final int x;
    private final int y;
    private Deer deer;
    private Move move = new Move(deer);

    public Deer(World world, int x, int y) {
        super(300, 20, 4, 50);
        this.world = world;
        this.x = x;
        this.y = y;
    }

    public void run() {
        move.makeMove(world, x, y, movementLimit);
    }
}
