package com.step.mars_rover;

import java.util.Objects;

class Position {
    private int x;
    private int y;
    private Direction direction;

    Position(int x, int y, Direction facing) {
        this.x = x;
        this.y = y;
        this.direction = facing;
    }

    private void move() {
        this.x += this.direction.getX();
        this.y += this.direction.getY();
    }

    void moveRover(Rover.Move move) {
        if (move == Rover.Move.L) this.direction = this.direction.getLeftDirection();
        if (move == Rover.Move.R) this.direction = this.direction.getRightDirection();
        if (move == Rover.Move.M) this.move();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Position position = (Position) o;
        return x == position.x &&
                y == position.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}
