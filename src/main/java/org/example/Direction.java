package org.example;

public enum Direction {
    NORD{
        @Override
        public Direction tournerDroite() {
            return EST;
        }
        @Override
        public Direction tournerGauche() {
            return OUEST;
        }
    }, EST {
        @Override
        public Direction tournerDroite() {
            return SUD;
        }
        @Override
        public Direction tournerGauche() {
            return NORD;
        }
    }, SUD {
        @Override
        public Direction tournerDroite() {
            return OUEST;
        }
        @Override
        public Direction tournerGauche() {
            return EST;
        }
    }, OUEST {
        @Override
        public Direction tournerDroite() {
            return NORD;
        }
        @Override
        public Direction tournerGauche() {
            return SUD;
        }
    };

    public Direction tournerDroite() {
        return null;
    }

    public Direction tournerGauche() {
        return null;
    }
}
