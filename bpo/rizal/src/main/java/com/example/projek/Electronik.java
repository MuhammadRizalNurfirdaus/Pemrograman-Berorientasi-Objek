package com.example.projek;

public class Electronik {
    private String merek, model;
    private int harga;

    public Electronik(String merek, String model, int harga) {
        this.merek = merek;
        this.model = model;
        this.harga = harga;
    }

    public void informasi() {
        System.out.println("Merek        : " + merek);
        System.out.println("Model        : " + model);
        System.out.println("Harga        : " + harga);
    }

    public void informasi(String prefix) {
        System.out.println(prefix + "Merek        : " + merek);
        System.out.println(prefix + "Model        : " + model);
        System.out.println(prefix + "Harga        : " + harga);
    }
}