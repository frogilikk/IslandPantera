package com.javarush.island.ivanenko.entity.animals.predators;

import com.javarush.island.ivanenko.entity.animals.Animal;
import com.javarush.island.ivanenko.world.World;

public class Bear extends Animal {
    public Bear(World world, int x, int y) {
        super(500, 5, 2, 80, world, x, y);
    }
}
