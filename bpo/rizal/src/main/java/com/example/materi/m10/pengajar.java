package com.example.materi.m10;

abstract class pengajar {
    public String nama;
    public abstract void caramakan();
    public void kerja(){
        System.out.println(this.nama + " sebagai dosen yang mengajar mata kuliah pbo");
    }
    public static void main(String[] args) {
        dosn objek1 = new dosn("Siti Maesyaroh");
        objek1.kerja();
        objek1.caramakan();
    }
}
class dosn extends pengajar {
    public dosn (String nama){
        this.nama=nama;
    }
    public void caramakan(){
        System.out.println("Jika makan menggunakan sendok");
    }
}