package com.javarush.island.ivanenko;

import com.javarush.island.ivanenko.config.Config;
import com.javarush.island.ivanenko.entity.animals.predators.*;
import com.javarush.island.ivanenko.island.Island;
import com.javarush.island.ivanenko.simulation.SimulationController;
import com.javarush.island.ivanenko.utils.AnimalFactory;

public class Main {
    public static final Island island = new Island();

    public static void main(String[] args) {

        Wolf w1 = (Wolf) AnimalFactory.create("Wolf", island.getCell(10, 10), 5, true);
        Wolf w2 = (Wolf) AnimalFactory.create("Wolf", island.getCell(10, 10), 5, true);

        SimulationController controller = new SimulationController(island, Config.THREADS);
        controller.startSimulation(Config.TICKS);
    }
}
