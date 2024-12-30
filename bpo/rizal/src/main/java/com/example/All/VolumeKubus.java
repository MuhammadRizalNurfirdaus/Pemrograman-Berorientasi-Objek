package com.example.All;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class VolumeKubus {
    public static void main(String[] args) {
        double volume;
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Masukkan panjang sisi kubus: ");
            double sisi = Double.parseDouble(reader.readLine());
            Kubus kubus = new Kubus(sisi);
            volume = kubus.hitungVolume();
            System.out.println("Volume Kubus = " + volume + " cm^3");
        } catch (NumberFormatException | IOException e) {
            System.out.println("Input tidak valid. Pastikan Anda memasukkan angka.");
        }
    }
}