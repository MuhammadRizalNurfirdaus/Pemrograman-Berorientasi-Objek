package com.example.m9;

public class Mahasiswa extends Manusia {
    private String nim;
    private String programStudi;
    private String jurusan;

    public Mahasiswa(String nim, String nama, String alamat, String jenisKelamin, String programStudi, String jurusan) {
        super(nama, alamat, jenisKelamin);
        this.nim = nim;
        this.programStudi = programStudi;
        this.jurusan = jurusan;
    }

    public String getNim() {
        return nim;
    }

    public String getProgramStudi() {
        return programStudi;
    }

    public String getJurusan() {
        return jurusan;
    }
    
    public String toString() {
        return "Nim: " + nim + "\nNama: " + nama + "\nAlamat: " + alamat + "\nJenis Kelamin: " + jenisKelamin + 
               "\nProgram Studi: " + programStudi + "\nJurusan: " + jurusan + "\n";
    }

    public String toCSV() {
        return nim + "," + nama + "," + alamat + "," + jenisKelamin + "," + programStudi + "," + jurusan;
    }
}
