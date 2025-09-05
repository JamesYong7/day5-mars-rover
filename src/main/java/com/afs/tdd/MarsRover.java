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
        if (command.equals("M") ) {
            switch (direction) {
                case "N":
                    this.y += 1;
                    break;
                case "S":
                    this.y -= 1;
                    break;
                case "W":
                    this.x -= 1;
                    break;
                case "E":
                    this.x += 1;
                    break;
            }
        }else if (command.equals("L")){
            this.direction = "W";
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
