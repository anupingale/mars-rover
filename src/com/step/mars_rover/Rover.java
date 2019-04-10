package com.step.mars_rover;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

class Rover {

    private Position position;
    private List<Move> moves;
    private Position position1;

    Rover(Position position) {
        this.position = position;
        moves = new ArrayList<>();
    }

    Rover addMove(Move move) {
        this.moves.add(move);
        return this;
    }

    Position getFinalPosition() {
        List<Position> lastPosition = new ArrayList<>();
        lastPosition.add(position);

        this.moves.forEach(move -> {
            position1 = getPosition(lastPosition.get(lastPosition.size() - 1), move);
            lastPosition.add(position1);
        });
        return lastPosition.get(lastPosition.size() - 1);
    }

    private Position getPosition(Position lastPosition, Move move) {
        return lastPosition.getPosition(move);
    }

    public enum Move {
        L,
        M,
        R
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rover rover = (Rover) o;
        return Objects.equals(position, rover.position) &&
                Objects.equals(moves, rover.moves);
    }

    @Override
    public int hashCode() {
        return Objects.hash(position, moves);
    }
}