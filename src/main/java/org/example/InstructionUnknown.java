package org.example;

public class InstructionUnknown extends RuntimeException {
    public InstructionUnknown(String instruction) {
        super(instruction + " est une instruction inconnue");
    }
}
