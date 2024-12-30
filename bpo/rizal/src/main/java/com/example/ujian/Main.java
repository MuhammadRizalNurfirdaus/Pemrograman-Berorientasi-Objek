package com.example.ujian;

abstract class Pegawai {
    private String nama;
    private String idPegawai;
    private double gaji;

    public Pegawai(String nama, String idPegawai, double gaji){
        this.nama=nama;
        this.idPegawai=idPegawai;
        this.gaji=gaji;
    }

    public String getNama(){
        return nama;
    }
    public String getidPegawai(){
        return idPegawai;
    }
    public Double getGaji(){
        return gaji;
    }

    public abstract void tampilkanInfo();
}

class PegawaiTetap extends Pegawai{
    private String tunjangan;

    public PegawaiTetap(String nama, String idPegawai, double gaji, String tunjangan){
        super(nama, idPegawai, gaji);
        this.tunjangan=tunjangan;
    }
    @Override
    public void tampilkanInfo(){
        System.out.println("Nama Pegawai Tetap: " + getNama());
        System.out.println("ID Pegawai: " + getidPegawai());
        System.out.println("Gaji: " + getGaji());
        System.out.println("Tunjuangan: " +tunjangan);
    }
}

class PegawaiKontrak extends Pegawai{
    private int durasiKontrak;

    public PegawaiKontrak(String nama, String idPegawai, double gaji, int durasiKontrak){
        super(nama, idPegawai, gaji);
        this.durasiKontrak=durasiKontrak;
    }

    @Override
    public void tampilkanInfo(){
        System.out.println("Nama Pegawai Kontrak: " + getNama());
        System.out.println("ID Pegawai: " + getidPegawai());
        System.out.println("Gaji: " + getGaji());
        System.out.println("Durasi Kontrak (bulan): " + durasiKontrak);
    }
}

class Perusahaan{
    private Pegawai pegawai1;
    private Pegawai pegawai2;

    public Perusahaan(Pegawai pegawai1, Pegawai pegawai2){
        this.pegawai1=pegawai1;
        this.pegawai2=pegawai2;
    }

    public void tampilkanSemuaPegawai(){
        pegawai1.tampilkanInfo();
        System.out.println();
        pegawai2.tampilkanInfo();
    }
}

public class Main{
    public static void main(String[] args) {
        Pegawai pegawai1 = new PegawaiTetap("Agung", "2019774", 5000.0, "Asuransi Kesehatan");
        Pegawai pegawai2 = new PegawaiKontrak("Ujang", "21885940", 3000.0, 12);

        Perusahaan perusahaan = new Perusahaan(pegawai1, pegawai2);

        perusahaan.tampilkanSemuaPegawai();
    }
}
