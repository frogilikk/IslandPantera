package com.javarush.island.ivanenko.entity.animals.herbivores;

import com.javarush.island.ivanenko.entity.animals.Animal;
import com.javarush.island.ivanenko.world.World;

public class Horse extends Animal {
    public Horse(World world, int x, int y) {
        super(400, 20, 4, 60, world, x, y);
    }
}
