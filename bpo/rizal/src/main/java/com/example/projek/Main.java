package com.example.projek;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {

        String merekLaptop = JOptionPane.showInputDialog("Masukkan merek laptop:");
        String modelLaptop = JOptionPane.showInputDialog("Masukkan model laptop:");
        int hargaLaptop = Integer.parseInt(JOptionPane.showInputDialog("Masukkan harga laptop:"));
        double ukuranLayar = Double.parseDouble(JOptionPane.showInputDialog("Masukkan ukuran layar laptop:"));
        String CPULaptop = JOptionPane.showInputDialog("Masukkan CPU laptop:");
        String VGALaptop = JOptionPane.showInputDialog("Masukkan VGA laptop:");
        int RAMLaptop = Integer.parseInt(JOptionPane.showInputDialog("Masukkan RAM laptop (GB):"));
        int storageLaptop = Integer.parseInt(JOptionPane.showInputDialog("Masukkan storage laptop (GB):"));

        Laptop laptop = new Laptop(merekLaptop, modelLaptop, hargaLaptop, ukuranLayar, CPULaptop, VGALaptop, RAMLaptop, storageLaptop);

        String merekHandphone = JOptionPane.showInputDialog("Masukkan merek handphone:");
        String modelHandphone = JOptionPane.showInputDialog("Masukkan model handphone:");
        int hargaHandphone = Integer.parseInt(JOptionPane.showInputDialog("Masukkan harga handphone:"));
        double layar = Double.parseDouble(JOptionPane.showInputDialog("Masukkan ukuran layar handphone:"));
        String CPUHandphone = JOptionPane.showInputDialog("Masukkan CPU handphone:");
        int baterai = Integer.parseInt(JOptionPane.showInputDialog("Masukkan kapasitas baterai handphone (mAh):"));
        int RAMHandphone = Integer.parseInt(JOptionPane.showInputDialog("Masukkan RAM handphone (GB):"));
        int storageHandphone = Integer.parseInt(JOptionPane.showInputDialog("Masukkan storage handphone (GB):"));

     Handphone handphone = new Handphone(merekHandphone, modelHandphone, hargaHandphone, layar, CPUHandphone, baterai, RAMHandphone, storageHandphone);

        System.out.println("\n     Informasi Laptop :");
        System.out.println("==============================");
        laptop.informasi("Laptop: ");

        System.out.println("     Informasi Handphone :");
        System.out.println("==============================");
        handphone.informasi("Handphone: ");
    }
}