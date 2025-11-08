package com.javarush.island.ivanenko.entity.animals.herbivores;

import com.javarush.island.ivanenko.entity.animals.Animal;
import com.javarush.island.ivanenko.world.World;

public class Rabbit extends Animal {
    public Rabbit(World world, int x, int y) {
        super(2, 150, 2, 0.45f);
    }
}
