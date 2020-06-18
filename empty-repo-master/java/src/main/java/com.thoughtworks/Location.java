package com.thoughtworks;

public class Location {
    int x;
    int y;
    String point;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String getPoint() {
        return point;
    }

    public void setPoint(String point) {
        this.point = point;
    }

    public Location(int x, int y, String point) {
        this.x = x;
        this.y = y;
        this.point = point;
    }
}
