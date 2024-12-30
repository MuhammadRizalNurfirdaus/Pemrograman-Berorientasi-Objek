package com.example.All;

public class Menampilkan {
    public static void main(String[] args) {
        Kendaraan a = new Kendaraan("Toyota", "Merah", "1234");
        a.infoKendaraanMobil();

        Merk b = new Merk("Honda", "Biru", "5678", "B 1234 CD");
        b.infoMerkMotor();

        Warna c = new Warna("Suzuki", "Hijau", "9101", 2013);
        c.infoWarnaMotor();

        System.out.println("-----------------------------------");
    }
}