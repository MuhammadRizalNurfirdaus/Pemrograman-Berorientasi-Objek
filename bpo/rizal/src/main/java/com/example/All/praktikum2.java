package com.example.All;

import javax.swing.JOptionPane;

class praktikum2 {
    public static void main(String[] args) {
        String nama, kota;
        nama = JOptionPane.showInputDialog("Nama Anda :");
        kota = JOptionPane.showInputDialog("Kota Asal :");
        System.out.println("Selamat Datang " + nama +" dari "+ kota);
        System.exit(0);
    }
}
