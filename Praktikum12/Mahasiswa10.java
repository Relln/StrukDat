package Praktikum12;

public class Mahasiswa10 {
    String nama;
    String nim;
    String kelas;
    double ipk;

    public Mahasiswa10() {
    }

    public Mahasiswa10(String nm, String name, String kls, double ip) {
        nim = nm;
        nama = name;
        kelas = kls;
        ipk = ip;
    }

    public void tampilInformasi() {
        System.out.println(nim + "       " + nama + "       " + kelas + "       " + ipk + "         ");
    }
}