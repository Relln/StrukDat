public class MataKuliah10 {
    
    String kodeMK;
    String nama;
    int sks;
    int jumlahjam;

    public MataKuliah10() {
    }

    public MataKuliah10(String kdMK, String nm, int sks, int jmljam) {
        kodeMK = kdMK;
        nama = nm;
        this.sks = sks;
        jumlahjam = jmljam;
    }

    void tampilkanInformasi() {
        System.out.println("Kode MK: " + kodeMK);
        System.out.println("Nama: " + nama);
        System.out.println("SKS: " + sks);
        System.out.println("Jumlah Jam: " + jumlahjam);
    }

    void ubahSKS(int sksBaru) {
        sks = sksBaru;
        System.out.println("SKS untuk " + nama + " berhasil diubah menjadi: " + sks);
    }

    void tambahJam(int jam) {
        jumlahjam += jam;
        System.out.println("Jumlah jam berhasil ditambahkan. Total jam sekarang: " + jumlahjam);
    }

    void kurangiJam(int jam) {
        if (jumlahjam >= jam) {
            jumlahjam -= jam;
            System.out.println("Pengurangan jam berhasil. Jumlah jam baru: " + jumlahjam);
        } else {
        System.out.println("Pengurangan jam gagal. Jumlah jam tidak cukup.");
        }
    }
}
