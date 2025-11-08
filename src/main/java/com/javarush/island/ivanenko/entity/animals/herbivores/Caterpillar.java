package com.javarush.island.ivanenko.entity.animals.herbivores;

import com.javarush.island.ivanenko.entity.animals.Animal;
import com.javarush.island.ivanenko.world.World;

public class Caterpillar extends Animal {
    public Caterpillar(World world, int x, int y) {
        super(0.01f, 1000, 0, 0, world, x, y);
    }
}
