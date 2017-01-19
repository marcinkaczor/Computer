package model;

public class Main {

    public static void main(String[] args){

        //tworzenie komputera pc z domyslnymi podzespolami
        Komputer pc = new Komputer("pc",true,true,true,true, true,true);
        System.out.println("Jestem komputerem " + pc.getNazwa() + ". Posiadam wszystkie podzespoly niezbedne do dzialania.");
        System.out.println(pc.getDyskTwardy().getNazwa()+": "+pc.getDyskTwardy().getProducent()+", "+pc.getDyskTwardy().getModel()+", "+pc.getDyskTwardy().getCena()+"zl, "+pc.getDyskTwardy().getPojemnosc()+"GB");
        System.out.println(pc.getKartaGraf().getNazwa()+": "+pc.getKartaGraf().getProducent()+", "+pc.getKartaGraf().getModel()+", "+pc.getKartaGraf().getCena()+"zl, "+pc.getKartaGraf().getSzerMagistr()+"bit, "+pc.getKartaGraf().getPamiec()+"MB");
        System.out.println(pc.getObudowa().getNazwa()+": "+pc.getObudowa().getProducent()+", "+pc.getObudowa().getModel()+", "+pc.getObudowa().getCena()+"zl, "+pc.getObudowa().getKolor()+" kolor");
        System.out.println(pc.getPamiecArrayList().get(0).getNazwa()+" nr1: "+pc.getPamiecArrayList().get(0).getProducent()+", "+pc.getPamiecArrayList().get(0).getModel()+", "+pc.getPamiecArrayList().get(0).getCena()+"zl, "+pc.getPamiecArrayList().get(0).getPojemnosc()+"GB");
        System.out.println(pc.getPamiecArrayList().get(1).getNazwa()+" nr2: "+pc.getPamiecArrayList().get(1).getProducent()+", "+pc.getPamiecArrayList().get(1).getModel()+", "+pc.getPamiecArrayList().get(1).getCena()+"zl, "+pc.getPamiecArrayList().get(1).getPojemnosc()+"GB");
        System.out.println(pc.getPlytaGlowna().getNazwa()+": "+pc.getPlytaGlowna().getProducent()+", "+pc.getPlytaGlowna().getModel()+", "+pc.getPlytaGlowna().getCena()+"zl, "+pc.getPlytaGlowna().getTypPamieci()+", "+pc.getPlytaGlowna().getTypSocketa());
        System.out.println(pc.getProcesor().getNazwa()+": "+pc.getProcesor().getProducent()+", "+pc.getProcesor().getModel()+", "+pc.getProcesor().getCena()+"zl, "+pc.getProcesor().getZegar()+"GHz, "+pc.getProcesor().getMinZegar()+"GHz, "+pc.getProcesor().getMaxZegar()+"Ghz, "+pc.getProcesor().getLiczbaRdzeni()+" rdzenie");
        pc.wlaczKomputer();
        pc.wylaczKomputer();
        pc.resetujKomputer();
        pc.wlaczKomputer();
        pc.przeprowadzTestWydajnosci();
        pc.obliczKosztPodzespolow();
        pc.zwiekszTaktowanieProcesora(0.2);
        pc.zwiekszTaktowanieProcesora(1);


        //tworzenie komputera pc2 z niedoborem potrzebnych podzespolow
        Komputer pc2 = new Komputer("pc2",false,true,true,true, false,false);
        System.out.println("\nJestem komputerem " + pc2.getNazwa() + ". Nie posiadam podzespolow niezbednych do dzialania.");
        System.out.println(pc2.getDyskTwardy().getNazwa()+": "+pc2.getDyskTwardy().getProducent()+", "+pc2.getDyskTwardy().getModel()+", "+pc2.getDyskTwardy().getCena()+"zl, "+pc2.getDyskTwardy().getPojemnosc()+"GB");
        System.out.println(pc2.getKartaGraf().getNazwa()+": "+pc2.getKartaGraf().getProducent()+", "+pc2.getKartaGraf().getModel()+", "+pc2.getKartaGraf().getCena()+"zl, "+pc2.getKartaGraf().getSzerMagistr()+"bit, "+pc2.getKartaGraf().getPamiec()+"GB");
        System.out.println(pc2.getObudowa().getNazwa()+": "+pc2.getObudowa().getProducent()+", "+pc2.getObudowa().getModel()+", "+pc2.getObudowa().getCena()+"zl, "+pc2.getObudowa().getKolor()+" kolor");
        System.out.println(pc2.getPamiecArrayList().get(0).getNazwa()+" nr1: "+pc2.getPamiecArrayList().get(0).getProducent()+", "+pc2.getPamiecArrayList().get(0).getModel()+", "+pc2.getPamiecArrayList().get(0).getCena()+"zl, "+pc2.getPamiecArrayList().get(0).getPojemnosc()+"GB");
        System.out.println(pc2.getPamiecArrayList().get(1).getNazwa()+" nr2: "+pc2.getPamiecArrayList().get(1).getProducent()+", "+pc2.getPamiecArrayList().get(1).getModel()+", "+pc2.getPamiecArrayList().get(1).getCena()+"zl, "+pc2.getPamiecArrayList().get(1).getPojemnosc()+"GB");
        System.out.println(pc2.getPlytaGlowna().getNazwa()+": "+pc2.getPlytaGlowna().getProducent()+", "+pc2.getPlytaGlowna().getModel()+", "+pc2.getPlytaGlowna().getCena()+"zl, "+pc2.getPlytaGlowna().getTypPamieci()+", "+pc2.getPlytaGlowna().getTypSocketa());
        System.out.println(pc2.getProcesor().getNazwa()+": "+pc2.getProcesor().getProducent()+", "+pc2.getProcesor().getModel()+", "+pc2.getProcesor().getCena()+"zl, "+pc2.getProcesor().getZegar()+"GHz, "+pc2.getProcesor().getMinZegar()+"GHz, "+pc2.getProcesor().getMaxZegar()+"Ghz, "+pc2.getProcesor().getLiczbaRdzeni()+" rdzenie");
        pc2.wlaczKomputer();
        pc2.zwiekszTaktowanieProcesora(0.2);
        pc2.przeprowadzTestWydajnosci();
        pc2.obliczKosztPodzespolow();
        pc2.dodajProcesor(new Procesor("procesor","INTEL","i7",1099,2.3,3.4, 1.6, 4));
        System.out.println(pc2.czyPro());
        pc2.dodajObudowa(new Obudowa("obudowa","bequiet!", "Silent Base", 639, "czarny"));
        System.out.println(pc2.czyObu());
        System.out.println(pc2.getObudowa().getNazwa()+": "+pc2.getObudowa().getProducent()+", "+pc2.getObudowa().getModel()+", "+pc2.getObudowa().getCena()+"zl, "+pc2.getObudowa().getKolor()+" kolor");
        System.out.println(pc2.getProcesor().getNazwa()+": "+pc2.getProcesor().getProducent()+", "+pc2.getProcesor().getModel()+", "+pc2.getProcesor().getCena()+"zl, "+pc2.getProcesor().getZegar()+"GHz, "+pc2.getProcesor().getMinZegar()+"GHz, "+pc2.getProcesor().getMaxZegar()+"Ghz, "+pc2.getProcesor().getLiczbaRdzeni()+" rdzenie");
        pc2.wlaczKomputer();
        pc2.zwiekszTaktowanieProcesora(0.2);
        pc2.przeprowadzTestWydajnosci();
        pc2.obliczKosztPodzespolow();
        pc2.wylaczKomputer();
    }
}
