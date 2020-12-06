package com;

public class Main {

    public static void main(String[] args) {

        Samochod fiat = new Samochod();
        fiat.jedzie(123);
        fiat.kolor = "Czerwony";
        fiat.mocKM = 100;

        Samochod kia = new Samochod();
        kia.jedzie(343);
        kia.stop();

        Rower rower = new Rower();
        rower.jedzie(12);
        rower.stop();

    }
}

class Samochod extends Pojazd {
    String kolor;
    int mocKM;

    @Override
    public void stop() {
        System.out.println("Zatrzymaj sie!");
    }

    public int getMocKM() {
        return mocKM;
    }
}

class Rower extends Pojazd{


    @Override
    public void stop() {
        System.out.println("nacisnij hamulec");
    }
}

abstract class Pojazd {

    void jedzie(int predkosc){
        System.out.println("rusz pojazdem z predkoscia  "+predkosc);
    }

    abstract void stop();

}
