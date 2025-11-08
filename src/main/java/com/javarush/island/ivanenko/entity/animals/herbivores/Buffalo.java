package com.javarush.island.ivanenko.entity.animals.herbivores;

import com.javarush.island.ivanenko.entity.animals.Animal;
import com.javarush.island.ivanenko.world.World;

public class Buffalo extends Animal {
    public Buffalo(World world, int x, int y) {
        super(700, 10, 3, 100, world, x, y);
    }
}
