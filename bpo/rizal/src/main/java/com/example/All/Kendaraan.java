package com.example.All;

public class Kendaraan {
    private String Merk;
    private String Warna;
    private String Seri;

    public Kendaraan() {
    }

    public Kendaraan(String Merk, String Warna, String Seri) {
        this.Merk = Merk;
        this.Warna = Warna;
        this.Seri = Seri;
    }

    public String getMerk() {
        return Merk;
    }

    public String getWarna() {
        return Warna;
    }

    public String getSeri() {
        return Seri;
    }

    public void setMerk(String Merk) {
        this.Merk = Merk;
    }

    public void setWarna(String Warna) {
        this.Warna = Warna;
    }

    public void setSeri(String Seri) {
        this.Seri = Seri;
    }

    public void infoKendaraanMobil() {
        System.out.println("\nInfo Kendaraan Mobil");
        System.out.println("Merk\t\t: " + getMerk());
        System.out.println("Warna\t\t: " + getWarna());
        System.out.println("Seri\t\t: " + getSeri());
    }
}