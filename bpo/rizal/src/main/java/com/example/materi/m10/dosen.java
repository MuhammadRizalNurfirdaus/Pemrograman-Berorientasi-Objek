package com.example.materi.m10;

interface biodata {
    String nama = "Siti Maeysaroh";
    void kerja();
}

interface gmail extends biodata {
    String email = "SitiMaeysaroh@uniku.ac.id";
    void tampilkangmail();
}

interface kontak extends biodata {
    String nomor = "085322287800";
    void tampilkankontak();
}

interface Alamat {
    String alamat = "Kuningan";
    void tampilkanalamat();
}

class dosen implements gmail, kontak, Alamat {
    public void kerja() {
        System.out.println(nama + " sebagai dosen mata kuliah PBO");
    }

    public void tampilkangmail() {
        System.out.println("Email: " + email);
    }

    public void tampilkankontak() {
        System.out.println("Nomor: " + nomor);
    }

    public void tampilkanalamat() {
        System.out.println("Alamat: " + alamat);
    }

    public static void main(String[] args) {
        dosen dsl = new dosen();
        dsl.kerja();
        dsl.tampilkangmail();
        dsl.tampilkankontak();
        dsl.tampilkanalamat();
    }
}