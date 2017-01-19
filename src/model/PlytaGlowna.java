package model;

public class PlytaGlowna extends Komponent {
    private String typPamieci, typSocketa;

    public String getTypPamieci() {
        return typPamieci;
    }
    public String getTypSocketa() {
        return typSocketa;
    }

    public PlytaGlowna(String nazwa, String producent, String model, double cena, String typPamieci, String typSocketa) {
        super(nazwa, producent, model, cena);
        this.typPamieci = typPamieci;
        this.typSocketa = typSocketa;
    }
}

