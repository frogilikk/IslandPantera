package com.javarush.island.ivanenko.entity.animals.herbivores;

import com.javarush.island.ivanenko.entity.animals.Animal;
import com.javarush.island.ivanenko.world.World;

public class Boar extends Animal {
    public Boar(World world, int x, int y) {
        super(400, 50, 2, 50, world, x, y);
    }
}
