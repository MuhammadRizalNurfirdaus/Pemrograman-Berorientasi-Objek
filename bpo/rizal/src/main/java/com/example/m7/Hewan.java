package com.example.m7;

public class Hewan extends MakhlukHidup{
    private String Kaki, kaki1;
    public Hewan (String Kaki,String kaki1){
        this.Kaki = Kaki;
        this.kaki1 = kaki1;
    }
    public void berdiri (){
        System.out.println("Hewan berdiri dengan : "+Kaki+""+kaki1);
    }
}