package com.afs.tdd;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DemoTest {
    @Test
    public void should_return_x_1_y_2_N_when_x_1_y_1_move_N(){
        MarsRover marsRover = new MarsRover(1,1,"N");

        marsRover.batchExecute(Collections.singletonList(new MoveCommand()));

        assertEquals(1,marsRover.getPositionX());
        assertEquals(2,marsRover.getPositionY());
        assertEquals("N",marsRover.getDirection());
    }

    @Test
    public void should_return_x_1_y_0_S_when_x_1_y_1_move_S(){
        MarsRover marsRover = new MarsRover(1,1,"S");

        marsRover.batchExecute(Collections.singletonList(new MoveCommand()));

        assertEquals(1,marsRover.getPositionX());
        assertEquals(0,marsRover.getPositionY());
        assertEquals("S",marsRover.getDirection());
    }

    @Test
    public void should_return_x_0_y_1_W_when_x_1_y_1_move_W(){
        MarsRover marsRover = new MarsRover(1,1,"W");

        marsRover.batchExecute(Collections.singletonList(new MoveCommand()));

        assertEquals(0,marsRover.getPositionX());
        assertEquals(1,marsRover.getPositionY());
        assertEquals("W",marsRover.getDirection());
    }

    @Test
    public void should_return_x_2_y_1_S_when_x_1_y_1_move_E(){
        MarsRover marsRover = new MarsRover(1,1,"E");

        marsRover.batchExecute(Collections.singletonList(new MoveCommand()));

        assertEquals(2,marsRover.getPositionX());
        assertEquals(1,marsRover.getPositionY());
        assertEquals("E",marsRover.getDirection());
    }

    @Test
    public void should_return_x_1_y_1_W_when_x_1_y_1_left_N(){
        MarsRover marsRover = new MarsRover(1,1,"N");

        marsRover.batchExecute(Collections.singletonList(new LeftCommand()));

        assertEquals(1,marsRover.getPositionX());
        assertEquals(1,marsRover.getPositionY());
        assertEquals("W",marsRover.getDirection());
    }

    @Test
    public void should_return_x_1_y_1_N_when_x_1_y_1_left_E(){
        MarsRover marsRover = new MarsRover(1,1,"E");

        marsRover.batchExecute(Collections.singletonList(new LeftCommand()));

        assertEquals(1,marsRover.getPositionX());
        assertEquals(1,marsRover.getPositionY());
        assertEquals("N",marsRover.getDirection());
    }

    @Test
    public void should_return_x_1_y_1_E_when_x_1_y_1_left_S(){
        MarsRover marsRover = new MarsRover(1,1,"S");

        marsRover.batchExecute(Collections.singletonList(new LeftCommand()));

        assertEquals(1,marsRover.getPositionX());
        assertEquals(1,marsRover.getPositionY());
        assertEquals("E",marsRover.getDirection());
    }

    @Test
    public void should_return_x_1_y_1_S_when_x_1_y_1_left_W(){
        MarsRover marsRover = new MarsRover(1,1,"W");

        marsRover.batchExecute(Collections.singletonList(new LeftCommand()));

        assertEquals(1,marsRover.getPositionX());
        assertEquals(1,marsRover.getPositionY());
        assertEquals("S",marsRover.getDirection());
    }

    @Test
    public void should_return_x_1_y_1_E_when_x_1_y_1_right_N(){
        MarsRover marsRover = new MarsRover(1,1,"N");

        marsRover.batchExecute(Collections.singletonList(new RightCommand()));

        assertEquals(1,marsRover.getPositionX());
        assertEquals(1,marsRover.getPositionY());
        assertEquals("E",marsRover.getDirection());
    }

    @Test
    public void should_return_x_1_y_1_S_when_x_1_y_1_right_E(){
        MarsRover marsRover = new MarsRover(1,1,"E");

        marsRover.batchExecute(Collections.singletonList(new RightCommand()));

        assertEquals(1,marsRover.getPositionX());
        assertEquals(1,marsRover.getPositionY());
        assertEquals("S",marsRover.getDirection());
    }

    @Test
    public void should_return_x_1_y_1_W_when_x_1_y_1_right_S(){
        MarsRover marsRover = new MarsRover(1,1,"S");

        marsRover.batchExecute(Collections.singletonList(new RightCommand()));

        assertEquals(1,marsRover.getPositionX());
        assertEquals(1,marsRover.getPositionY());
        assertEquals("W",marsRover.getDirection());
    }

    @Test
    public void should_return_x_1_y_1_N_when_x_1_y_1_right_W(){
        MarsRover marsRover = new MarsRover(1,1,"W");

        marsRover.batchExecute(Collections.singletonList(new RightCommand()));

        assertEquals(1,marsRover.getPositionX());
        assertEquals(1,marsRover.getPositionY());
        assertEquals("N",marsRover.getDirection());
    }

    @Test
    public void should_return_x_1_y_0_N_when_x_1_y_1_back_N(){
        MarsRover marsRover = new MarsRover(1,1,"N");

        marsRover.batchExecute(Collections.singletonList(new BackCommand()));

        assertEquals(1, marsRover.getPositionX());
        assertEquals(0, marsRover.getPositionY());
        assertEquals("N", marsRover.getDirection());
    }

    @Test
    public void should_return_x_0_y_1_E_when_x_1_y_1_back_E(){
        MarsRover marsRover = new MarsRover(1,1,"E");

        marsRover.batchExecute(Collections.singletonList(new BackCommand()));

        assertEquals(0, marsRover.getPositionX());
        assertEquals(1, marsRover.getPositionY());
        assertEquals("E", marsRover.getDirection());
    }

    @Test
    public void should_return_x_1_y_2_S_when_x_1_y_1_back_S(){
        MarsRover marsRover = new MarsRover(1,1,"S");

        marsRover.batchExecute(Collections.singletonList(new BackCommand()));

        assertEquals(1, marsRover.getPositionX());
        assertEquals(2, marsRover.getPositionY());
        assertEquals("S", marsRover.getDirection());
    }

    @Test
    public void should_return_x_1_y_0_W_when_x_1_y_1_back_N(){
        MarsRover marsRover = new MarsRover(1,1,"W");

        marsRover.batchExecute(Collections.singletonList(new BackCommand()));

        assertEquals(2, marsRover.getPositionX());
        assertEquals(1, marsRover.getPositionY());
        assertEquals("W", marsRover.getDirection());
    }

    @Test
    public void should_execute_batch_commands_and_return_final_position_and_direction() {
        MarsRover marsRover = new MarsRover(1, 1, "N");

        marsRover.batchExecute(Arrays.asList(
                new MoveCommand(), // (1,2,N)
                new LeftCommand(), // (1,2,W)
                new MoveCommand(), // (0,2,W)
                new RightCommand(), // (0,2,N)
                new BackCommand(), // (0,1,N)
                new BackCommand(), // (0,0,N)
                new MoveCommand()  // (0,1,N)
        ));

        assertEquals(0, marsRover.getPositionX());
        assertEquals(1, marsRover.getPositionY());
        assertEquals("N", marsRover.getDirection());
    }
}
