package com.javarush.island.ivanenko.config;

import lombok.Getter;

public class Config {
    @Getter
    public static final int WIDTH = 100;
    @Getter
    public static final int HEIGHT = 20;

    @Getter
    public static final int THREADS = 100;

    @Getter
    public static final int TICKS = 200;

    @Getter
    public static final int MAX_AGE = 50;

    @Getter
    public static final int INITIAL_ANIMALS = (WIDTH * HEIGHT) / 4;

    @Getter
    public static final int SIMULATION_STEP_MS = 1000;
}
