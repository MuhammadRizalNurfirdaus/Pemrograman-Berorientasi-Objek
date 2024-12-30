package com.example.All;

public class SPP
{
    String nama, nim;
    int spt, spv, sks;
    
    public SPP(String nama, String nim, int spt, int spv, int sks){
        this.nama = nama; this.nim = nim;
        this.spt = spt;
        this.spv = spv;
        this.sks = sks;
    }
public int hitung()
    {
    return(spt+(spv*sks));  
    }
}
