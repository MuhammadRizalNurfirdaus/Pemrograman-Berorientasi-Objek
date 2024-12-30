package com.example.Kelompok;
import java.util.Stack;

public class RakBuku {
    private final Stack<String> tumpukanBuku;

    public RakBuku() {
        tumpukanBuku = new Stack<>();
    }

    // Menambahkan buku baru ke tumpukan
    public void tambahBuku(String judul) {
        tumpukanBuku.push(judul);
        System.out.println(judul + " ditambahkan ke tumpukan.");
    }

    // Menghapus buku dari tumpukan
    public void ambilBuku() {
        if (!tumpukanBuku.isEmpty()) {
            String bukuDiambil = tumpukanBuku.pop();
            System.out.println(bukuDiambil + " diambil dari tumpukan.");
        } else {
            System.out.println("Tumpukan buku kosong.");
        }
    }

    // Menampilkan daftar buku dalam tumpukan
    public void tampilkanBuku() {
        System.out.println("Buku dalam tumpukan:");
        for (String buku : tumpukanBuku) {
            System.out.println(buku);
        }
    }

    public static void main(String[] args) {
        RakBuku rak = new RakBuku();
        rak.tambahBuku("Java Programming");
        rak.tambahBuku("Data Structures and Algorithms");
        rak.tampilkanBuku();
        rak.ambilBuku();
        rak.tampilkanBuku();
    }
}