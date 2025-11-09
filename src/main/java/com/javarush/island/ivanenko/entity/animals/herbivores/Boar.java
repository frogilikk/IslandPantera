package com.javarush.island.ivanenko.entity.animals.herbivores;

import com.javarush.island.ivanenko.entity.animals.Animal;
import com.javarush.island.ivanenko.logics.Move;
import com.javarush.island.ivanenko.world.World;

public class Boar extends Animal {
    private final World world;
    private final int x;
    private final int y;
    private Boar boar;
    private Move move = new Move(boar);

    public Boar(World world, int x, int y) {
        super(400, 50, 2, 50);
        this.world = world;
        this.x = x;
        this.y = y;
    }

    public void run() {
        move.makeMove(world, x, y, movementLimit);
    }
}
