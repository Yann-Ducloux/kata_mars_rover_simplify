package org.example;

import org.junit.jupiter.api.Test;

import static org.example.Direction.*;
import static org.junit.jupiter.api.Assertions.*;

class MarsRoverTest {

    @Test
    void should_be_increment_y_when_avance_direction_NORD() {
        MarsRover marsRoverActual = new MarsRover(position(0, 0), NORD);
        Position position = position(0, 1);
        var direction = NORD;
        marsRoverActual.command("A");
        assertEquals(position, marsRoverActual.getPosition());
        assertEquals(direction, marsRoverActual.getDirection());
    }
    @Test
    void should_be_increment_x_when_avance_direction_est() {
        MarsRover marsRoverActual = new MarsRover(position(0, 0), EST);
        Position position = position(1, 0);
        var direction = EST;
        marsRoverActual.command("A");
        assertEquals(position, marsRoverActual.getPosition());
        assertEquals(direction, marsRoverActual.getDirection());
    }
    @Test
    void should_be_decrement_y_when_avance_direction_sud() {
        MarsRover marsRoverActual = new MarsRover(position(0, 0), SUD);
        Position position = position(0, -1);
        var direction = SUD;
        marsRoverActual.command("A");
        assertEquals(position, marsRoverActual.getPosition());
        assertEquals(direction, marsRoverActual.getDirection());
    }
    @Test
    void should_be_decrement_x_when_avance_direction_ouest() {
        MarsRover marsRoverActual = new MarsRover(position(0, 0), OUEST);
        Position position = position(-1, 0);
        var direction = OUEST;
        marsRoverActual.command("A");
        assertEquals(position, marsRoverActual.getPosition());
        assertEquals(direction, marsRoverActual.getDirection());
    }

    @Test
    void should_be_direction_est_when_tourner_droite_direction_nord() {
        MarsRover marsRoverActual = new MarsRover(position(0, 0), NORD);
        Position position = position(0, 0);
        var direction = EST;
        marsRoverActual.command("D");
        assertEquals(position, marsRoverActual.getPosition());
        assertEquals(direction, marsRoverActual.getDirection());
    }
    @Test
    void should_be_direction_sud_when_tourner_droite_direction_est() {
        MarsRover marsRoverActual = new MarsRover(position(0, 0), EST);
        Position position = position(0, 0);
        var direction = SUD;
        marsRoverActual.command("D");
        assertEquals(position, marsRoverActual.getPosition());
        assertEquals(direction, marsRoverActual.getDirection());
    }
    @Test
    void should_be_direction_ouest_when_tourner_droite_direction_sud() {
        MarsRover marsRoverActual = new MarsRover(position(0, 0), SUD);
        Position position = position(0, 0);
        var direction = OUEST;
        marsRoverActual.command("D");
        assertEquals(position, marsRoverActual.getPosition());
        assertEquals(direction, marsRoverActual.getDirection());
    }
    @Test
    void should_be_direction_nord_when_tourner_droite_direction_ouest() {
        MarsRover marsRoverActual = new MarsRover(position(0, 0), OUEST);
        Position position = position(0, 0);
        var direction = NORD;
        marsRoverActual.command("D");
        assertEquals(position, marsRoverActual.getPosition());
        assertEquals(direction, marsRoverActual.getDirection());
    }
    @Test
    void should_be_direction_ouest_when_tourner_gaucher_direction_nord() {
        MarsRover marsRoverActual = new MarsRover(position(0, 0), NORD);
        Position position = position(0, 0);
        var direction = OUEST;
        marsRoverActual.command("G");
        assertEquals(position, marsRoverActual.getPosition());
        assertEquals(direction, marsRoverActual.getDirection());
    }
    @Test
    void should_be_direction_sud_when_tourner_gaucher_direction_ouest() {
        MarsRover marsRoverActual = new MarsRover(position(0, 0), OUEST);
        Position position = position(0, 0);
        var direction = SUD;
        marsRoverActual.command("G");
        assertEquals(position, marsRoverActual.getPosition());
        assertEquals(direction, marsRoverActual.getDirection());
    }
    @Test
    void should_be_direction_est_when_tourner_gaucher_direction_est() {
        MarsRover marsRoverActual = new MarsRover(position(0, 0), SUD);
        Position position = position(0, 0);
        var direction = EST;
        marsRoverActual.command("G");
        assertEquals(position, marsRoverActual.getPosition());
        assertEquals(direction, marsRoverActual.getDirection());
    }
    @Test
    void should_be_direction_nord_when_tourner_gaucher_direction_est() {
        MarsRover marsRoverActual = new MarsRover(position(0, 0), EST);
        Position position = position(0, 0);
        var direction = NORD;
        marsRoverActual.command("G");
        assertEquals(position, marsRoverActual.getPosition());
        assertEquals(direction, marsRoverActual.getDirection());
    }
    @Test
    void should_be_stop_when_receive_a_instruction_unknows() {

        MarsRover marsRoverActual = new MarsRover(position(0, 0), EST);
        Exception exception = assertThrows(InstructionUnknown.class, () -> {
            marsRoverActual.command("Y");
        });

        String expectedMessage = "Y est une instruction inconnue";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));

    }
    @Test
    void should_be_read_instructions_nord_when_receive_insctruction() {
        MarsRover marsRoverActual = new MarsRover(position(0, 0), NORD);
        Position position = position(2, 1);
        var direction = NORD;
        marsRoverActual.command("DAAGA");
        assertEquals(position, marsRoverActual.getPosition());
        assertEquals(direction, marsRoverActual.getDirection());
    }
    private Position position(int x, int y) {
        return new Position(x, y);
    }

}