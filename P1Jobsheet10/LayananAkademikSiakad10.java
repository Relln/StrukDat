package P1Jobsheet10;

import java.util.Scanner;

public class LayananAkademikSiakad10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AntrianLayanan10 antrian = new AntrianLayanan10(5);
        int pilihan;

        do {
            System.out.println("\n=== Menu Antrian Layanan Akademik ===");
            System.out.println("1. Tambah Mahasiswa ke Antrian");
            System.out.println("2. Layani Mahasiswa");
            System.out.println("3. Lihat Mahasiswa Terdepan");
            System.out.println("4. Lihat Semua Mahasiswa");
            System.out.println("5. Jumlah Mahasiswa dalam Antrian");
            System.out.println("6. Cek Antrian Paling Belakang");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.print("NIM   : ");
                    String nim = sc.next();
                    System.out.print("Nama  : ");
                    String nama = sc.next();
                    System.out.print("Prodi : ");
                    String prodi = sc.next();
                    System.out.print("Kelas : ");
                    String kelas = sc.next();
                    Mahasiswa10 mhs = new Mahasiswa10(nim, nama, prodi, kelas);
                    antrian.tambahAntrian(mhs);
                    break;
                case 2:
                    Mahasiswa10 dilayani = antrian.layaniMahasiswa();
                    if (dilayani != null) {
                        System.out.println("Mahasiswa yang dilayani:");
                        dilayani.tampilkanData();
                    }
                    break;
                case 3:
                    antrian.lihatTerdepan();
                    break;
                case 4:
                    antrian.tampilkanSemua();
                    break;
                case 5:
                    System.out.println("Jumlah dalam Antrian: " + antrian.getJumlahAntrian());
                    break;
                case 6:
                    antrian.lihatTerakhir();
                    break;
                case 0:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid");
            }
        } while (pilihan != 0);

        sc.close();

    }
}
