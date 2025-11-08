package com.javarush.island.ivanenko.entity.animals.herbivores;

import com.javarush.island.ivanenko.entity.animals.Animal;
import com.javarush.island.ivanenko.world.World;

public class Sheep extends Animal {
    public Sheep(World world, int x, int y) {
        super(70, 140, 3, 15, world, x, y);
    }
}
