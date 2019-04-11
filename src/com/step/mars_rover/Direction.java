package com.step.mars_rover;

abstract class Direction {
    static Direction NORTH = new North();
    static Direction SOUTH = new South();
    static Direction EAST = new East();
    static Direction WEST = new West();

    abstract Direction getRightDirection();

    abstract Direction getLeftDirection();

    abstract Integer getX();

    abstract Integer getY();
}
