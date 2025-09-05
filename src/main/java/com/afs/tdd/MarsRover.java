package com.afs.tdd;

public class MarsRover {
    private int x;
    private int y;
    private String direction;

    public MarsRover(int x, int y, String direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    public void execute(String command) {
        if (command.equals("M") && direction.equals("N")) {
            this.y += 1;
        }
    }
    public Integer getPositionX() {
        return this.x;
    }
    public Integer getPositionY() {
        return this.y;
    }
    public String getDirection() {
        return "N";
    }
}
