package com.example.m7;

abstract public class Pulau {
    static final String NEGARA = "Indonesia";
    public abstract String nama();
    public String ambilNegara(){
        return NEGARA;}
}
class Jawa extends Pulau{
    String namap;
    public String nama(){
        namap = "Pulau Jawa";
        return namap;
    }
}
class Kalimantan extends Pulau{
    String namap;
    public String nama(){
        namap = "Pulau Kalimantan";
        return namap;
    }
}
class JawaBarat extends Jawa{
    void namaProv(){
        System.out.println("Ini Pulau Berada di "+ ambilNegara());
        System.out.println("Ini "+ nama());
        System.out.println("Ini Provinsi Jawa Barat");
        System.out.println("Jumlah Penduduk : 232342 Jiwa");
    }
}
class KalimantanTimur extends Kalimantan{
    void namaProv(){
        System.out.println("Ini Pulau Berada di "+ ambilNegara());
        System.out.println("Ini "+ nama());
        System.out.println("Ini Provinsi Jawa Sumatera");
        System.out.println("Jumlah Penduduk : 27364 Jiwa");
    }
}
class Utama {
    public static void main(String[] args) {
        JawaBarat JB = new JawaBarat();
        KalimantanTimur KT = new KalimantanTimur();
        JB.namaProv();
        System.out.println(".........:P");
        System.out.println("");
        KT.namaProv();
    }
}