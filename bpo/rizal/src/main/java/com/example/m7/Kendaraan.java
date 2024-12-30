package com.example.m7;

abstract public class Kendaraan {
    static final String MOBIL = "Bugatti";
    public abstract String nama();
    public String ambilKendaraan(){
        return MOBIL;}
}
class Chiron extends Kendaraan{
    String namap;
    public String nama(){
        namap = "Bugatti Chiron";
        return namap;
    }
}
class Veyron extends Kendaraan{
    String namap;
    public String nama(){
        namap = "Bugatti Veyron";
        return namap;
    }
}
class ChironSuperSport extends Chiron{
    void namaMerk(){
        System.out.println("Ini adalah mobil "+ ambilKendaraan());
        System.out.println("Ini Merk "+ nama());
        System.out.println("Ini Jenis Hypercar");
        System.out.println("Ini ditenagai oleh mesin 8.000 cc");
        System.out.println("Ini menghasilkan kecepatan sampai 200 mhp(321 km/jam)");
    }
}
class VeyronGrandSport extends Veyron{
    void namaMerk(){
        System.out.println("Ini adalah mobil "+ ambilKendaraan());
        System.out.println("Ini Merk "+ nama());
        System.out.println("Ini Jenis Hypercar");
        System.out.println("Ini ditenagai oleh mesin 8.000 cc");
        System.out.println("Ini menghasilkan kecepatan sampai 267 mhp(429,69 km/jam)");
    }
}
class Main {
    public static void main(String[] args) {
        ChironSuperSport CSP = new ChironSuperSport();
        VeyronGrandSport VGS = new VeyronGrandSport();
        CSP.namaMerk();
        System.out.println("=====================================================");
        System.out.println("");
        VGS.namaMerk();
    }
}