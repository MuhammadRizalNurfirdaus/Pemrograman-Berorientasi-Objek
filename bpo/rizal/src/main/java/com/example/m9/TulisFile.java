package com.example.m9;

import java.io.DataOutputStream;
import java.io.FileOutputStream;        
import java.io.IOException;

public class TulisFile 
{
    public static void main(String[] args) throws IOException
    {
        String namaFile = "PBO.txt";
        String namaMhs = "Rio Andriyat Krisdiawan, M.Kom\n";
        String jurusan = "Teknik Informatika\n";
        String angkatan = "2007";
        FileOutputStream outFile = new FileOutputStream(namaFile);
        try
        {
            DataOutputStream outStream=new DataOutputStream(outFile);
            outStream.writeUTF(namaMhs);
            outStream.writeUTF(jurusan);
            outStream.writeUTF(angkatan);
            outStream.close();
        }
        catch (IOException e)
        {
            System.out.println("IOERROR:"+e.getMessage() + "\n");
        }
    }
}