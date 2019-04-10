package com.step.mars_rover;

import java.util.Objects;

public class West extends Direction {
    private String name;

    West() {
        name = "West";
    }

    @Override
    Direction getRightDirection() {
        return new North();
    }

    @Override
    Direction getLeftDirection() {
        return new South();
    }

    @Override
    Integer getX() {
        return -1;
    }

    @Override
    Integer getY() {
        return 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        West west = (West) o;
        return Objects.equals(name, west.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
