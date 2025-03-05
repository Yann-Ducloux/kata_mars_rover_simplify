package org.example;

import java.util.Arrays;
import java.util.List;

import static org.example.Command.*;

public class MarsRover {
    Position position;
    Direction direction;
    public MarsRover(Position position, Direction direction) {
        this.position = position;
        this.direction = direction;
    }


    public void command(String instructions) {
        String[] listInstruction = instructions.split("");
        executesInstructions(listInstruction);
    }

    private void executesInstructions(String[] listInstruction) {
        Arrays.stream(listInstruction).map(Command::convert).forEach(this::execute);
    }

    private void execute(Command commandChoose) {
        switch (commandChoose) {
            case AVANCER -> avancer();
            case TOURNER_DROITE -> tournerDroite();
            case TOURNER_GAUCHE -> tournerGauche();
        }
    }

    private void tournerGauche() {
        direction = direction.tournerGauche();
    }

    private void tournerDroite() {
        direction = direction.tournerDroite();
    }

    private void avancer() {
        position.avancer(direction);
    }

    public Position getPosition() {
        return position;
    }

    public Direction getDirection() {
        return direction;
    }
}
