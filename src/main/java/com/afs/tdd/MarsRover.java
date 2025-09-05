package com.afs.tdd;

import java.util.Arrays;

public class MarsRover {
    public static final String[] DIRECTIONS = {"N", "E", "S", "W"};

    private int x;
    private int y;
    private String direction;

    public MarsRover(int x, int y, String direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    public void execute(String command) {
        if (command.equals("M")) {
            switch (direction) {
                case "N":
                    this.y++;
                    break;
                case "S":
                    this.y--;
                    break;
                case "W":
                    this.x--;
                    break;
                case "E":
                    this.x++;
                    break;
            }
        } else if (command.equals("L")) {
            int index = Arrays.asList(DIRECTIONS).indexOf(this.direction);
            this.direction = DIRECTIONS[(index + 3) % DIRECTIONS.length];
        } else if (command.equals("R")) {
            int index = Arrays.asList(DIRECTIONS).indexOf(this.direction);
            this.direction = DIRECTIONS[(index + 1) % DIRECTIONS.length];
        }
    }

    public Integer getPositionX() {
        return this.x;
    }

    public Integer getPositionY() {
        return this.y;
    }

    public String getDirection() {
        return this.direction;
    }
}
