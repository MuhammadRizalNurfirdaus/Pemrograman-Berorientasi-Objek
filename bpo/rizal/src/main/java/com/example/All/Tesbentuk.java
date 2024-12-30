package com.example.All;

class Bentuk {
  public void gambar(){System.out.println("Menggambar");}
  public void hapus(){System.out.println("Menghapus gambar\n");}  
}
class Lingkaran extends Bentuk{
    public void gambar(){System.out.println("Gambar Lingkaran");}
    public void hapus(){System.out.println("Hapus Lingkaran\n");}
}
class Elips extends Bentuk{
    public void gambar(){System.out.println("Gambar Elips");}
    public void hapus(){System.out.println("Hapus Elips\n");}
}
class Segitiga extends Bentuk{
    public void gambar(){System.out.println("Gambar Segitiga");}
    public void hapus(){System.out.println("Hapus Segitiga\n");}
}
public class Tesbentuk{
    public static void main(String[] args) {
        Bentuk b = new Bentuk();
        Lingkaran l = new Lingkaran();
        Elips e = new Elips();
        Segitiga s = new Segitiga();
        System.out.println("Bentuk");
        b.gambar(); b.hapus();
        System.out.println("Bentuk Lingkaran");
        l.gambar(); l.hapus();
        System.out.println("Bentuk Elips");
        e.gambar(); e.hapus();
        System.out.println("Bentuk Segitiga");
        s.gambar(); s.hapus();
    }
}