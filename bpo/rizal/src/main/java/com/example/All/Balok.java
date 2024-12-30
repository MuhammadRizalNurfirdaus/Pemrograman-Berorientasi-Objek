package com.example.All;

public class Balok 
{     double panjang, lebar, tinggi; 
     
    public void setPanjang(double panjang){this.panjang = panjang;}     public void setLebar(double lebar){this.lebar = lebar;}     public void setTinggi(double tinggi){this.tinggi = tinggi;} 
     
    public double getPanjang() {return panjang;}     public double getLebar() {return lebar;}     public double getTinggi() {return tinggi;}     public double getVolume() {return panjang*lebar*tinggi;}     public static void main (String args[])  
    { 
        double volume; 
        Balok  b1 = new Balok();         b1.panjang = 7;         b1.lebar = 4;         b1.tinggi= 5; 
        volume = b1.panjang*b1.lebar*b1.tinggi; 
        System.out.println("Volume Balok = " +volume+"Cm3"); 
    } 
} 