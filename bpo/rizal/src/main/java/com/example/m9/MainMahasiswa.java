package com.example.m9;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainMahasiswa {
    private static final String FILE_NAME = "data_mahasiswa.txt";
    private static List<Mahasiswa> mahasiswaList = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        loadMahasiswa();

        while (true) {
            System.out.println("==================");
            System.out.println("MENU PILIHAN");
            System.out.println("-----------------------------------");
            System.out.println("1. Input Data Mahasiswa");
            System.out.println("2. Lihat Data Mahasiswa");
            System.out.println("3. Keluar Dari program");
            System.out.print("Pilih: ");
            int pilihan = scanner.nextInt();
            scanner.nextLine(); 

            switch (pilihan) {
                case 1:
                    inputDataMahasiswa(scanner);
                    break;
                case 2:
                    lihatDataMahasiswa();
                    break;
                case 3:
                    saveMahasiswa();
                    System.out.println("Keluar dari program.");
                    return;
                default:
                    System.out.println("Pilihan tidak valid.");
                    break;
            }
        }
    }

    private static void inputDataMahasiswa(Scanner scanner) {
        System.out.print("Masukkan NIM: ");
        String nim = scanner.nextLine();
        System.out.print("Masukkan Nama: ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan Alamat: ");
        String alamat = scanner.nextLine();
        System.out.print("Masukkan Jenis Kelamin (L/P): ");
        String jenisKelamin = scanner.nextLine();
        System.out.print("Masukkan Program Studi: ");
        String programStudi = scanner.nextLine();
        System.out.print("Masukkan Jurusan: ");
        String jurusan = scanner.nextLine();

        Mahasiswa mahasiswa = new Mahasiswa(nim, nama, alamat, jenisKelamin, programStudi, jurusan);
        mahasiswaList.add(mahasiswa);
        System.out.println("Data mahasiswa berhasil ditambahkan.");
    }

    private static void lihatDataMahasiswa() {
        if (mahasiswaList.isEmpty()) {
            System.out.println("Belum ada data mahasiswa.");
        } else {
            System.out.println("Data Mahasiswa:");
            for (Mahasiswa mhs : mahasiswaList) {
                System.out.println(mhs.toString());
            }
        }
    }

    private static void saveMahasiswa() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME))) {
            for (Mahasiswa mhs : mahasiswaList) {
                writer.write(mhs.toCSV());
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan saat menyimpan data.");
            e.printStackTrace();
        }
    }

    private static void loadMahasiswa() {
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length == 6) {
                    Mahasiswa mahasiswa = new Mahasiswa(data[0], data[1], data[2], data[3], data[4], data[5]);
                    mahasiswaList.add(mahasiswa);
                }
            }
        } catch (IOException e) {
        }
    }
}