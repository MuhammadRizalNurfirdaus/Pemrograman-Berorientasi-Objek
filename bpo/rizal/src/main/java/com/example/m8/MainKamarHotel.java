package com.example.m8;

public class MainKamarHotel implements KamarHotel
{
    public static void main(String[] okedroid) {
        MainKamarHotel kh = new MainKamarHotel();
        kh.BerikanKunciKamar1();
        kh.BerikanKunciKamar2();
        kh.BerikanKunciKamar3();
        kh.BerikanKunciKamar4();
    }
    @Override
    public void BerikanKunciKamar1()
    {
        System.out.println("Berikan Kunci Kamar Hotel Nomor 1");
    }
    @Override
    public void BerikanKunciKamar2()
    {
        System.out.println("Berikan Kunci Kamar Hotel Nomor 2");
    }
    @Override
    public void BerikanKunciKamar3()
    {
        System.out.println("Berikan Kunci Kamar hotel Nomor 3");
    }
    @Override
    public void BerikanKunciKamar4()
    {
        System.out.println("Berikan Kunci Kamar Hotel Nomor 4");
    }
}