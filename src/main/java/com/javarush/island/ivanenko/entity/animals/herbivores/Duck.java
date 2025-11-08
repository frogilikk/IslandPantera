package com.javarush.island.ivanenko.entity.animals.herbivores;

import com.javarush.island.ivanenko.entity.animals.Animal;
import com.javarush.island.ivanenko.world.World;

public class Duck extends Animal {
    public Duck(World world, int x, int y) {
        super(1, 200, 4, 0.15f, world, x, y);
    }
}
