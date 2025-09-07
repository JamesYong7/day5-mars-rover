package com.afs.tdd;

public class BackCommand implements RoverCommand {
    @Override
    public void execute(MarsRover rover) {
        rover.back();
    }
}

