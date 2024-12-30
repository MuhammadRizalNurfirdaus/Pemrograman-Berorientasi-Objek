package com.example.All;

public class Merk extends Kendaraan {
    private String platNomor;

    public Merk() {
    }

    public Merk(String Merk, String Warna, String Seri, String platNomor) {
        super(Merk, Warna, Seri);
        this.platNomor = platNomor;
    }

    public String getPlatNomor() {
        return platNomor;
    }

    public void setPlatNomor(String platNomor) {
        this.platNomor = platNomor;
    }

    public void infoMerkMotor() {
        System.out.println("\nInfo Merk Motor");
        System.out.println("Plat Nomor\t: " + getPlatNomor());
        System.out.println("Merk\t\t: " + getMerk());
        System.out.println("Warna\t\t: " + getWarna());
        System.out.println("Seri\t\t: " + getSeri());
    }
}