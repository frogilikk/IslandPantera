package com.javarush.island.ivanenko.island;

import com.javarush.island.ivanenko.config.Config;

public class Island {
    private final Cell[][] cells = new Cell[Config.getWIDTH()][Config.getHEIGHT()];

    public Island() {
        for (int width = 0; width < Config.WIDTH; width++) {
            for (int height = 0; height < Config.HEIGHT; height++) {
                cells[width][height] = new Cell(width, height);
            }
        }
    }

    public Cell getCell(int x, int y) {
        if (x < 0 || y < 0 || x >= Config.WIDTH || y >= Config.HEIGHT) return null;
        return cells[y][x];
    }

    public Cell[][] getCells() {
        return cells;
    }

    public Cell[] getNeighbors(Cell c) {
        int x = c.getX(), y = c.getY();
        return new Cell[] {
                          getCell(x, y-1), // up
                          getCell(x, y+1), // down
                          getCell(x-1, y), // left
                          getCell(x+1, y)  // right
        };
    }
}
