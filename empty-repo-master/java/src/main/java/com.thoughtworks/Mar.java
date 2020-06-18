package com.thoughtworks;

import java.util.HashMap;
import java.util.Map;

public class Mar {

    private static Map<String,String> LEFT_POINTS = new HashMap<String,String>(){{
        put("N", "W");
        put("W", "S");
        put("S", "E");
        put("E", "N");
    }};

    public Location action(Location location, String commands){
        if(commands.equals("M")){
            location = move(location);
        }else if(commands.equals("L")){
            location.point = turnLeft(location.point);
        }else{
            location.point = turnRight(location.point);
        }
        return location;
    }

    public Location move(Location location){
        if(location.point.equals("N")){
            location.y ++;
        }else if (location.point.equals("W")){
            location.x --;
        }else if (location.point.equals("S")){
            location.y --;
        }else if (location.point.equals("E")){
            location.x ++;
        }
        return location;
    }

    public String turnLeft(String point){
        return LEFT_POINTS.get(point);
    }

    public String turnRight(String point){
        if(point.equals("N")){
            point = "E";
        }else if (point.equals("E")){
            point = "S";
        }else if (point.equals("S")){
            point = "W";
        }else if (point.equals("W")){
            point = "N";
        }
        return point;
    }


}
