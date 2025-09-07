package com.afs.tdd;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MarsRover {
    private static final String[] DIRECTIONS = {"N", "E", "S", "W"};
    private static final Map<String, int[]> MOVE_MAP = new HashMap<>();
    private static final Map<String, int[]> BACK_MAP = new HashMap<>();
    static {
        MOVE_MAP.put("N", new int[]{0, 1});
        MOVE_MAP.put("E", new int[]{1, 0});
        MOVE_MAP.put("S", new int[]{0, -1});
        MOVE_MAP.put("W", new int[]{-1, 0});
        BACK_MAP.put("N", new int[]{0, -1});
        BACK_MAP.put("E", new int[]{-1, 0});
        BACK_MAP.put("S", new int[]{0, 1});
        BACK_MAP.put("W", new int[]{1, 0});
    }

    private int x;
    private int y;
    private String direction;

    public MarsRover(int x, int y, String direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    public void execute(Command command) {
        if (command == Command.M) {
            int[] move = MOVE_MAP.get(direction);
            this.x += move[0];
            this.y += move[1];
        } else if (command == Command.B) {
            int[] move = BACK_MAP.get(direction);
            this.x += move[0];
            this.y += move[1];
        } else if (command == Command.L) {
            int leftIndex = Arrays.asList(DIRECTIONS).indexOf(this.direction);
            this.direction = DIRECTIONS[(leftIndex + 3) % DIRECTIONS.length];
        } else if (command == Command.R) {
            int rightIndex = Arrays.asList(DIRECTIONS).indexOf(this.direction);
            this.direction = DIRECTIONS[(rightIndex + 1) % DIRECTIONS.length];
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
