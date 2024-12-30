package com.example.m7;

class Lingkaran extends BangunDatar {
    double jari;
    Lingkaran (double jari){
        this.jari=jari;
    }
    double luas()
    {
        return Math.PI * jari * jari;
    }
    double keliling()
    {
        return Math.PI * 2.0 *jari;
    }
}
