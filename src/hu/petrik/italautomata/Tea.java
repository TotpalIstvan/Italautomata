package hu.petrik.italautomata;

public class Tea extends Forroital {
    private boolean citrom;

    public Tea(String nev, int ar, int cukor, boolean citrom) {
        super(nev, ar, cukor);
        this.citrom = citrom;
    }

    @Override
    public String toString() {
        String cTartalom = "";
        if (citrom) {
            cTartalom = "\nVan benne citrom";
        }else {
            cTartalom = "\nNincs benne citrom";
        }
        return "Ital neve: " + nev  +"\nÁra: " + ar + "Ft " + "\nCukortartalma: " + cukor + cTartalom;
    }
}
