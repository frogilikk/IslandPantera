package com.javarush.island.ivanenko;

import com.javarush.island.ivanenko.world.World;

public class LaunchWorld {
    public World world;
    public void launch(int width, int height, int numOfAnimals) {
        world = new World(width, height);
        AnimalFactory.populate(world, numOfAnimals);
    }

    public World getWorld() {
        return world;
    }
}
