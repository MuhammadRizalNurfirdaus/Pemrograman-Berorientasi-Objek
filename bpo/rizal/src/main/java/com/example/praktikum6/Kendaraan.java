package com.example.praktikum6;

public class Kendaraan {
    String jenis, ciri;

    public void suara() {
        System.out.println("Suara Kendaraan");
    }
    public void berjalan() {
        System.out.println("Cara Berjalan Kendaraan");
    }
}
class Motor extends Kendaraan {
    public void suara() {
        System.out.println("Brrrmm Brrrmm");
    }
    public void berjalan() {
        System.out.println("Mengendarai di Jalan Raya");
        System.out.println("======================");
    }
}
class Mobil extends Kendaraan {
    public void suara() {
        System.out.println("Stututututu Stututututu");
    }
    public void berjalan() {
        System.out.println("Mengemudi di Jalan Raya");
        System.out.println("======================");
    }
}
class Perahu extends Kendaraan {
    public void suara() {
        System.out.println("Tuut Tuut");
    }
    public void berjalan() {
        System.out.println("Berlayar di Air");
        System.out.println("======================");
    }
}
class Pesawat extends Kendaraan {
    public void suara() {
        System.out.println("Whooosh");
    }
    public void berjalan() {
        System.out.println("Terbang di Udara");
        System.out.println("======================");
    }
}