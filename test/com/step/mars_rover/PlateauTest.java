package com.step.mars_rover;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PlateauTest {
    @Test
    void shouldReturnFinalRoverPosition() {
        Plateau plateau = new Plateau(5, 5);
        Rover rover1 = new Rover(new Position(1, 2, Direction.NORTH));
        Rover rover2 = new Rover(new Position(3, 3, Direction.EAST));

        rover1.addMove(Rover.Move.L).addMove(Rover.Move.M).addMove(Rover.Move.L).addMove(Rover.Move.M)
                .addMove(Rover.Move.L).addMove(Rover.Move.M).addMove(Rover.Move.L).addMove(Rover.Move.M)
                .addMove(Rover.Move.M);

        rover2.addMove(Rover.Move.M).addMove(Rover.Move.M).addMove(Rover.Move.R).addMove(Rover.Move.M)
                .addMove(Rover.Move.M).addMove(Rover.Move.R).addMove(Rover.Move.M).addMove(Rover.Move.R)
                .addMove(Rover.Move.R).addMove(Rover.Move.M);

        plateau.landRover(rover1);
        plateau.landRover(rover2);

        Map<Rover, Position> actual = plateau.getRoverPositions();

        Map<Rover, Position> expected = new HashMap<>();
        expected.put(rover1, new Position(1, 3, Direction.NORTH));
        expected.put(rover2, new Position(5, 1, Direction.EAST));

        assertEquals(expected, actual);
    }
}