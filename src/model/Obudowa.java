package model;

public class Obudowa extends Komponent {
    private boolean czyWlaczony = false;
    private String kolor;

    public String getKolor() { return kolor; }

    public boolean isCzyWlaczony() { return czyWlaczony; }

    public void wlacz() {
        czyWlaczony = true;
        System.out.println("KOMPUTER WLACZONY ");
    }

    public void wylacz() {
        czyWlaczony = false;
        System.out.println("KOMPUTER WYLACZONY ");
    }

    public Obudowa(String nazwa, String producent, String model, double cena, String kolor) {
        super(nazwa, producent, model, cena);
        this.kolor = kolor;
    }
}

