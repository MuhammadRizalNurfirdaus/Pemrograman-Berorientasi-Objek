package com.example.m8;

public interface Speedometer 
{
public void tambahKecepatan();
public void kurangiKecepatan();
}
class Mobil implements Speedometer
{
    public void tambahKecepatan()
    {System.out.println("Injak kopling lebih tinggi & Gas Mobilnya");}
    public void kurangiKecepatan()
    {System.out.println("Rem Mobilnya & pindah gear yang lebih rendah");}
}
class Motor implements Speedometer
{
    public void tambahKecepatan()
    {System.out.println("pindah ke gear yang lebih tinggi & Gas Motornya");}
    public void kurangiKecepatan()
    {System.out.println("Rem Motornya dengan rem belakang + depan, lalu" + "Pindah gear yang lebih rendah");}
}
class TestKendaraan
{
    public static void main(String[] args) {
        Mobil mobil = new Mobil();
        Motor motor = new Motor();
        System.out.println("Cara ngebut pake Motor: ");
        motor.tambahKecepatan();
        System.out.println("Cara berhentinya: ");
        motor.kurangiKecepatan();
        System.out.println("Cara balapan pake Mobil: ");
        mobil.tambahKecepatan();
        System.out.println("klo udah puas: ");
        mobil.kurangiKecepatan();
    }
}