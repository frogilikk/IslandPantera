package com.javarush.island.ivanenko.utils;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Threads {
    public static ExecutorService executor = Executors.newFixedThreadPool(15);
}
