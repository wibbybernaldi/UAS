package com.company.UAS_Liga;

/**
 * Created by Wibby on 30/06/2015.
 */
public class Klub {
    private String namaKlub;
    private Divisi divisi;
    private Liga liga;

    public Klub(String namaKlub) {
        this.namaKlub = namaKlub;
    }

    public Klub(String namaKlub, Divisi divisi, Liga liga) {
        this.namaKlub = namaKlub;
        this.divisi = divisi;
        this.liga = liga;
    }

    public String getNamaKlub() {
        return namaKlub;
    }

    public void setNamaKlub(String namaKlub) {
        this.namaKlub = namaKlub;
    }

    public Divisi getDivisi() {
        return divisi;
    }

    public void setDivisi(Divisi divisi) {
        this.divisi = divisi;
    }

    public void getPosisiKlubDiDivisi(String klubYangDiCari){
        int i=0;
        while (i<liga.daftarDivisi.size()){
            Divisi lg = liga.daftarDivisi.get(i);
            for(int j=0;j<divisi.daftarKlub.size();j++){
                lg.daftarKlub.get(j);
                Klub lig = lg.daftarKlub.get(j);
                    if (klubYangDiCari==lig.getNamaKlub()){
                        System.out.println(lg.getNamaDivisi());
                    }
            }
            i++;
        }
    }

    public void getPosisiKlubDiLiga(String klubYangDiCari){
        int i=0;
        while (i<liga.daftarDivisi.size()){
            Divisi lg = liga.daftarDivisi.get(i);
            for (int j = 0 ; j < divisi.daftarKlub.size();j++){
                lg.daftarKlub.get(j);
                Klub klub = lg.daftarKlub.get(j);
                if (klubYangDiCari == klub.namaKlub){
                    System.out.println(liga.getNamaLiga());
                }
            }
            i++;
        }
    }

    @Override
    public String toString() {
        return "Klub " +
                "Nama Klub= " + namaKlub +
                " divisi=" + divisi;
    }
}

