package com.example.m9;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

class BacaFile {
    public static void main(String[] args) throws IOException
    {    
        String namaFile = "PBO.txt";
        String namaMhs, jurusan, angkatan;
        try
        {
            FileInputStream inFile = new FileInputStream(namaFile);
            DataInputStream inStream = new DataInputStream(inFile);
            namaMhs = inStream.readUTF();
            jurusan = inStream.readUTF();
            angkatan = inStream.readUTF();
            inStream.close();
            System.out.println("Nama : "+namaMhs+"\nJurusan : "+jurusan+"\nAngakatan : "+angkatan);
        }
        catch (FileNotFoundException e)
        {
            System.out.println("File "+ namaFile+"Tidak Ada !\n");
        }
        catch (IOException ex)
        {
            System.out.println("IOERROR:"+ex.getMessage() + "\n");
        }
    }
}
