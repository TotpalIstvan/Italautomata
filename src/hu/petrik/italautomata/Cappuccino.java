package hu.petrik.italautomata;

public class Cappuccino extends Kave {
    private boolean tejszinhab;

    public Cappuccino(String nev, int ar, int cukor, boolean tej, boolean tejszinhab) {
        super(nev, ar, cukor, tej);
        this.tejszinhab = tejszinhab;
    }

    @Override
    public String toString() {
        String vaneTej = "";
        String tHab = "";
        if (tejszinhab && tej) {
            vaneTej = "\nVan benne tej";
            tHab = "\nVan benne tejszínhab";
        } else if(!tej && tejszinhab) {
            vaneTej = "\nNincs benne tej";
            tHab = "\nVan benne tejszínhab";
        } else if(tej && !tejszinhab) {
            vaneTej = "\nVan benne tej";
            tHab = "\nNincs benne tejszínhab";
        } else {
            vaneTej = "\nNincs benne tej";
            tHab = "\nNincs benne tejszínhab";
        }
        return "Ital neve: " + nev  +"\nÁra: " + ar + " Ft" + "\nCukortartalma: " + cukor + vaneTej  + tHab;
    }
}
