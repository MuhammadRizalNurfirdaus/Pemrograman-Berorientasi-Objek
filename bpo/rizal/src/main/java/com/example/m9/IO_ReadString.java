package com.example.m9;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IO_ReadString 
{
    public static void main(String[] args) throws IOException
    {
        String nameString;
        System.out.println("Masukkan nama Anda: ");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        nameString = bufferedReader.readLine();
        System.out.println("Nama Anda :"+ nameString);
    }
}
