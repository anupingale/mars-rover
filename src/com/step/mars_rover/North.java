package com.step.mars_rover;

import java.util.Objects;

public class North extends Direction {
    private String name;

    North() {
        this.name ="North";
    }

    @Override
    Direction getRightDirection() {
        return new East();
    }

    @Override
    Direction getLeftDirection() {
        return new West();
    }

    @Override
    Integer getX() {
        return 0;
    }

    @Override
    Integer getY() {
        return 1;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        North north = (North) o;
        return Objects.equals(name, north.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
