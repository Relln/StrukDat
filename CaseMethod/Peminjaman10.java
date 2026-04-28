package CaseMethod;

public class Peminjaman10 {
    Mahasiswa10 mhs;
    Buku10 buku;
    int lamaPinjam;
    int batasPinjam = 5;
    int terlambat;
    int denda;

    public Peminjaman10(Mahasiswa10 m, Buku10 b, int lama) {
        mhs = m;
        buku = b;
        lamaPinjam = lama;
        hitungDenda();
    }

    void hitungDenda() {
        if (lamaPinjam > batasPinjam) {
            terlambat = lamaPinjam - batasPinjam;
            denda = terlambat * 2000;
        } else {
            terlambat = 0;
            denda = 0;
        }
    }

    void tampilPeminjaman() {
        System.out.println(mhs.nama + " | " + buku.judul +    " | Lama: " + lamaPinjam +  " | " + "Terlambat: " + terlambat
                            +   "   | Denda: Rp " + denda);        
    }
}
