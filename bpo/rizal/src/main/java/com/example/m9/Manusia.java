package com.example.m9;

public class Manusia {
    protected String nama;
    protected String alamat;
    protected String jenisKelamin;

    public Manusia(String nama, String alamat, String jenisKelamin) {
        this.nama = nama;
        this.alamat = alamat;
        this.jenisKelamin = jenisKelamin;
    }

    public String getNama() {
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }
}