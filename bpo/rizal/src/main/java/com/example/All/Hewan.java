package com.example.All;

public class Hewan
    {String jenis,ciri;
        public void suara(){System.out.println("Suara Hewan");}
        public void berjalan(){System.out.println("Cara Berjalan Hewan");}
        }
    class Singa extends Hewan{
        public void suara(){System.out.println("WaouWaou");}
        public void berjalan(){
            System.out.println("Berlari");
            System.out.println("======================");
        }
    }
    class Elang extends Hewan{
        public void suara(){System.out.println("Leooookkk");}
        public void berjalan(){
            System.out.println("Terbang");
            System.out.println("======================");
        }
    }
    class Lebah extends Hewan{
        public void suara(){System.out.println("Wunngggggg");}
        public void berjalan(){
            System.out.println("Terbang");
            System.out.println("======================");
        }
    }
    class Paus extends Hewan{
        public void suara(){System.out.println("Leooookkk");}
        public void berjalan(){
            System.out.println("Berenang");
            System.out.println("======================");
        }
    }