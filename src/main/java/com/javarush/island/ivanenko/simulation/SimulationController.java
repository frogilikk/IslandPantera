package com.javarush.island.ivanenko.simulation;

import com.javarush.island.ivanenko.config.Config;
import com.javarush.island.ivanenko.entity.animals.Animal;
import com.javarush.island.ivanenko.island.Cell;
import com.javarush.island.ivanenko.island.Island;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class SimulationController {
    private final Island island;
    private final int threadCount;
    private ExecutorService executor;

    public SimulationController(Island island, int threadCount) {
        this.island = island;
        this.threadCount = threadCount;
    }

    public void startSimulation(int ticks) {
        Launch.populateIslandRandomly();
        for (int tick = 1; tick <= ticks; tick++) {
            System.out.println("\n=== Такт " + tick + " ===");

            executor = Executors.newFixedThreadPool(threadCount);

            for (Cell[] row : island.getCells()) {
                for (Cell cell : row) {
                    for (Animal animal : cell.getAnimals()) {
                        if (animal != null && animal.isAlive()) {
                            executor.submit(animal);
                        }
                    }
                }
            }

            executor.shutdown();
            try {
                boolean finished = executor.awaitTermination(Config.SIMULATION_STEP_MS, TimeUnit.MILLISECONDS);
                if (!finished) {
                    System.out.println("Такт не завершён вовремя");
                    executor.shutdownNow();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            island.growPlants();
            Statistics.output();

            if (!island.hasAnyAliveAnimals()) {
                System.out.println("Все животные вымерли. Симуляция завершена.");
                break;
            }
        }


        System.out.println("\nСимуляция завершена");
    }
}

