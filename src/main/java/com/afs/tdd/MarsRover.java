package com.afs.tdd;

import java.util.Arrays;

public class MarsRover {
    private static final String[] DIRECTIONS = {"N", "E", "S", "W"};

    private int x;
    private int y;
    private String direction;

    public MarsRover(int x, int y, String direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    public void execute(Command command) {
        switch (command) {
            case M:
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
                break;
            case L:
                int leftIndex = Arrays.asList(DIRECTIONS).indexOf(this.direction);
                this.direction = DIRECTIONS[(leftIndex + 3) % DIRECTIONS.length];
                break;
            case R:
                int rightIndex = Arrays.asList(DIRECTIONS).indexOf(this.direction);
                this.direction = DIRECTIONS[(rightIndex + 1) % DIRECTIONS.length];
                break;
            case B:
                switch (direction) {
                    case "N":
                        this.y--;
                        break;
                    case "S":
                        this.y++;
                        break;
                    case "W":
                        this.x++;
                        break;
                    case "E":
                        this.x--;
                        break;
                }
                break;

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
