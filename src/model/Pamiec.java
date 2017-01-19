package model;

public class Pamiec extends Komponent {
    private double pojemnosc;

    public double getPojemnosc() {
        return pojemnosc;
    }

    public Pamiec (String nazwa, String producent, String model, double cena, double pojemnosc) {
        super(nazwa, producent, model, cena);
        this.pojemnosc = pojemnosc;
    }
}
