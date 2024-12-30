package com.example.All;

public class Buku {
    String pengarang, judul;
    Buku()
    {
    this.pengarang = "Benny Hermawan";
    this.judul= "Mengusai Java 2 dan OOP";
    }
    Buku (String pengarang, String judul)
    {
        this.pengarang = pengarang;
        this.judul= judul;
    }
    void cetakKeLayar()
    {
        if(judul==null && pengarang ==null)
        return;
        System.out.println("Judul : "+judul+",pengarang : "+pengarang);
    }
}