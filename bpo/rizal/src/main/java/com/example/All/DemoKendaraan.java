package com.example.All;

public class DemoKendaraan {
    public static void main(String[] args) {
        Motor kendaraanMotor = new Motor();
        Mobil kendaraanMobil = new Mobil();
        Perahu kendaraanPerahu = new Perahu();
        Pesawat kendaraanPesawat = new Pesawat();
        Kendaraan k;
        System.out.println("Motor");
        k = kendaraanMotor; k.suara(); k.berjalan();  
        System.out.println("Mobil");
        k = kendaraanMobil; k.suara(); k.berjalan(); 
        System.out.println("Perahu");
        k = kendaraanPerahu; k.suara(); k.berjalan(); 
        System.out.println("Pesawat");
        k = kendaraanPesawat; k.suara(); k.berjalan();  
    }
}