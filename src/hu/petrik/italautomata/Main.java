package hu.petrik.italautomata;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	    Forroital t1 = new Tea("kicsi", 150, 2,false);
        Forroital t2 = new Tea("közepes", 200, 3,true);
        Forroital t3 = new Tea("kicsi", 250, 5,true);

        Forroital k1 = new Kave("kicsi", 150, 2,false);
        Forroital k2 = new Kave("közepes", 200, 3,true);
        Forroital k3 = new Kave("nagy", 250, 5,true);

        Forroital c1 = new Cappuccino("kicsi", 150, 2, false, true);
        Forroital c2 = new Cappuccino("közepes", 200, 3, true, false);
        Forroital c3 = new Cappuccino("nagy", 250, 5, true, true);

        List<Forroital> italok = new ArrayList<>();
        italok.add(t1);
        italok.add(k1);
        italok.add(c1);
        for (Forroital forroital:italok) {
            System.out.println(forroital);
            forroital.fixAr(100);
            System.out.println("100-al emelt: "  + forroital.ar + " Ft");
            forroital.randomAr(100,150);
            System.out.println("Random emeléssel(100-150): " + forroital.ar + " Ft");
            forroital.megadottErtek(10);
            System.out.println("Megadott százalékkal(10%): " + forroital.ar + " Ft");
        }

        Fajl f1 = new Fajl("random", "txt");
        f1.getTartalom();
        System.out.println(f1);

    }
}
