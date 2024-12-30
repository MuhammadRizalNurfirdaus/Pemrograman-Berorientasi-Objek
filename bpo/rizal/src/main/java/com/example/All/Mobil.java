package com.example.All;

public class Mobil {
    public String pembuat, merk, type;
    Mobil()
    {
        this.pembuat="Ettore Bugatti";
        this.merk="Bugatti";
        this.type="Hypercar";
    }
    Mobil (String pembuat, String merk, String type)
    {
        this.pembuat=pembuat;
        this.merk=merk;
        this.type=type;
    }
    void cetakKeLayar()
    {
        if(merk==null && pembuat==null && type==null)
        return;
        System.out.println("merk : "+merk+", pembuat : "+pembuat+", type : "+type);
    }
}