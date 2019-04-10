package com.step.mars_rover;

abstract class Direction {
    public static Direction NORTH = new North();
    public static Direction SOUTH = new South();
    public static Direction EAST = new East();
    public static Direction WEST = new West();

    abstract Direction getRightDirection();
    abstract Direction getLeftDirection();
    abstract Integer getX();
    abstract Integer getY();
}
