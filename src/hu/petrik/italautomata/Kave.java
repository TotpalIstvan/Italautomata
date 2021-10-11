package hu.petrik.italautomata;

public class Kave extends Forroital {
    public boolean tej;


    public Kave(String nev, int ar, int cukor, boolean tej) {
        super(nev, ar, cukor);
        this.tej = tej;
    }

    @Override
    public String toString() {
        String vaneTej = "";
        if (tej) {
            vaneTej = "\nVan benne tej";
        } else {
            vaneTej = "\nNincs benne tej";
        }
        return "Ital neve: " + nev  +"\nÁra: " + ar + " Ft" + "\nCukortartalma: " + cukor + vaneTej;
    }
}
