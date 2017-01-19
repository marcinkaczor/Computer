package model;

public class Procesor extends Komponent {
    private double zegar, maxZegar, minZegar;
    private int liczbaRdzeni;

    public double getZegar() {
        return zegar;
    }
    public double getMaxZegar() {
        return maxZegar;
    }
    public double getMinZegar() {
        return minZegar;
    }
    public int getLiczbaRdzeni() {
        return liczbaRdzeni;
    }

    public void zwiekszTaktowanie(double oIle) {
        zegar = zegar + oIle;
        if (zegar > maxZegar) zegar = maxZegar;
        if (zegar < minZegar) zegar = minZegar;
        System.out.println("Taktowanie procesora = " + zegar);
    }
    public void zmniejszTaktowanie(double oIle) {
        zegar = zegar - oIle;
        if (zegar > maxZegar) zegar = maxZegar;
        if (zegar < minZegar) zegar = minZegar;
        System.out.println("Taktowanie procesora = " + zegar);
    }

    public Procesor(String nazwa, String producent, String model, double cena, double zegar, double maxZegar, double minZegar, int liczbaRdzeni) {
        super(nazwa, producent, model, cena);
        this.zegar = zegar;
        this.maxZegar = maxZegar;
        this.minZegar = minZegar;
        this.liczbaRdzeni = liczbaRdzeni;
    }
}

