package com.javarush.island.ivanenko;

import com.javarush.island.ivanenko.world.World;

public class Main {
    private static int width = 100;
    private static int height = 20;
    private static int numOfAnimals = 10;

    public static void main(String[] args) {
        LaunchWorld launchWorld = new LaunchWorld();
        launchWorld.launch(width, height, numOfAnimals);
    }
}
