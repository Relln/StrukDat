package P1Jobsheet10;

public class Mahasiswa10 {
    String nama, nim, prodi, kelas;

    public Mahasiswa10(String nim, String nama, String prodi, String kelas) {
        this.nama = nama;
        this.nim = nim;
        this.prodi = prodi;
        this.kelas = kelas;
    }

    public void tampilkanData() {
        System.out.println(nim + " - " + nama + " - " + prodi + " - " + kelas);
    }

}
