package com.example.m9;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainNumeric 
{
    public static void main(String[] args) throws IOException
    {
        int inputNumber;
        String temp;
        System.out.println("Masukkan angka: ");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        temp = bufferedReader.readLine();
        inputNumber = Integer.parseInt(temp);
        System.out.println("Angka yang dimasukkan :"+ inputNumber);
    }
}
