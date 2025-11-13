package com.javarush.island.ivanenko.entity.animals.predators;

import com.javarush.island.ivanenko.config.DietTable;
import com.javarush.island.ivanenko.entity.animals.Animal;
import com.javarush.island.ivanenko.island.Cell;
import com.javarush.island.ivanenko.simulation.Statistics;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;


public abstract class Predator extends Animal {
    public Predator(String speciesName, Cell cell) {super(speciesName, cell);}

    protected void eat() {
        if (5 >= 5) {
            Map<String, Integer> canEatMap = DietTable.table.get(this.speciesName);
            List<Animal> animals = cell.getAnimals();
            List<Animal> canEat = new ArrayList<>();
            List<Integer> canEatChance = new ArrayList<>();

            for (Animal animal : animals) {
                if (canEatMap.containsKey(animal.getSpeciesName())) {
                    canEat.add(animal);
                }
            }

            if (!canEat.isEmpty()) {
                for (Animal prey : canEat) {
                    canEatChance.add(canEatMap.get(prey.getSpeciesName()));
                }

                int bestChance = 0;
                int bestChanceNum = 0;

                for (int i = 0; i < canEatChance.size(); i++) {
                    if (canEatChance.get(i) > bestChance) {
                        bestChance = canEatChance.get(i);
                        bestChanceNum = i;
                    }
                }

                if (bestChance > ThreadLocalRandom.current().nextInt(100)) {
                    Animal target = canEat.get(bestChanceNum);
                    cell.removeAnimal(target);
                    target.die();
                    stepsLeft--;
                    Statistics.eats.add(this.speciesName + " с id: " + this.id +
                                      " съел " + target.getSpeciesName() + " с id: " + target.getId() +
                                      " в клетке: X - " + cell.getX() + " Y - " + cell.getY());
                }
            }
        }
    }
}
