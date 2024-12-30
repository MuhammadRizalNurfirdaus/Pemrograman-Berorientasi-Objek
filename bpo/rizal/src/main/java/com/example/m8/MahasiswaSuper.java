package com.example.m8;

public class MahasiswaSuper implements Mahasiswa, Atlet, Wiraswasta {
    private String nama;

    public MahasiswaSuper(String nama) {
        this.nama = nama;
    }

    @Override
    public void belajar() {
        System.out.println(nama + " sedang belajar.");
    }

    @Override
    public void ujian() {
        System.out.println(nama + " sedang ujian.");
    }

    @Override
    public void latihan() {
        System.out.println(nama + " sedang latihan.");
    }

    @Override
    public void bertanding() {
        System.out.println(nama + " sedang bertanding.");
    }

    @Override
    public void bekerja() {
        System.out.println(nama + " sedang bekerja.");
    }

    @Override
    public void mengelolaUsaha() {
        System.out.println(nama + " sedang mengelola usaha.");
    }

    public static void main(String[] args) {
        MahasiswaSuper mahasiswaSuper = new MahasiswaSuper("Muhammad Rizal Nurfirdaus");
        mahasiswaSuper.belajar();
        mahasiswaSuper.ujian();
        mahasiswaSuper.latihan();
        mahasiswaSuper.bertanding();
        mahasiswaSuper.bekerja();
        mahasiswaSuper.mengelolaUsaha();
    }
}