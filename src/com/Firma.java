package com;

import java.util.ArrayList;
import java.util.List;

public class Firma {

    public static void main(String[] args) {
        Pracownik prezes = new Pracownik("Jan", "Kowalski", 60);
        Pracownik sekretarka = new Pracownik("Jolanta", "Muuu", 40);

        List<Pracownik> pracownikList = new ArrayList<>();
        pracownikList.add(prezes);
        pracownikList.add(sekretarka);

        Pielegniarka pielegniarka = new Pielegniarka("Janina", "Biernacka", 34, 160);

        pracownikList.add(pielegniarka);

        for (Pracownik pracownik : pracownikList) {
            pracownik.pobierzDane();
        }

//        Szef szef = new Szef();
//        szef.premie = 100;
//        szef.setImie("Adam");
//        szef.setNazwisko("Nowak");
//        szef.setWiek(76);
//
//        szef.pobierzDane();
//        System.out.println(szef.premie);



    }
}

//class Szef extends Pracownik {
//    int premie;
//
//}

class Pielegniarka extends Pracownik {
    int nadgodziny;

    Pielegniarka(String imie, String nazwisko, int wiek, int nadgodziny) {
        super(imie, nazwisko, wiek);
        this.nadgodziny = nadgodziny;
    }
}

class Pracownik {
   private String imie;
   private String nazwisko;
   private int wiek;

    public void setImie(String imie) {
        this.imie = imie;
    }

    public Pracownik(String imie, String nazwisko, int wiek) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public int getWiek() {
        return wiek;
    }

    public void pobierzDane() {
        System.out.println(getImie() + " " + getNazwisko() + " " +
                getWiek());
    }

}