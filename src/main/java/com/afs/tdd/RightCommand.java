package com.afs.tdd;

public class RightCommand implements RoverCommand {
    @Override
    public void execute(MarsRover rover) {
        rover.right();
    }
}

