public class MataKuliahMain10 {
    public static void main(String[] args) {
        MataKuliah10 mk1 = new MataKuliah10();
        mk1.kodeMK = "ASD_01";   
        mk1.nama = "Algoritma dan Struktur Data";
        mk1.sks = 3;
        mk1.jumlahjam = 6;

        MataKuliah10 mk2 = new MataKuliah10("PASD_02", "Praktikum Algoritma dan Struktur Data", 4, 8);

        mk1.tampilkanInformasi();
        mk1.ubahSKS(3);
        mk1.tambahJam(2);
        mk1.kurangiJam(1);
        mk1.tampilkanInformasi();

        mk2.tampilkanInformasi();
        mk2.ubahSKS(4);
        mk2.tambahJam(2);
        mk2.kurangiJam(3);
        mk2.tampilkanInformasi();
    }
}
