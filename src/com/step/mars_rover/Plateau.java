package com.step.mars_rover;

import java.util.*;

class Plateau {
    private final int x;
    private final int y;
    private List<Rover> rovers;

    Plateau(int x, int y) {
        this.x = x;
        this.y = y;
        rovers = new ArrayList<>();
    }

    void landRover(Rover rover) {
        rovers.add(rover);
    }

    Map<Rover, Position> getRoverPositions() {
        Map<Rover, Position> finalPositions = new HashMap<>();
        this.rovers.forEach(rover -> finalPositions.put(rover, this.getFinalRoverPosition(rover)));
        return finalPositions;
    }

    private Position getFinalRoverPosition(Rover rover) {
        return rover.getFinalPosition();
    }
}
