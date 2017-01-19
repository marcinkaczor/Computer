package model;

public class Komponent {
    private String nazwa;
    private String producent;
    private String model;
    private double cena;


    public String getNazwa() { return nazwa; }
    public String getProducent() {
        return producent;
    }
    public String getModel() {
        return model;
    }
    public double getCena() { return cena; }

    public Komponent(String nazwa, String producent, String model, double cena) {
        this.nazwa = nazwa;
        this.producent = producent;
        this.model = model;
        this.cena = cena;
    }
}
