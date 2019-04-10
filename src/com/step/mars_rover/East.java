package com.step.mars_rover;

import java.util.Objects;

public class East extends Direction {
    private String name;

    East() {
        this.name ="East";
    }

    @Override
    Direction getRightDirection() {
        return new South();
    }

    @Override
    Direction getLeftDirection() {
        return new North();
    }

    @Override
    Integer getX() {
        return 1;
    }

    @Override
    Integer getY() {
        return 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        East east = (East) o;
        return Objects.equals(name, east.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
