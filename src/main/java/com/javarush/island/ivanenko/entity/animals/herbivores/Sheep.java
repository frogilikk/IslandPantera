package com.javarush.island.ivanenko.entity.animals.herbivores;

import com.javarush.island.ivanenko.entity.animals.Animal;
import com.javarush.island.ivanenko.logics.Move;
import com.javarush.island.ivanenko.world.World;

public class Sheep extends Animal {
    private final World world;
    private final int x;
    private final int y;
    private Sheep sheep;
    private Move move = new Move(sheep);

    public Sheep(World world, int x, int y) {
        super(70, 140, 3, 15);
        this.world = world;
        this.x = x;
        this.y = y;
    }

    public void run() {
        move.makeMove(world, x, y, movementLimit);
    }
}
