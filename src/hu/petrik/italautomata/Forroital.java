package hu.petrik.italautomata;

import java.util.Random;

public class Forroital {
    public String nev;
    public int ar;
    public int cukor;
    Random r = new Random();

    public Forroital(String nev,int ar, int cukor) {
        this.nev = nev;
        this.ar = ar;
        this.cukor = cukor;
    }
public String getNev() {
        return nev;
}

    public int getAr() {
        return ar;
    }

    public int fixAr(int fixAr) {
        return ar +=fixAr;
    }

    public int randomAr(int min, int max) {
        return ar = ar+ r.nextInt(max-min) + min;
    }

    public double megadottErtek(double ertek) {
        return ar *=  (1 + ertek/100);
    }

    @Override
    public String toString() {
        return String.format("Ital neve: " + nev  +"\nÁra: " + ar + " Ft" + "\nCukortartalma: " + cukor);
    }


}
