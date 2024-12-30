package com.example.All;

public class Warna extends Kendaraan {
    private int tahunPembuatan;

    public Warna() {
    }

    public Warna(String Merk, String Warna, String Seri, int tahunPembuatan) {
        super(Merk, Warna, Seri);
        this.tahunPembuatan = tahunPembuatan;
    }

    public int getTahunPembuatan() {
        return tahunPembuatan;
    }

    public void setTahunPembuatan(int tahunPembuatan) {
        this.tahunPembuatan = tahunPembuatan;
    }

    public void infoWarnaMotor() {
        System.out.println("\nInfo Warna Motor");
        System.out.println("Tahun Pembuatan\t: " + getTahunPembuatan());
        System.out.println("Merk\t\t: " + getMerk());
        System.out.println("Warna\t\t: " + getWarna());
        System.out.println("Seri\t\t: " + getSeri());
    }
}