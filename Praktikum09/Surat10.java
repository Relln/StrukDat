package Praktikum09;

public class Surat10 {
    String idSurat;
    String namaMahasiswa;
    String Kelas;
    char jenisIzin;
    int durasi;

    Surat10() {
    }

    Surat10(String ids, String nmMhs, String kls, char jnsIzin, int drsi) {
        idSurat = ids;
        namaMahasiswa = nmMhs;
        Kelas = kls;
        jenisIzin = jnsIzin;
        durasi = drsi;
    }

    public String toString() {
        return "ID: " + idSurat + " | Nama: " + namaMahasiswa + " | Jenis: " + jenisIzin + " | Durasi: " + durasi + " hari";
    }
}
