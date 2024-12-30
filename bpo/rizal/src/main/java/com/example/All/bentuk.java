package com.example.All;

public class bentuk {
    public static int luas(int p, int l){
        return (p*l);
    }
    public static float luas(int alas, float t){
        return (alas*t)/2;
    }
    public static double luas (double phi, int jari){
        return (phi*jari)*2;
    }
    public static void main(String[] args) {
        bentuk lingkaran = new bentuk();
        System.out.println("Data luias berbagi bentuk bangun datar : ");
        System.out.println("1. Luas persegi = "+lingkaran.luas(3, 4));
        System.out.println("2. Luas segitiga = "+lingkaran.luas(3, 5));
        System.out.println("3. Luas lingkaran = "+lingkaran.luas(3, 8));
    }
}