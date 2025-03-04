package org.example;

public class MarsRover {
    Position position;
    Direction direction;
    public MarsRover(Position position, Direction direction) {
        this.position = position;
        this.direction = direction;
    }


    public void command(String command) {
        switch (command) {
            case "A" -> avancer();
            case "D" -> tournerDroite();
            case "G" -> tournerGauche();
            default -> {}
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
