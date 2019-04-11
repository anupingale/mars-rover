package com.step.mars_rover;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
        this.rovers.forEach(rover -> finalPositions.put(rover, rover.getFinalPosition(this.x,this.y)));
        return finalPositions;
    }

}
