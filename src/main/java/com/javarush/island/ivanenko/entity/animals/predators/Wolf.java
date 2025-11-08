package com.javarush.island.ivanenko.entity.animals.predators;

import com.javarush.island.ivanenko.entity.animals.Animal;
import com.javarush.island.ivanenko.world.World;

public class Wolf extends Animal {
    public Wolf(World world, int x, int y) {
        super(50, 30, 3, 8, world, x, y);
    }
}
