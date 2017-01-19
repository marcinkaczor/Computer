package model;

public class KartaGraf extends Komponent {
    private int szerMagistr;
    private int pamiec;

    public int getSzerMagistr() {
        return szerMagistr;
    }
    public int getPamiec() {
        return pamiec;
    }

    public KartaGraf (String nazwa, String producent, String model, double cena, int szerMagistr, int pamiec) {
        super(nazwa, producent, model, cena);
        this.szerMagistr = szerMagistr;
        this.pamiec = pamiec;
    }
}
