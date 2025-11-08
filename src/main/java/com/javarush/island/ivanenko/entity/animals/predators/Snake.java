package com.javarush.island.ivanenko.entity.animals.predators;

import com.javarush.island.ivanenko.entity.animals.Animal;
import com.javarush.island.ivanenko.world.World;

public class Snake extends Animal {
    public Snake(World world, int x, int y) {
        super(15, 30, 1, 3, world, x, y);
    }
}
