package Praktikum09;

public class Mahasiswa10 {
    String nim;
    String nama;
    String kelas;
    int nilai;

    Mahasiswa10(){
    }

    Mahasiswa10(String name, String nm, String kls){
        nama = name;
        nim = nm;
        kelas = kls;
        nilai = -1;
    }

    void tugasDinilai(int nilai) {
        this.nilai = nilai;
    }
}