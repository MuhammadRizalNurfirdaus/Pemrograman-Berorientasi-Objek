package com.example.All;

public class teman {
    public String nama;
    public int pacar=0, mantan=0;
    public teman(String nm){
        nama=nm;
    }
    public teman(String nm, int pac){
        nama=nm;
        pacar=pac;
    }
    public teman(String nm, int pac, int man){
        nama=nm;
        pacar=pac;
        mantan=man;
    }
    public void cetak(){
            System.out.println("nama   : "+nama);
            System.out.println("pacar   : "+pacar);
            System.out.println("mantan   : "+mantan);
    }
}
