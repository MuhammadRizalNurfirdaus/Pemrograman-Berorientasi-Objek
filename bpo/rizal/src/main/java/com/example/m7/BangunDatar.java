package com.example.m7;

abstract class BangunDatar {
    abstract double luas();
    abstract double keliling();
    void tampilLuas( double l)
    {
        System.out.println("Luasnya sebesar "+ 1);
    }
    static void staticMethod()
    {
        System.out.println("Static Method dapat dipanggil");
    }
}