package com.javarush.island.ivanenko.entity.animals.herbivores;

import com.javarush.island.ivanenko.entity.animals.Animal;
import com.javarush.island.ivanenko.world.World;

public class Goat extends Animal {
    public Goat(World world, int x, int y) {
        super(60, 140, 3, 10, world, x, y);
    }
}
