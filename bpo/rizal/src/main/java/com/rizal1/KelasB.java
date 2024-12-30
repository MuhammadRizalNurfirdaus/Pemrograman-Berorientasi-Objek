package com.rizal1;
import com.rizal.KelasA;

public class KelasB {
    public String Temanku;

    public KelasB() {
        KelasA kelasA = new KelasA();
        this.Temanku = kelasA.Nama + " dan Temanku Rafif dari Kelas B";
    }

    public String temankudariB() {
        return Temanku;
    }
public static void main(String[] args) {
    KelasA objA = new KelasA();
    KelasB objB = new KelasB();
    System.out.println(objA.Namasaya());
    System.out.println(objB.temankudariB());
}
}