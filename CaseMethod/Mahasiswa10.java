package CaseMethod;

public class Mahasiswa10 {
    String nama;
    String nim;
    String prodi;

    public Mahasiswa10(String nm, String name, String pro) {
        nim = nm;
        nama = name;
        prodi = pro;
    }

    void tampilMahasiswa() {
        System.out.println("NIM: " + nim + " | Nama: " + nama + " | Prodi: " + prodi);
    }
}