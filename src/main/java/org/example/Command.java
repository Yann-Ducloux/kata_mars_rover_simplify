package org.example;

public enum Command {
    AVANCER("A"), TOURNER_DROITE("D"), TOURNER_GAUCHE("G");

    String code;
    Command(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }
    static Command convert(String code) {
        for (Command command : values()) {
            if (command.getCode().equals(code)) {
                return command;
            }
        }
        throw new InstructionUnknown(code);
    }
}
