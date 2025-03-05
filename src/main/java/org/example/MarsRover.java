package org.example;

import java.util.List;

public class MarsRover {
    Position position;
    Direction direction;
    public MarsRover(Position position, Direction direction) {
        this.position = position;
        this.direction = direction;
    }


    public void command(String instructions) {
        List<String> listInstruction = convertInList(instructions);
        executesInstructions(listInstruction);
    }

    private static List<String> convertInList(String instructions) {
        return instructions.codePoints()
                .mapToObj(c -> String.valueOf((char) c))
                .toList();
    }

    private void executesInstructions(List<String> listInstruction) {
        listInstruction.stream().map(Command::convert).forEach(this::execute);
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
