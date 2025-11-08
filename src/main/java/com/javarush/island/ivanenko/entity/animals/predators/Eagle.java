package com.javarush.island.ivanenko.entity.animals.predators;

import com.javarush.island.ivanenko.entity.animals.Animal;
import com.javarush.island.ivanenko.world.World;

public class Eagle extends Animal {
    public Eagle(World world, int x, int y) {
        super(6, 20, 3, 1, world, x, y);
    }
}
