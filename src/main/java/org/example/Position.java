package org.example;

import java.util.Objects;

public class Position {
    int x;
    int y;

    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Position position = (Position) o;
        return x == position.x && y == position.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    public void avancer(Direction direction) {
        if(direction == Direction.NORD) {
            y++;
        } else if(direction == Direction.EST) {
            x++;
        } else if(direction == Direction.SUD) {
            y--;
        } else if(direction == Direction.OUEST) {
            x--;
        }
    }
}
