package com.afs.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DemoTest {
    @Test
    public void should_return_x_1_y_2_N_when_x_1_y_1_move_N(){
        MarsRover marsRover = new MarsRover(1,1,"N");
        marsRover.execute(Command.M);
        assertEquals(1,marsRover.getPositionX());
        assertEquals(2,marsRover.getPositionY());
        assertEquals("N",marsRover.getDirection());
    }

    @Test
    public void should_return_x_1_y_0_S_when_x_1_y_1_move_S(){
        MarsRover marsRover = new MarsRover(1,1,"S");
        marsRover.execute(Command.M);
        assertEquals(1,marsRover.getPositionX());
        assertEquals(0,marsRover.getPositionY());
        assertEquals("S",marsRover.getDirection());
    }

    @Test
    public void should_return_x_0_y_1_W_when_x_1_y_1_move_W(){
        MarsRover marsRover = new MarsRover(1,1,"W");
        marsRover.execute(Command.M);
        assertEquals(0,marsRover.getPositionX());
        assertEquals(1,marsRover.getPositionY());
        assertEquals("W",marsRover.getDirection());
    }

    @Test
    public void should_return_x_2_y_1_S_when_x_1_y_1_move_E(){
        MarsRover marsRover = new MarsRover(1,1,"E");
        marsRover.execute(Command.M);
        assertEquals(2,marsRover.getPositionX());
        assertEquals(1,marsRover.getPositionY());
        assertEquals("E",marsRover.getDirection());
    }

    @Test
    public void should_return_x_1_y_1_W_when_x_1_y_1_left_N(){
        MarsRover marsRover = new MarsRover(1,1,"N");
        marsRover.execute(Command.L);
        assertEquals(1,marsRover.getPositionX());
        assertEquals(1,marsRover.getPositionY());
        assertEquals("W",marsRover.getDirection());
    }

    @Test
    public void should_return_x_1_y_1_N_when_x_1_y_1_left_E(){
        MarsRover marsRover = new MarsRover(1,1,"E");
        marsRover.execute(Command.L);
        assertEquals(1,marsRover.getPositionX());
        assertEquals(1,marsRover.getPositionY());
        assertEquals("N",marsRover.getDirection());
    }

    @Test
    public void should_return_x_1_y_1_E_when_x_1_y_1_left_S(){
        MarsRover marsRover = new MarsRover(1,1,"S");
        marsRover.execute(Command.L);
        assertEquals(1,marsRover.getPositionX());
        assertEquals(1,marsRover.getPositionY());
        assertEquals("E",marsRover.getDirection());

    }

    @Test
    public void should_return_x_1_y_1_S_when_x_1_y_1_left_W(){
        MarsRover marsRover = new MarsRover(1,1,"W");
        marsRover.execute(Command.L);
        assertEquals(1,marsRover.getPositionX());
        assertEquals(1,marsRover.getPositionY());
        assertEquals("S",marsRover.getDirection());

    }

    @Test
    public void should_return_x_1_y_1_E_when_x_1_y_1_right_N(){
        MarsRover marsRover = new MarsRover(1,1,"N");
        marsRover.execute(Command.R);
        assertEquals(1,marsRover.getPositionX());
        assertEquals(1,marsRover.getPositionY());
        assertEquals("E",marsRover.getDirection());
    }

    @Test
    public void should_return_x_1_y_1_S_when_x_1_y_1_right_E(){
        MarsRover marsRover = new MarsRover(1,1,"E");
        marsRover.execute(Command.R);
        assertEquals(1,marsRover.getPositionX());
        assertEquals(1,marsRover.getPositionY());
        assertEquals("S",marsRover.getDirection());
    }

    @Test
    public void should_return_x_1_y_1_W_when_x_1_y_1_right_S(){
        MarsRover marsRover = new MarsRover(1,1,"S");
        marsRover.execute(Command.R);
        assertEquals(1,marsRover.getPositionX());
        assertEquals(1,marsRover.getPositionY());
        assertEquals("W",marsRover.getDirection());
    }

    @Test
    public void should_return_x_1_y_1_N_when_x_1_y_1_right_W(){
        MarsRover marsRover = new MarsRover(1,1,"W");
        marsRover.execute(Command.R);
        assertEquals(1,marsRover.getPositionX());
        assertEquals(1,marsRover.getPositionY());
        assertEquals("N",marsRover.getDirection());
    }

    @Test
    public void should_return_x_1_y_0_N_when_x_1_y_1_back_N(){
        MarsRover marsRover = new MarsRover(1,1,"N");
        marsRover.execute(Command.B);
        assertEquals(1, marsRover.getPositionX());
        assertEquals(0, marsRover.getPositionY());
        assertEquals("N", marsRover.getDirection());
    }

    @Test
    public void should_return_x_0_y_1_E_when_x_1_y_1_back_E(){
        MarsRover marsRover = new MarsRover(1,1,"E");
        marsRover.execute(Command.B);
        assertEquals(0, marsRover.getPositionX());
        assertEquals(1, marsRover.getPositionY());
        assertEquals("E", marsRover.getDirection());
    }

    @Test
    public void should_return_x_1_y_2_S_when_x_1_y_1_back_S(){
        MarsRover marsRover = new MarsRover(1,1,"S");
        marsRover.execute(Command.B);
        assertEquals(1, marsRover.getPositionX());
        assertEquals(2, marsRover.getPositionY());
        assertEquals("S", marsRover.getDirection());
    }

    @Test
    public void should_return_x_1_y_0_W_when_x_1_y_1_back_N(){
        MarsRover marsRover = new MarsRover(1,1,"W");
        marsRover.execute(Command.B);
        assertEquals(2, marsRover.getPositionX());
        assertEquals(1, marsRover.getPositionY());
        assertEquals("W", marsRover.getDirection());
    }

    @Test
    public void should_execute_batch_commands_and_return_final_position_and_direction() {
        MarsRover marsRover = new MarsRover(1, 1, "N");
        marsRover.batchExecute(java.util.Arrays.asList(
                Command.M, // (1,2,N)
                Command.L, // (1,2,W)
                Command.M, // (0,2,W)
                Command.R, // (0,2,N)
                Command.B, // (0,1,N)
                Command.B, // (0,0,N)
                Command.M  // (0,1,N)
        ));
        assertEquals(0, marsRover.getPositionX());
        assertEquals(1, marsRover.getPositionY());
        assertEquals("N", marsRover.getDirection());
    }
}
