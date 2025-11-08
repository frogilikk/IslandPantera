package com.javarush.island.ivanenko.entity.animals.herbivores;

import com.javarush.island.ivanenko.entity.animals.Animal;
import com.javarush.island.ivanenko.world.World;

public class Deer extends Animal {
    public Deer(World world, int x, int y) {
        super(300, 20, 4, 50, world, x, y);
    }
}
