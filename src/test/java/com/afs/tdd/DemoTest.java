package com.afs.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DemoTest {
    @Test
    public void should_return_x_1_y_2_N_when_x_1_y_1_move_N(){
        MarsRover marsRover = new MarsRover(1,1,"N");
        marsRover.execute("M");
        assertEquals(1,marsRover.getPositionX());
        assertEquals(2,marsRover.getPositionY());
        assertEquals("N",marsRover.getDirection());
    }

    @Test
    public void should_return_x_1_y_0_S_when_x_1_y_1_move_S(){
        MarsRover marsRover = new MarsRover(1,1,"S");
        marsRover.execute("M");
        assertEquals(1,marsRover.getPositionX());
        assertEquals(0,marsRover.getPositionY());
        assertEquals("S",marsRover.getDirection());
    }

    @Test
    public void should_return_x_0_y_1_W_when_x_1_y_1_move_W(){
        MarsRover marsRover = new MarsRover(1,1,"W");
        marsRover.execute("M");
        assertEquals(0,marsRover.getPositionX());
        assertEquals(1,marsRover.getPositionY());
        assertEquals("W",marsRover.getDirection());
    }

    @Test
    public void should_return_x_2_y_1_S_when_x_1_y_1_move_E(){
        MarsRover marsRover = new MarsRover(1,1,"E");
        marsRover.execute("M");
        assertEquals(2,marsRover.getPositionX());
        assertEquals(1,marsRover.getPositionY());
        assertEquals("E",marsRover.getDirection());
    }

    @Test
    public void should_return_x_1_y_1_W_when_x_1_y_1_left_N(){
        MarsRover marsRover = new MarsRover(1,1,"N");
        marsRover.execute("L");
        assertEquals(1,marsRover.getPositionX());
        assertEquals(1,marsRover.getPositionY());
        assertEquals("W",marsRover.getDirection());
    }

    @Test
    public void should_return_x_1_y_1_N_when_x_1_y_1_left_E(){
        MarsRover marsRover = new MarsRover(1,1,"E");
        marsRover.execute("L");
        assertEquals(1,marsRover.getPositionX());
        assertEquals(1,marsRover.getPositionY());
        assertEquals("N",marsRover.getDirection());
    }

    @Test
    public void should_return_x_1_y_1_E_when_x_1_y_1_left_S(){
        MarsRover marsRover = new MarsRover(1,1,"S");
        marsRover.execute("L");
        assertEquals(1,marsRover.getPositionX());
        assertEquals(1,marsRover.getPositionY());
        assertEquals("E",marsRover.getDirection());

    }

    @Test
    public void should_return_x_1_y_1_S_when_x_1_y_1_left_W(){
        MarsRover marsRover = new MarsRover(1,1,"W");
        marsRover.execute("L");
        assertEquals(1,marsRover.getPositionX());
        assertEquals(1,marsRover.getPositionY());
        assertEquals("S",marsRover.getDirection());

    }

    @Test
    public void should_return_x_1_y_1_E_when_x_1_y_1_right_N(){
        MarsRover marsRover = new MarsRover(1,1,"N");
        marsRover.execute("R");
        assertEquals(1,marsRover.getPositionX());
        assertEquals(1,marsRover.getPositionY());
        assertEquals("E",marsRover.getDirection());
    }

    @Test
    public void should_return_x_1_y_1_S_when_x_1_y_1_right_E(){
        MarsRover marsRover = new MarsRover(1,1,"E");
        marsRover.execute("R");
        assertEquals(1,marsRover.getPositionX());
        assertEquals(1,marsRover.getPositionY());
        assertEquals("S",marsRover.getDirection());
    }

    @Test
    public void should_return_x_1_y_1_W_when_x_1_y_1_right_S(){
        MarsRover marsRover = new MarsRover(1,1,"S");
        marsRover.execute("R");
        assertEquals(1,marsRover.getPositionX());
        assertEquals(1,marsRover.getPositionY());
        assertEquals("W",marsRover.getDirection());
    }

    @Test
    public void should_return_x_1_y_1_N_when_x_1_y_1_right_W(){
        MarsRover marsRover = new MarsRover(1,1,"W");
        marsRover.execute("R");
        assertEquals(1,marsRover.getPositionX());
        assertEquals(1,marsRover.getPositionY());
        assertEquals("N",marsRover.getDirection());
    }
}
