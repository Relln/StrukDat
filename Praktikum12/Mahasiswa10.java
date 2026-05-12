package Praktikum12;

public class Mahasiswa10 {
    String nama;
    String nim;
    String kelas;

    public Mahasiswa10() {
    }

    public Mahasiswa10(String nm, String name, String kls) {
        nim = nm;
        nama = name;
        kelas = kls;
    }

    public void tampilInformasi() {
        System.out.println(nim + "       " + nama + "       " + kelas + "       ");
    }
}