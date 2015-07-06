package com.company.UAS_Liga;

import java.util.ArrayList;

/**
 * Created by Wibby on 30/06/2015.
 */
public class Divisi {
    private String namaDivisi;
    private Liga liga;
    ArrayList<Klub> daftarKlub = new ArrayList<Klub>();

    public Divisi(String namaDivisi, Liga liga) {
        this.namaDivisi = namaDivisi;
        this.liga = liga;
    }

    public String getNamaDivisi() {
        return namaDivisi;
    }

    public void setNamaDivisi(String namaDivisi) {
        this.namaDivisi = namaDivisi;
    }

    public Liga getLiga() {
        return liga;
    }

    public void setLiga(Liga liga) {
        this.liga = liga;
    }

    public ArrayList<Klub> getDaftarKlub() {
        return daftarKlub;
    }

    public void setDaftarKlub(Klub klub) {
        this.daftarKlub.add(klub);
    }

    // Nomor 2

    public void getDaftarKlubByLiga(String byLiga){
        if (byLiga == liga.getNamaLiga()){
            int a = 0;
            while (a < liga.daftarDivisi.size()){
                Divisi lg = liga.daftarDivisi.get(a);
                int b = 0;
                while (b < daftarKlub.size()){
                    System.out.println(lg.daftarKlub.get(b));
                    b++;
                }
                a++;
            }

        }else {
            System.out.println("Maaf Liga tidak ditemukan");
        }
    }

    // Nomor 3

    public void getDaftarKlubByDivisi(String byDivisi){
        int i = 0;
        while (i < liga.daftarDivisi.size()) {
            Divisi l = liga.daftarDivisi.get(i);
            if (byDivisi == l.getNamaDivisi()) {
                int j = 0;
                while (j <daftarKlub.size()) {
                    System.out.println(l.daftarKlub.get(j));
                    j++;
                }
            }
            i++;
        }
        i = 0;
        while (i < liga.daftarDivisi.size()) {
            Divisi l = liga.daftarDivisi.get(0);
            Divisi k = liga.daftarDivisi.get(1);
            if (byDivisi != k.getNamaDivisi()) {
                if (byDivisi != l.getNamaDivisi()) {
                    System.out.println("Maaf anda salah input");
                }
            }
            i++;
        }
    }


    @Override
    public String toString() {
        return "Divisi " + namaDivisi;
    }
}

