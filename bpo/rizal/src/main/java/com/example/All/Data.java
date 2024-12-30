package com.example.All;

public class Data {
    private int data1;
    private String data2;
    private double data3;

    // Konstruktor untuk menginisialisasi tiga data
    public Data(int data1, String data2, double data3) {
        this.data1 = data1;
        this.data2 = data2;
        this.data3 = data3;
    }

    // Metode untuk menampilkan data
    public void displayData() {
        System.out.println("Data 1: " + data1);
        System.out.println("Data 2: " + data2);
        System.out.println("Data 3: " + data3);
    }

    public static void main(String[] args) {
        // Membuat objek Data dengan konstruktor
        Data obj = new Data(10, "Hello", 3.14);
        // Menampilkan data
        obj.displayData();
    }
}