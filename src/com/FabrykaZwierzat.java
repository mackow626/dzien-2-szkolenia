package com;

class FabrykaTest{
    public static void main(String[] args) {
        Zwierze zwierze = FabrykaZwierzat.getZwierze("miaul");
        System.out.println(zwierze.dajGlos());
        System.out.println(zwierze.getClass());
    }
}

public class FabrykaZwierzat {

    public static Zwierze getZwierze(String glos) {
        Zwierze zwierze;

        switch (glos) {
            case "ihaha":
                zwierze = new Kon();
                break;
            case "miaul":
                zwierze = new Kot();
                break;
            case "hau":
                zwierze = new Pies();
                break;
            default:
                zwierze = null;
        }
        return zwierze;
    }
}


interface Zwierze {
    String dajGlos();
}

class Kon implements Zwierze {

    @Override
    public String dajGlos() {
        return "ihaha";
    }
}

class Kot implements Zwierze {

    @Override
    public String dajGlos() {
        return "miaul";
    }
}

class Pies implements Zwierze {

    @Override
    public String dajGlos() {
        return "hau";
    }
}