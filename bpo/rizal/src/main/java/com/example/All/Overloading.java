package com.example.All;

public class Overloading {
    public static void main(String[] args) {
        Motor baru= new Motor("ZX25R","Hitam",250);
        System.out.println("pada konstruktor 1 : ");
        baru.cetak();
        Motor lama=new Motor("Ducatti Panigale V4 R", "Merah", 1000);
        System.out.println("pada konstruktor 2 : ");
        lama.cetak();
        Motor cantik=new Motor("CBR500R","Biru", 500);
        System.out.println("pada konstruktor 3 : ");
        cantik.cetak();
    }
}
