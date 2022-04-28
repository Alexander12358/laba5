package com.company.model;

public class Coordinates {
    private long x;
    private Double y;

    public Coordinates(long x, Double y) {
        this.x = x;
        this.y = y;
    }

    public long getX() {
        return x;
    }

    public Double getY() {
        return y;
    }

    @Override
    public String toString() {
        return "Coordinates{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
