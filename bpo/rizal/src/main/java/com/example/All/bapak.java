package com.example.All;

public class bapak extends kakek {
    protected String namebapak;
    protected String addressbapak;

    public bapak() {
        System.out.println("Nama Kakek :" + namekakek);
        System.out.println("Alamat Kakek :" + address);
        System.out.println("\n");
        System.out.println(" Masukan construktor Bapak ");
        System.out.println("---Dijalankan class cucu---");
        namebapak = "ROHAEDI";
        addressbapak = "KUNINGAN";
    }

    public bapak(String namebapak, String addressbapak) {
        this.namebapak = namebapak;
        this.addressbapak = addressbapak;
    }

    public String getNama() {
        return namebapak;
    }

    public String getAddress() {
        return addressbapak;
    }

    public static void main(String[] args) {
        bapak sari = new bapak();
    }
}