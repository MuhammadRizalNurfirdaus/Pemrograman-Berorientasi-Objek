package com.example.All;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class praktikum1m2 {
    public static void main(String[] args) throws IOException{     
    BufferedReader br= new
    BufferedReader (new InputStreamReader(System.in));
    String nama, kota;
    System.out.print("Nama Anda : ");
    nama = br.readLine();
    System.out.print("Kota Asal : ");
    kota = br.readLine();

    System.out.println("Selamat Datang "+ nama +" dari "+ kota);
}
}
