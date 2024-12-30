package com.example.All;

public class Construktor {
    String data,data2;
    public Construktor(String data,String data2)
    {
        this.data=data;
        this.data2=data2;
    }
    
        void cetakConst()
    {
        System.out.printf("%s %s",this.data,this.data2);
        System.out.println(" ");
    }
    public static void main(String[] fian) {
        Construktor a = new Construktor("RIO", "FKOM");
        a.cetakConst();
    }
}
