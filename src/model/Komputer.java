package model;

import java.util.ArrayList;

public class Komputer {
    //atrybuty
    private String nazwa;
    private double koszt = 0, kosztPamieci = 0;
    private double wydajnosc = 0, wydajnoscPamieci = 0;
    private boolean dys = false, karGra = false, pam = false, plyGlo = false, pro = false, obu = false;

    //skladowe
    private static DyskTwardy dyskTwardy;
    private static KartaGraf kartaGraf;
    private static Obudowa obudowa;
    private static ArrayList<Pamiec> pamiecArrayList = new ArrayList<Pamiec>();
    private static PlytaGlowna plytaGlowna;
    private static Procesor procesor;


    public static DyskTwardy getDyskTwardy() { return dyskTwardy; }
    public static KartaGraf getKartaGraf() { return kartaGraf; }
    public static Obudowa getObudowa() { return obudowa; }
    public static ArrayList<Pamiec> getPamiecArrayList() { return pamiecArrayList; }
    public static PlytaGlowna getPlytaGlowna() { return plytaGlowna; }
    public static Procesor getProcesor() { return procesor; }


    public String getNazwa() {return nazwa;}
    public boolean czyDys() {return dys;}
    public boolean czyKarGra() {return karGra;}
    public boolean czyPam() {return pam;}
    public boolean czyPlyGlo() {return plyGlo;}
    public boolean czyPro() {return pro;}
    public boolean czyObu() {return obu;}

    // dodawanie komponentow
    public void dodajDyskTwardy(DyskTwardy d) {
        dyskTwardy = d;
        dys=true;
        System.out.println("DODANO DYSK TWARDY");
    }
    public void dodajKartaGraf(KartaGraf kg) {
        kartaGraf = kg;
        karGra=true;
        System.out.println("DODANO KARTE GRAFICZNA");
    }
   public void dodajPamiec(Pamiec p) {
        pamiecArrayList.add(p);
        pam=true;
        System.out.println("DODANO PAMIEC");
    }
    public void dodajPlytaGlowna(PlytaGlowna pg) {
        plytaGlowna = pg;
        plyGlo=true;
        System.out.println("DODANO PLYTE GLOWNA");
    }
    public void dodajProcesor(Procesor p) {
        procesor = p;
        pro=true;
        System.out.println("DODANO PROCESOR");
    }
    public void dodajObudowa(Obudowa o) {
        obudowa = o;
        obu=true;
        System.out.println("DODANO OBUDOWE");
    }
    // metody i funkcje
    public boolean isCzyKompletny() {
        if(karGra && pam && plyGlo && pro && obu) return true;
        else return false;
    }
    public void wlaczKomputer() {
        if(isCzyKompletny()) {
            if (obudowa.isCzyWlaczony()) System.out.println("KOMPUTER JEST JUZ URUCHOMIONY");
            else obudowa.wlacz();
        } else System.out.println("BRAK NIEZBEDNYCH PODZESPOLOW. NIE MOZNA WLACZYC, NIE MOZNA WYLACZYC KOMPUTERA");
    }
    public void wylaczKomputer() {
        if (isCzyKompletny()) {
            if (obudowa.isCzyWlaczony()) obudowa.wylacz();
            else System.out.println("KOMPUTER POZOSTAJE WYLACZONY");
        } else System.out.println("BRAK NIEZBEDNYCH PODZESPOLOW. NIE MOZNA WLACZYC, NIE MOZNA WYLACZYC KOMPUTERA");
    }
    public void resetujKomputer() {
        if(isCzyKompletny()) {
            if(obudowa.isCzyWlaczony()) {
                wylaczKomputer();
                wlaczKomputer();
            } else System.out.println("NIE MOZNA ZRESETOWAC, KIEDY WYLACZONY. WLACZ KOMPUTER");
        } else System.out.println("BRAK NIEZBEDNYCH PODZESPOLOW. NIE MOZNA ZRESETOWAC KOMPUTERA");
    }
    public void zwiekszTaktowanieProcesora(double ile) {
        if(isCzyKompletny()) procesor.zwiekszTaktowanie(ile);
        else System.out.println("ABY ZWIEKSZYC TAKTOWANIE PROCESORA KOMPUTER KOMPUTER MUSI BYC KOMPLETNY");
    }
    public void zmniejszTaktowanieProcesora(double ile) {
        if(isCzyKompletny()) procesor.zmniejszTaktowanie(ile);
        else System.out.println("ABY ZMNIEJSZYC TAKTOWANIE PROCESORA KOMPUTER MUSI BYC KOMPLETNY");
    }
    public double przeprowadzTestWydajnosci() {
        if(isCzyKompletny()) {
            for(int i = 0; i <= pamiecArrayList.size()-1; i++) {
                wydajnoscPamieci = wydajnoscPamieci + pamiecArrayList.get(i).getPojemnosc();
            }
            this.wydajnosc = kartaGraf.getPamiec() + kartaGraf.getSzerMagistr()*0.01 + wydajnoscPamieci + procesor.getLiczbaRdzeni()*procesor.getZegar();
            System.out.println("WYNIK TESTU: "+ wydajnosc);
            return wydajnosc;
        } else {
            System.out.println("KOMPUTER NIE POSIADA WYSTARCZAJACEJ ILOSCI PODZESPOLOW DO DDZIALANIA. BRAK MOZLIWOSCI PRZEPROWADZENIA TESTU");
            return wydajnosc;
        }
    }
    public double obliczKosztPodzespolow() {
        koszt = 0;
        kosztPamieci = 0;
        if (dys) koszt += dyskTwardy.getCena();
        if (karGra) koszt += kartaGraf.getCena();
        if (obu) koszt += obudowa.getCena();
        if (pam) {
            for (int i = 0; i <= pamiecArrayList.size()-1; i++) {
                kosztPamieci = kosztPamieci + pamiecArrayList.get(i).getCena();
            }
            koszt += kosztPamieci;
        }
        if (plyGlo) koszt += plytaGlowna.getCena();
        if (pro) koszt += procesor.getCena();
        System.out.println("KOSZT PODZESPOLOW: " + koszt);
        return koszt;
    }

    //konstruktor
    public Komputer(String nazwa, boolean dys, boolean karGra, boolean pam, boolean plyGlo, boolean pro, boolean obu) {
        this.nazwa = nazwa;
        this.dys = dys;
        this.karGra = karGra;
        this.pam = pam;
        this.plyGlo = plyGlo;
        this.pro = pro;
        this.obu = obu;

        if (dys) dyskTwardy = new DyskTwardy("dysk twardy", "SAMSUNG", "850 PRO", 669, 256);
        else dyskTwardy = new DyskTwardy("dysk twardy","0","0",0,0);
        if (karGra) kartaGraf = new KartaGraf("karta graficzna", "ASUS", "GTX 1070", 2119, 256, 8);
        else kartaGraf = new KartaGraf("karta graficzna","0","0",0,0,0);
        if (pam) {
            for(int i = 0; i < 2; i++) {
            pamiecArrayList.add(new Pamiec("pamiec", "CORSAIR", "Vengeance LPX", 255, 8));
            }
        } else pamiecArrayList.add(new Pamiec("pamiec","0","0",0,0));
        if (plyGlo) plytaGlowna = new PlytaGlowna("plyta glowna","GIGABYTE","GA-Z170-D3H",599,"DDR4", "LGA1151" );
        else plytaGlowna = new PlytaGlowna("plyta glowna","0","0",0,"0","0");
        if (pro) procesor =  new Procesor("procesor","INTEL","i7-7700",1519,3.6,4.2,3.6,4);
        else procesor = new Procesor("procesor","0","0",0,0,0,0,0);
        if (obu) obudowa = new Obudowa("obudowa","bequiet!", "Silent Base", 639, "czarny");
        else obudowa = new Obudowa("obudowa","0","0",0,"0");
    }
}