package com.example.projek;

class Laptop extends Electronik {
    private double ukuranLayar;
    private String CPU;
    private String VGA;
    private int RAM, storage;
    public Laptop(String merek, String model, int harga, double ukuranLayar, String CPU, String VGA, int RAM, int storage) {
        super(merek, model, harga);
        this.ukuranLayar = ukuranLayar;
        this.CPU = CPU;
        this.VGA = VGA;
        this.RAM = RAM;
        this.storage = storage;
    }
    public void informasi() {
        super.informasi();
        System.out.println("Ukuran Layar : " + ukuranLayar + " Inci");
        System.out.println("CPU          : " + CPU);
        System.out.println("VGA          : " + VGA);
        System.out.println("RAM          : " + RAM + " GB");
        System.out.println("Storage      : " + storage + " GB\n");
    }
    public void informasi(String prefix) {
        super.informasi(prefix);
        System.out.println(prefix + "Ukuran Layar : " + ukuranLayar + " Inci");
        System.out.println(prefix + "CPU          : " + CPU);
        System.out.println(prefix + "VGA          : " + VGA);
        System.out.println(prefix + "RAM          : " + RAM + " GB");
        System.out.println(prefix + "Storage      : " + storage + " GB\n");
    }
}