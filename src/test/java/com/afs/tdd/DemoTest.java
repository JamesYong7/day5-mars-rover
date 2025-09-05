package com.afs.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DemoTest {
    @Test
    public void should_return_x_1_y_2_N_when_x_1_y_1_move_N(){
        MarsRover marsRover = new MarsRover(1,1,"N");
        marsRover.execute("M");
        assertEquals("1",marsRover.getPositionX());
        assertEquals("2",marsRover.getPositionY());
        assertEquals("N",marsRover.getDirection());
    }

    @Test
    public void should_return_x_1_y_0_S_when_x_1_y_1_move_S(){

    }

    @Test
    public void should_return_x_0_y_1_W_when_x_1_y_1_move_W(){

    }

    @Test
    public void should_return_x_2_y_1_S_when_x_1_y_1_move_E(){

    }

    @Test
    public void should_return_x_1_y_1_W_when_x_1_y_1_left_N(){

    }

    @Test
    public void should_return_x_1_y_1_N_when_x_1_y_1_left_E(){

    }

    @Test
    public void should_return_x_1_y_1_E_when_x_1_y_1_left_S(){

    }

    @Test
    public void should_return_x_1_y_1_S_when_x_1_y_1_left_W(){

    }

    @Test
    public void should_return_x_1_y_1_E_when_x_1_y_1_right_N(){

    }

    @Test
    public void should_return_x_1_y_1_S_when_x_1_y_1_right_E(){

    }

    @Test
    public void should_return_x_1_y_1_W_when_x_1_y_1_right_S(){

    }

    @Test
    public void should_return_x_1_y_1_N_when_x_1_y_1_right_W(){

    }
}
