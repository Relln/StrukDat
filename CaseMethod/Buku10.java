package CaseMethod;

public class Buku10 {
    String kodeBuku;
    String judul;
    int tahunTerbit;

    public Buku10(String kd, String jdl, int thn) {
        kodeBuku = kd;
        judul = jdl;
        tahunTerbit = thn;
    }

    void tampilBuku() {
        System.out.println("Kode: " + kodeBuku + " | Judul: " + judul + " | Tahun Terbit: " + tahunTerbit);
    }
}