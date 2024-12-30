package com.example.All;

import javax.swing.JOptionPane;

public class Manusia {
    public String nama;

    public Manusia(String n) {
        this.nama = n;
    }

    public String tampilkanNama() {
        return nama;
    }

    public void makan() {
        System.out.println("Nyam... nyam... nyam...");
    }

    public void kerja() {
        System.out.println("Kerja...kerja...");
    }

    public static void main(String[] args) {
        String namaManusia = JOptionPane.showInputDialog("Masukkan nama:");
        Manusia manusia = new Manusia(namaManusia);
        JOptionPane.showMessageDialog(null, "Nama= " + manusia.tampilkanNama());
        manusia.makan();
        manusia.kerja();
    }
}