public class DosenMain10 {
    public static void main(String[] args) {
        Dosen10 dsn1 = new Dosen10();
        dsn1.idDosen = "D001";
        dsn1.nama = "Budi Santoso";
        dsn1.statusAktif = true;
        dsn1.tahunBergabung = 2010;
        dsn1.bidangKeahlian = "Struktur Data";

        Dosen10 dsn2 = new Dosen10("Naufal Farhan", "D002", false, 2016, "Sistem Operasi");

        dsn1.tampilkanInformasi();
        dsn1.setStatusAktif(false);
        dsn1.hitungMasaKerja(2020);
        dsn1.ubahKeahlian("Algoritma");
        dsn1.tampilkanInformasi(); 

        dsn2.tampilkanInformasi();
        dsn2.setStatusAktif(true);
        dsn2.hitungMasaKerja(2021);
        dsn2.ubahKeahlian("Jaringan Komputer");
        dsn2.tampilkanInformasi();




    }
}
