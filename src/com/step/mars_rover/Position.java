package com.step.mars_rover;

import java.util.Objects;

class Position {
    private final int x;
    private final int y;
    private final Direction facing;

    Position(int x, int y, Direction facing) {
        this.x = x;
        this.y = y;
        this.facing = facing;
    }

    Position getPosition(Rover.Move move) {
        if (this.facing == Direction.E) return this.handleEast(move);
        if (this.facing == Direction.S) return this.handleSouth(move);
        if (this.facing == Direction.N) return this.handleNorth(move);
        return this.handleWest(move);
    }

    enum NorthDirection {
        L(0, 0, Direction.W),
        R(0, 0, Direction.E),
        M(0, 1, Direction.N);

        private final int x;
        private final int y;
        private final Direction direction;

        NorthDirection(int x, int y, Direction direction) {
            this.x = x;
            this.y = y;
            this.direction = direction;
        }
    }

    enum SouthDirection {
        L(0, 0, Direction.E),
        R(0, 0, Direction.W),
        M(0, -1, Direction.S);

        private final int x;
        private final int y;
        private final Direction direction;

        SouthDirection(int x, int y, Direction direction) {
            this.x = x;
            this.y = y;
            this.direction = direction;
        }
    }

    enum EastDirection {
        L(0, 0, Direction.N),
        R(0, 0, Direction.S),
        M(1, 0, Direction.E);

        private final int x;
        private final int y;
        private final Direction direction;

        EastDirection(int x, int y, Direction direction) {
            this.x = x;
            this.y = y;
            this.direction = direction;
        }
    }

    enum WestDirection {
        L(0, 0, Direction.S),
        R(0, 0, Direction.N),
        M(-1, 0, Direction.W);

        private final int x;
        private final int y;
        private final Direction direction;

        WestDirection(int x, int y, Direction direction) {
            this.x = x;
            this.y = y;
            this.direction = direction;
        }
    }

    private Position handleNorth(Rover.Move move) {
        NorthDirection direction = Position.NorthDirection.valueOf(move.name());
        return new Position(this.x + direction.x, this.y + direction.y, direction.direction);
    }

    private Position handleSouth(Rover.Move move) {
        SouthDirection direction = Position.SouthDirection.valueOf(move.name());
        return new Position(this.x + direction.x, this.y + direction.y, direction.direction);
    }

    private Position handleEast(Rover.Move move) {
        EastDirection direction = Position.EastDirection.valueOf(move.name());
        return new Position(this.x + direction.x, this.y + direction.y, direction.direction);
    }

    private Position handleWest(Rover.Move move) {
        WestDirection direction = Position.WestDirection.valueOf(move.name());
        return new Position(this.x + direction.x, this.y + direction.y, direction.direction);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Position position = (Position) o;
        return x == position.x &&
                y == position.y &&
                facing == position.facing;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y, facing);
    }
}
