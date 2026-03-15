package minggu5;

class Mahasiswa {
    String nama, nim;
    int nilaiUTS;
    int nilaiUAS;
    int tahunMasuk;

    Mahasiswa(String nama, String nim, int tahunMasuk, int nilaiUTS, int nilaiUAS) {
        this.nama = nama;
        this.nim = nim;
        this.tahunMasuk = tahunMasuk;
        this.nilaiUTS = nilaiUTS;
        this.nilaiUAS = nilaiUAS;
    }

    Mahasiswa(String nama, int nilaiUTS){
        this.nama = nama;
        this.nilaiUTS = nilaiUTS;
    }
}

public class LatihanPraktikum {
    public static int nilaiTertinggiUTS(Mahasiswa[] mhs, int l, int r){
        if(l==r){
            return mhs[l].nilaiUTS;
        }

        int mid = (l + r)/2;
        int lmax = nilaiTertinggiUTS(mhs, l, mid);
        int rmax = nilaiTertinggiUTS(mhs, mid+1, r);
        return (lmax > rmax) ? lmax : rmax;
    }

    public static int nilaiTerendahUTS(Mahasiswa[] mhs, int l, int r){
        if(l==r){
            return mhs[l].nilaiUTS;
        }

        int mid = (l + r)/2;
        int lmin = nilaiTerendahUTS(mhs, l, mid);
        int rmin = nilaiTerendahUTS(mhs, mid+1, r);
        return (lmin < rmin) ? lmin : rmin;
    }

    public static double hitungRataUAS(Mahasiswa[] mhs){
        double total = 0;
        for (int i=0; i<mhs.length; i++){
            total += mhs[i].nilaiUAS;
        }
        return total / mhs.length;
    }

    public static void main(String[] args) {
        Mahasiswa[] daftarMhs = {
            new Mahasiswa("Ahmad", "220101001", 2022, 78, 82),
            new Mahasiswa("Budi",  "220101002", 2022, 85, 88),
            new Mahasiswa("Cindy", "220101003", 2021, 90, 87),
            new Mahasiswa("Dian",  "220101004", 2021, 76, 79),
            new Mahasiswa("Eko",   "220101005", 2023, 92, 95),
            new Mahasiswa("Fajar", "220101006", 2020, 88, 85),
            new Mahasiswa("Gina",  "220101007", 2023, 80, 83),
            new Mahasiswa("Hadi",  "220101008", 2020, 82, 84)
    
        };
        int n = daftarMhs.length;
        System.out.println("Nilai UTS tertinggi(DC): " + nilaiTertinggiUTS(daftarMhs, 0, n-1));
        System.out.println("Nilai UTS terendah(DC): " + nilaiTerendahUTS(daftarMhs, 0, n-1));
        System.out.println("Rata-rata nilai UAS(BF): " + hitungRataUAS(daftarMhs)); 
    }


}
