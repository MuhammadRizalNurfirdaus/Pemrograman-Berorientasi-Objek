package com.example.All;

public class Dosen extends Person {
    private String idDosen;
    public Dosen()
    {
    }
    public Dosen (String Nama, String Alamat, int Umur, String idDosen){
        super (Nama, Alamat, Umur);
        this.idDosen = idDosen;
    }
    public String getIdDosen()
    {
        return idDosen;
    }
    public void setIdDosen(String idDosen)
    {
        this.idDosen = idDosen;
    }
    public void infoDosen()
    {
        System.out.println("\nInfo Dosen");
        System.out.println("idDosen\t\t: "+getIdDosen());
        System.out.println("Nama\t\t: "+getNama());
        System.out.println("Alamat\t\t\t: "+getAlamat());
        System.out.println("Umur\t\t: "+getUmur());
    }
}