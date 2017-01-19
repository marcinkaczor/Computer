package model;

public class DyskTwardy extends Komponent {
    private double pojemnosc;

    public double getPojemnosc() {
        return pojemnosc;
    }

    public DyskTwardy (String nazwa, String producent, String model, double cena, double pojemnosc) {
        super(nazwa, producent, model, cena);
        this.pojemnosc = pojemnosc;
    }
}
