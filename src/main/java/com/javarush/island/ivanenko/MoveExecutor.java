package com.javarush.island.ivanenko;
import com.javarush.island.ivanenko.entity.animals.Animal;
import com.javarush.island.ivanenko.logics.Move;
import com.javarush.island.ivanenko.world.World;

import java.util.concurrent.*;

public class MoveExecutor {
    private final ExecutorService executor;

    public MoveExecutor(int threadCount) {
        this.executor = Executors.newFixedThreadPool(threadCount);
    }

    public void submitMove(Runnable action) {
        executor.submit(action);
    }

    public void shutdown() {
        executor.shutdown();
    }

    public void awaitTermination() {
        try {
            executor.awaitTermination(10, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}


