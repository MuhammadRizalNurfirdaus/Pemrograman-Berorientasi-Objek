package com.example.m9;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Mobil {
    
    public static void main(String[] args) throws IOException
    {  
        String namaString;
        String mobilString;
        String motorString;
        System.out.print("Masukkan nama Anda: ");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        namaString = bufferedReader.readLine();
        System.out.print("Masukkan nama mobil Anda: ");
        mobilString = bufferedReader.readLine();
        System.out.print("Masukkan nama motor Anda: ");
        motorString = bufferedReader.readLine();
        System.out.println("Nama Anda :"+ namaString);
        System.out.println("Mobil Anda :"+ mobilString);
        System.out.println("Motor Anda :"+ motorString);
    }
}