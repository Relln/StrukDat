public class Dosen10 {
    
    String idDosen;
    String nama;
    boolean statusAktif;
    int tahunBergabung;
    String bidangKeahlian;

    public Dosen10() {
    }

    public Dosen10(String idDos, String nm, boolean statAkt, int thngabung, String bidahli) {
        idDosen = idDos;
        nama = nm;
        statusAktif = statAkt;
        tahunBergabung = thngabung;
        bidangKeahlian = bidahli;
    }

    void tampilkanInformasi() {
        System.out.println("ID Dosen: " + idDosen);
        System.out.println("Nama: " + nama);
        System.out.println("Status Aktif: " + statusAktif);
        System.out.println("Tahun Bergabung: " + tahunBergabung);
        System.out.println("Bidang Keahlian: " + bidangKeahlian);
    }

    void setStatusAktif(boolean status) {
        statusAktif = status;
        System.out.println("Status aktif dosen: " + nama + " telah diubah");
    }

    int hitungMasaKerja(int thnSkrg) {
        return thnSkrg - tahunBergabung;
    }

    void ubahKeahlian(String bidang) {
        bidangKeahlian = bidang;
        System.out.println("Keahlian dosen: " + nama + " telah diubah menjadi " + bidang);
        System.out.println();
    }
}
