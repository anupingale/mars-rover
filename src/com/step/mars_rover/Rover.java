package com.step.mars_rover;

import java.util.ArrayList;
import java.util.List;

class Rover {
    public enum Move {
        L,
        M,
        R
    }

    private Position position;
    private List<Move> moves;

    Rover(Position position) {
        this.position = position;
        moves = new ArrayList<>();
    }

    Rover addMove(Move move) {
        this.moves.add(move);
        return this;
    }

    Position getFinalPosition(int x, int y) {
        this.moves.forEach(move -> {
            try {
                this.position.moveRover(move,x,y);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
        return position;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rover rover = (Rover) o;
        return position.equals(rover.position) &&
                moves.equals(rover.moves);
    }

}