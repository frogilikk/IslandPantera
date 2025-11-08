package com.javarush.island.ivanenko.entity.animals.predators;

import com.javarush.island.ivanenko.entity.animals.Animal;
import com.javarush.island.ivanenko.world.World;

public class Fox extends Animal {
    public Fox(World world, int x, int y) {
        super(8, 30, 2, 2, world, x, y);
    }
}
