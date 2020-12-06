package com;

class Dziatkowie {
    protected String mieszkanie;

    public Dziatkowie(String mieszkanie) {
        this.mieszkanie = mieszkanie;
    }

    public Dziatkowie(){};
}

class Rodzice extends Dziatkowie {
    String dom;

    public Rodzice(String mieszkanie, String dom) {
        super(mieszkanie);
        this.dom = dom;
        super.mieszkanie = "123";
    }

    public Rodzice(){};
}

public class Dzieci extends Rodzice {
    protected int iloscZabawek;
    public int iloscUbranek;

    public Dzieci(String mieszkanie, String dom, int iloscZabawek) {
        super(mieszkanie, dom);
        this.iloscZabawek = iloscZabawek;
    }

    public Dzieci(){}

    @Override
    public String toString() {
        return "Dzieci{" +
                "mieszkanie='" + mieszkanie + '\'' +
                ", dom='" + dom + '\'' +
                ", iloscZabawek=" + iloscZabawek +
                '}';
    }
}

class RodzinaTest {

    public static void main(String[] args) {
        Dzieci dzieci = new Dzieci("ul. Zelwerowicza", "ul. Warszawska", 1223456765);

        System.out.println(dzieci.toString());
    }
}
