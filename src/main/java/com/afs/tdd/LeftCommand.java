package com.afs.tdd;

public class LeftCommand implements RoverCommand {
    @Override
    public void execute(MarsRover rover) {
        rover.left();
    }
}

