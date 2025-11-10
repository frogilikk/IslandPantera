package com.javarush.island.ivanenko.config;

import lombok.Getter;

public class Config {
    @Getter
    public static final int WIDTH = 20;
    @Getter
    public static final int HEIGHT = 10;

    @Getter
    public static final int INITIAL_ANIMALS = (WIDTH * HEIGHT) / 4;

    @Getter
    public static final int SIMULATION_STEP_MS = 2000;
}
