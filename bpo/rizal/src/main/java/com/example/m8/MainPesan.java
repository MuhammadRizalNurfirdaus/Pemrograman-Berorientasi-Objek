package com.example.m8;

public class MainPesan implements Pesan
{
    public static void main(String[] okedroid) {
        MainPesan ps = new MainPesan();
        ps.tampilpesan1();
        ps.tampilpesan2();
        ps.tampilpesan3();
    }
    @Override
    public void tampilpesan1()
    {
        System.out.println("Tampilkan pesan 1");
    }
    @Override
    public void tampilpesan2()
    {
        System.out.println("Tampilkan pesan 2");
    }
    @Override
    public void tampilpesan3()
    {
        System.out.println("Tampilkan pesan 3");
    }
}