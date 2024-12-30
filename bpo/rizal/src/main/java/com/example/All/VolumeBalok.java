package com.example.All;
import javax.swing.JOptionPane;

public class VolumeBalok {
    public static void main(String[] args) {
        double volume;
        Balok b1 = new Balok();

        try {
            b1.panjang = Double.parseDouble(JOptionPane.showInputDialog("Masukkan panjang balok: "));
            b1.lebar = Double.parseDouble(JOptionPane.showInputDialog("Masukkan lebar balok: "));
            b1.tinggi = Double.parseDouble(JOptionPane.showInputDialog("Masukkan tinggi balok: "));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Input tidak valid. Pastikan Anda memasukkan angka.");
            return;
        }

        volume = b1.panjang * b1.lebar * b1.tinggi;
        JOptionPane.showMessageDialog(null, "Volume Balok = " + volume + " Cm3");
    }
}