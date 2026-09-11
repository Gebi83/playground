package de.mgebert;

public sealed interface Dosage {

    record Tablet(int morning, int midday, int evening) implements Dosage {}

    record Infusion(int speed, int volume) implements Dosage {}

    static String format(Dosage dosage){
        return switch (dosage) {
            case Tablet (int m, int mid, int ev) -> String.format("Tablet: morning=%d, midday=%d, evening=%d", m,mid, ev);
            case Infusion (_, int volume) -> String.format("Infusion: volume=%d", volume);
        };
    }
}