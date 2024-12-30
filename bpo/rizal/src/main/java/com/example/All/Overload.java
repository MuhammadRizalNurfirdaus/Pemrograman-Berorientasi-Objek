package com.example.All;

public class Overload {
    public static void main(String[] args) {
        teman baru= new teman("wildan");
        System.out.println("pada konstruktor 1 : ");
        baru.cetak();
        teman lama=new teman("Syandu", 100);
        System.out.println("pada konstruktor 2 : ");
        lama.cetak();
        teman cantik=new teman("tania", 100, 10);
        System.out.println("pada konstruktor 3 : ");
        cantik.cetak();
    }
}
