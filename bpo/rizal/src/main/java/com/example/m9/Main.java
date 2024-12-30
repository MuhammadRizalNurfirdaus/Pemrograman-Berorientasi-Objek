package com.example.m9;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main 
{
public static void main(String[] args) throws IOException {
    char inputChar;
    System.out.println("Masukkan sembarang karakter: ");
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    inputChar = (char)bufferedReader.read();
    System.out.println("Karakter yang diinputkan :"+ inputChar);
}
}