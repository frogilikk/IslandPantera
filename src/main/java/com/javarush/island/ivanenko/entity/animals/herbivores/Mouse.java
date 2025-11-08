package com.javarush.island.ivanenko.entity.animals.herbivores;

import com.javarush.island.ivanenko.entity.animals.Animal;
import com.javarush.island.ivanenko.world.World;

public class Mouse extends Animal {
    public Mouse(World world, int x, int y) {
        super(0.05f, 500, 1, 0.01f, world, x, y);
    }
}
