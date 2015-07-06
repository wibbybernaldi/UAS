package com.company.UAS_Liga;

/**
 * Created by Wibby on 30/06/2015.
 */
public class TestKelas {
    public static void main(String[] args) {
        // write your code here
        Liga inggris = new Liga("Inggris");
        Divisi premiereLeague = new Divisi("Premiere League",inggris);
        Divisi premiereShip = new Divisi("Premiere Ship",inggris);
        Klub manUn = new Klub("Manchester United",premiereLeague, inggris);
        Klub livPo = new Klub("Liver Pool",premiereLeague, inggris);
        Klub klubShipSatu = new Klub("Klub Ship Satu",premiereShip, inggris);
        Klub klubShipDua = new Klub("Klub Ship Dua",premiereShip, inggris);

        inggris.setDaftarDivisi(premiereLeague);
        inggris.setDaftarDivisi(premiereShip);
        premiereLeague.setDaftarKlub(manUn);
        premiereLeague.setDaftarKlub(livPo);
        premiereShip.setDaftarKlub(klubShipSatu);
        premiereShip.setDaftarKlub(klubShipDua);

        System.out.println(inggris.toString());
        System.out.println(premiereLeague.toString());

        Liga indonesia = new Liga("Indonesia");
        Divisi isl = new Divisi("ISL",indonesia);
        Divisi divisiUtama = new Divisi("Divisi Utama", indonesia);

        Klub arema = new Klub("Arema", isl, indonesia);
        Klub persija = new Klub("Persija", isl, indonesia);
        Klub persebaya = new Klub("Persebaya", divisiUtama, indonesia);
        Klub persib = new Klub("Persib", divisiUtama, indonesia);

        indonesia.setDaftarDivisi(isl);
        indonesia.setDaftarDivisi(divisiUtama);

        isl.setDaftarKlub(arema);
        isl.setDaftarKlub(persija);

        divisiUtama.setDaftarKlub(persebaya);
        divisiUtama.setDaftarKlub(persib);


        System.out.println(indonesia.toString());

        System.out.println("\n~~~UAS soal~~~\n");

//        1. Get daftar divisi by nama liga
        System.out.println("\nNo. 1 \n" + inggris.getDaftarDivisi() + "\n");
//        2. Get Daftar Klub by nama liga
        System.out.println("\nNo. 2");
        isl.getDaftarKlubByLiga("Indonesia");
//        3. Get Daftar Klub by nama Divisi
        System.out.println("\nNo. 3");
        isl.getDaftarKlubByDivisi("ISL");
//        4. Get Klub ini berada di divisi mana by nama Klub
        System.out.println("\nNo. 4");
        arema.getPosisiKlubDiDivisi("Persebaya");
//        5. Get Klub ini berada di liga apa by nama Klub
        System.out.println("\nNo. 5");
        arema.getPosisiKlubDiLiga("Arema");





    }
}
