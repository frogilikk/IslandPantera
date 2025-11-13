package com.javarush.island.ivanenko.simulation;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Statistics {
    public static List<String> moves = new CopyOnWriteArrayList<>();
    public static List<String> reproductions = new CopyOnWriteArrayList<>();
    public static List<String> eats = new CopyOnWriteArrayList<>();

    public static void output() {
        System.out.println("\nПередвижения:");
        if (!moves.isEmpty()) {
            for (String move : moves) {
                System.out.println(move);
            }
        } else {
            System.out.println("Никто не ходил");
        }

        System.out.println("\nРазмножение:");
        if (!reproductions.isEmpty()) {
            for (String reproduction : reproductions) {
                System.out.println(reproduction);
            }
        } else {
            System.out.println("Никто никого не родил");
        }

        System.out.println("\nУмерли:");
        if (!eats.isEmpty()) {
            for (String eat : eats) {
                System.out.println(eat);
            }
        } else {
            System.out.println("Никто никого не съел");
        }

        moves.clear();
        reproductions.clear();
        eats.clear();
    }
}
