package P1Jobsheet10;

import java.util.Scanner;

public class PersetujuanKRS10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AntrianKRS10 antrian = new AntrianKRS10();
        int pilih;

        do {
            System.out.println("\n=== MENU ANTRIAN KRS ===");
            System.out.println("1. Tambah Mahasiswa ke Antrian");
            System.out.println("2. Panggil Antrian (Proses 2 Mahasiswa)");
            System.out.println("3. Tampilkan Semua Antrian");
            System.out.println("4. Lihat 2 Terdepan & Terakhir");
            System.out.println("5. Cek Status/Jumlah");
            System.out.println("6. Kosongkan Antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("NIM: ");
                    String nim = sc.nextLine();
                    System.out.print("Nama: ");
                    String nama = sc.nextLine();
                    antrian.enqueueKRS(new DataMahasiswa10(nim, nama));
                    break;
                case 2:
                    antrian.dequeueKRS();
                    break;
                case 3:
                    antrian.tampilkanData();
                    break;
                case 4:
                    antrian.lihatPeek();
                    break;
                case 5:
                    antrian.printStats();
                    break;
                case 6:
                    antrian.clear();
                    break;
            }
        } while (pilih != 0);
    }
}
