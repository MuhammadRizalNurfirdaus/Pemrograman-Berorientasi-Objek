package com.example.All;

class MakhlukHidup {
    public String nama;

    public MakhlukHidup(String nm) {
        this.nama = nm;
    }

    public String biodata() {
        return "Nama : " + nama;
    }

    public static void main(String[] args) {
        Pelajar siswa = new Pelajar("Daffa", "20230810", "SMAN 3 KUNINGAN");
        System.out.println(siswa.biodata());
    }
}

class Pelajar extends MakhlukHidup {
    public String nis;
    private String asalSekolah;

    public Pelajar(String namaPelajar, String ns, String sekolah) {
        super(namaPelajar);
        this.nis = ns;
        this.asalSekolah = sekolah;
    }

    public String biodata() {
        return super.biodata() + "\nNIS : " + nis + "\nAsal Sekolah : " + asalSekolah;
    }
}