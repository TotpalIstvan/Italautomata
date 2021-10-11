package hu.petrik.italautomata;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Fajl {
    private String nev;
    private String kiterjesztes;
    private int meret;
    private String tartalom;

     public Fajl(String nev, String kiterjesztes) {
         this.nev = nev;
         this.kiterjesztes= kiterjesztes;
     }

    public String getNev() {
        return nev;
    }

    public String getKiterjesztes() {
        return kiterjesztes;
    }

    public int getMeret() {
        return meret;
    }

    public void getTartalom() {
        try {
            meret = 0;
            FileReader fr = new FileReader(nev + kiterjesztes);
            BufferedReader br = new BufferedReader(fr);
            String sor = br.readLine();
            while (sor !=null) {
                meret += sor.length();
                System.out.println(sor);
                sor = br.readLine();
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public String toString() {
        return "A fájl neve: " + nev + "." + kiterjesztes + "\nMérete:" + meret;
    }
}
