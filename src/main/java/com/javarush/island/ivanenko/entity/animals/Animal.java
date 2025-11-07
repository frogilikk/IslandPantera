package com.javarush.island.ivanenko.entity.animals;

public abstract class Animal implements Runnable {
    private float weight;
    private int maxPerCell;
    private int movementLimit;
    private float fullFeedAmount;

    public Animal(float weight, int maxPerCell, int movementLimit, float fullFeedAmount) {
        this.weight = weight;
        this.maxPerCell = maxPerCell;
        this.movementLimit = movementLimit;
        this.fullFeedAmount = fullFeedAmount;
    }

    //public abstract void makeMove();


    @Override
    public void run() {
        System.out.println("я родился");
    }
}
