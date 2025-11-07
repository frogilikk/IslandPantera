package com.javarush.island.ivanenko;

import com.javarush.island.ivanenko.world.World;

public class LaunchWorld {
    public World world;
    public void launch(int width, int height) {
        world = new World(width, height);
        AnimalFactory.populate(world, 10);
    }
}
