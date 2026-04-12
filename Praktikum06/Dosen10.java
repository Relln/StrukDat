package Praktikum06;

public class Dosen10 {
    String kode;
    String nama;
    boolean jenisKelamin;
    int usia;

    Dosen10(String kd, String name, boolean jK, int umur) {
        kode = kd;
        nama = name;
        jenisKelamin = jK;
        usia = umur;
    }

    void tampil(){
        System.out.println("Kode Dosen: " + kode);
        System.out.println("Nama Dosen: " + nama);
        System.out.println("Jenis Kelamin: " + (jenisKelamin ? "Laki-laki" : "Perempuan"));
        System.out.println("Usia: " + usia + " tahun");
    }
}
