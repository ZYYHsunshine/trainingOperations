package com.thoughtworks;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MarsRover {
    @Test
    public void should_return_0_1_N_when_0_0_N_given_M(){
        String commands = "M";
        Mar mar = new Mar();
        Location location = new Location(0,0,"N");
        location = mar.action(location, commands);
        String result = "(" + String.valueOf(location.x) + "," + String.valueOf(location.y) + ") " + location.point;
        assertEquals("(0,1) N",result);
    }

    @Test
    public void should_return_0_0_W_when_0_0_N_given_L(){
        String commands = "L";
        Mar mar = new Mar();
        Location location = new Location(0,0,"N");
        location = mar.action(location, commands);
        String result = "(" + String.valueOf(location.x) + "," + String.valueOf(location.y) + ") " + location.point;
        assertEquals("(0,0) W",result);
    }

    @Test
    public void should_return_0_0_W_when_0_0_N_given_R(){
        String commands = "R";
        Mar mar = new Mar();
        Location location = new Location(0,0,"N");
        location = mar.action(location, commands);
        String result = "(" + String.valueOf(location.x) + "," + String.valueOf(location.y) + ") " + location.point;
        assertEquals("(0,0) E",result);
    }

    @Test
    public void should_return_Minus_1_0_W_when_0_0_W_given_M(){
        String commands = "M";
        Mar mar = new Mar();
        Location location = new Location(0,0,"W");
        location = mar.action(location, commands);
        String result = "(" + String.valueOf(location.x) + "," + String.valueOf(location.y) + ") " + location.point;
        assertEquals("(-1,0) W",result);
    }

    @Test
    public void should_return_0_0_S_when_0_0_W_given_L(){
        String commands = "L";
        Mar mar = new Mar();
        Location location = new Location(0,0,"W");
        location = mar.action(location, commands);
        String result = "(" + String.valueOf(location.x) + "," + String.valueOf(location.y) + ") " + location.point;
        assertEquals("(0,0) S",result);
    }

    @Test
    public void should_return_0_0_S_when_0_0_W_given_R(){
        String commands = "R";
        Mar mar = new Mar();
        Location location = new Location(0,0,"W");
        location = mar.action(location, commands);
        String result = "(" + String.valueOf(location.x) + "," + String.valueOf(location.y) + ") " + location.point;
        assertEquals("(0,0) N",result);
    }

    @Test
    public void should_return_0_Minus_1_S_when_0_0_S_given_M(){
        String commands = "M";
        Mar mar = new Mar();
        Location location = new Location(0,0,"S");
        location = mar.action(location, commands);
        String result = "(" + String.valueOf(location.x) + "," + String.valueOf(location.y) + ") " + location.point;
        assertEquals("(0,-1) S",result);
    }

    @Test
    public void should_return_0_0_E_when_0_0_S_given_L(){
        String commands = "L";
        Mar mar = new Mar();
        Location location = new Location(0,0,"S");
        location = mar.action(location, commands);
        String result = "(" + String.valueOf(location.x) + "," + String.valueOf(location.y) + ") " + location.point;
        assertEquals("(0,0) E",result);
    }

    @Test
    public void should_return_0_0_W_when_0_0_S_given_R(){
        String commands = "R";
        Mar mar = new Mar();
        Location location = new Location(0,0,"S");
        location = mar.action(location, commands);
        String result = "(" + String.valueOf(location.x) + "," + String.valueOf(location.y) + ") " + location.point;
        assertEquals("(0,0) W",result);
    }

    @Test
    public void should_return_1_0_E_when_0_0_E_given_M(){
        String commands = "M";
        Mar mar = new Mar();
        Location location = new Location(0,0,"E");
        location = mar.action(location, commands);
        String result = "(" + String.valueOf(location.x) + "," + String.valueOf(location.y) + ") " + location.point;
        assertEquals("(1,0) E",result);
    }

    @Test
    public void should_return_0_0_N_when_0_0_E_given_L(){
        String commands = "L";
        Mar mar = new Mar();
        Location location = new Location(0,0,"E");
        location = mar.action(location, commands);
        String result = "(" + String.valueOf(location.x) + "," + String.valueOf(location.y) + ") " + location.point;
        assertEquals("(0,0) N",result);
    }

    @Test
    public void should_return_0_0_S_when_0_0_E_given_R(){
        String commands = "R";
        Mar mar = new Mar();
        Location location = new Location(0,0,"E");
        location = mar.action(location, commands);
        String result = "(" + String.valueOf(location.x) + "," + String.valueOf(location.y) + ") " + location.point;
        assertEquals("(0,0) S",result);
    }
}
