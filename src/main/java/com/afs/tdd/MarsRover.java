package com.afs.tdd;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    public void move() {
        switch (direction) {
            case "N":
                this.y++;
                break;
            case "E":
                this.x++;
                break;
            case "S":
                this.y--;
                break;
            case "W":
                this.x--;
                break;
        }
    }

    public void back() {
        switch (direction) {
            case "N":
                this.y--;
                break;
            case "E":
                this.x--;
                break;
            case "S":
                this.y++;
                break;
            case "W":
                this.x++;
                break;
        }
    }

    public void left() {
        int leftIndex = Arrays.asList(DIRECTIONS).indexOf(this.direction);
        this.direction = DIRECTIONS[(leftIndex + 3) % DIRECTIONS.length];
    }

    public void right() {
        int rightIndex = Arrays.asList(DIRECTIONS).indexOf(this.direction);
        this.direction = DIRECTIONS[(rightIndex + 1) % DIRECTIONS.length];
    }

    public void batchExecute(List<RoverCommand> commands) {
        commands.forEach(cmd -> cmd.execute(this));
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
