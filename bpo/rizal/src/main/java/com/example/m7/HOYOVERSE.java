package com.example.m7;

abstract class HOYOVERSE{
    static final String Perusahaan = "HOYOVERSE";
    public abstract String nama ();
    public String ambilperusahaan(){
        return Perusahaan;
    }
}
    class GI extends HOYOVERSE{
        String nama;
        public String nama (){
            nama = "GENSHIN IMPACT";
            return nama;
        }
    }
    class HSR extends HOYOVERSE{
        String nama;
        public String nama (){
            nama = "HONKAI STAR RAIL";
            return nama;
        }
    }
    class TidakBaikf2p extends GI{
        void OvenWorld (){
            System.out.println("Ini game RPG dari "+ambilperusahaan());
            System.out.println("benama "+nama());
            System.out.println("ini type game gacha");
            System.out.println("character nya berjumlah :20");
        }
    }   
    class BAIK extends HSR{
        void OvenWorld (){
            System.out.println("Ini game RPG dari "+ambilperusahaan());
            System.out.println("bernama "+nama());
            System.out.println("ini type Turn Base");
            System.out.println("character nya berjumlah :30");
        }
    }
    class Hoyo{
        public static void main(String []args){
            TidakBaikf2p Tb = new TidakBaikf2p();
            BAIK BB = new BAIK();
            Tb.OvenWorld();
            System.out.println("............:");
            System.out.println("");
            BB.OvenWorld();
        }
}