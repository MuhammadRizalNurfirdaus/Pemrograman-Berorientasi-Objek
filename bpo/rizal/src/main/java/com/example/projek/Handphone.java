package com.example.projek;

class Handphone extends Electronik {
    private double layar;
    private String CPU;
    private int baterai, RAM, storage;

    public Handphone(String merek, String model, int harga, double layar, String CPU, int baterai, int RAM, int storage) {
        super(merek, model, harga);
        this.layar = layar;
        this.CPU = CPU;
        this.baterai = baterai;
        this.RAM = RAM;
        this.storage = storage;
    }
    public void informasi() {
        super.informasi();
        System.out.println("Ukuran Layar : " + layar + " Inci");
        System.out.println("CPU          : " + CPU);
        System.out.println("Baterai      : " + baterai + " mAh");
        System.out.println("RAM          : " + RAM + " GB");
        System.out.println("Storage      : " + storage + " GB\n");
    }

    public void informasi(String prefix) {
        super.informasi(prefix);
        System.out.println(prefix + "Ukuran Layar : " + layar + " Inci");
        System.out.println(prefix + "CPU          : " + CPU);
        System.out.println(prefix + "Baterai      : " + baterai + " mAh");
        System.out.println(prefix + "RAM          : " + RAM + " GB");
        System.out.println(prefix + "Storage      : " + storage + " GB\n");
    }
}