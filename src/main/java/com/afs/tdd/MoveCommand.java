package com.afs.tdd;

public class MoveCommand implements RoverCommand {
    @Override
    public void execute(MarsRover rover) {
        rover.move();
    }
}

