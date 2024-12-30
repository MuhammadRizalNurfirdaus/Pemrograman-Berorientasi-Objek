import struktural.kaprodi;

public class sekprodi {
    public void kerja(){
        System.out.println("1. Memebantu melaksanakan kebijakan prodi");
    }

    public static void main(String[] args) {
        kaprodi TI;
        TI = new kaprodi();
        sekprodi ti = new sekprodi();
        System.out.println("Tugas Sekretaris Prodi :");
        ti.kerja();
        TI.santai();
    }
}