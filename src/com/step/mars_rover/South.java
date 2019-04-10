package com.step.mars_rover;

import java.util.Objects;

public class South extends Direction {
    private String name;

    South() {
        name = "South";
    }

    @Override
    Direction getRightDirection() {
        return new West();
    }

    @Override
    Direction getLeftDirection() {
        return new East();
    }

    @Override
    Integer getX() {
        return 0;
    }

    @Override
    Integer getY() {
        return -1;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        South south = (South) o;
        return Objects.equals(name, south.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
