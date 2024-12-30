package com.example.m7;

public class Manusia extends MakhlukHidup{
    private String Kaki;
    public Manusia (String Kaki){
        this.Kaki = Kaki;
    }
    public void berdiri (){
        System.out.println("Manusia berdiri dengan : "+Kaki);
    }
}