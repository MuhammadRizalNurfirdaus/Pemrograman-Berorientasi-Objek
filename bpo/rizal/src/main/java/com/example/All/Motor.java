package com.example.All;

public class Motor {
    public String Motor, Warna;
    public int Kecepatan=0;
    public Motor(String Mt){
        Motor=Mt;
    }
    public Motor(String Mt,String Wn){
        Motor=Mt;
        Warna=Wn;
    }
    public Motor(String Mt, String Wn, int Kpn){
        Motor=Mt;
        Warna=Wn;
        Kecepatan=Kpn;
    }
    public void cetak(){
            System.out.println("Motor   : "+Motor);
            System.out.println("Warna   : "+Warna);
            System.out.println("Kecepatan   : "+Kecepatan);
    }
}