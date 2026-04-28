package CaseMethod;

import java.util.Scanner;

public class MainSistemPeminjaman10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Mahasiswa10[] daftarMhs = {
            new Mahasiswa10("22001", "Andi", "Teknik Informatika"),
            new Mahasiswa10("22002", "Budi", "Teknik Informatika"),
            new Mahasiswa10("22003", "Citra", "Sistem Informasi Bisnis")
        };

        Buku10[] daftarBuku = {
            new Buku10("B001", "Algoritma", 2020),
            new Buku10("B002", "Basis Data", 2019),
            new Buku10("B003", "Pemrograman", 2021),
            new Buku10("B004", "Fisika", 2024)
        };

        Peminjaman10[] pinjam = {
            new Peminjaman10(daftarMhs[0], daftarBuku[0], 7),
            new Peminjaman10(daftarMhs[1], daftarBuku[1], 3),
            new Peminjaman10(daftarMhs[2], daftarBuku[2], 10),
            new Peminjaman10(daftarMhs[2], daftarBuku[3], 6),
            new Peminjaman10(daftarMhs[0], daftarBuku[1], 4)
        };

        int pilih;

        do { 
            System.out.println("=== SISTEM PEMINJAMAN RUANG BACA JTI ===");
            System.out.println("1. Tampilkan Mahasiswa");
            System.out.println("2. Tampilkan Buku");
            System.out.println("3. Tampilkan Peminjaman");
            System.out.println("4. Urutkan Berdasarkan Denda");
            System.out.println("5. Cari Berdasarkan NIM");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");

            if (sc.hasNextInt()) {
                pilih = sc.nextInt();

            switch (pilih) {
                case 1:
                    System.out.println("\nDaftar Mahasiswa: ");
                    for (Mahasiswa10 m : daftarMhs) 
                        m.tampilMahasiswa();
                    break;
                case 2:
                    System.out.println("\nDaftar Buku: ");
                    for (Buku10 b : daftarBuku) 
                        b.tampilBuku();
                    break;
                case 3:
                    System.out.println("\nDaftar Peminjaman: ");
                    for (Peminjaman10 p : pinjam) 
                        p.tampilPeminjaman();
                    break;
                case 4:
                    System.out.println("\nSetelah diurutkan (Denda Terbesar):");
                    insertionSortDenda(pinjam);
                    for (Peminjaman10 p : pinjam) 
                        p.tampilPeminjaman();
                    break;
                case 5:
                    System.out.print("Masukkan NIM: ");
                    String cariNim = sc.next();
                    sortNim(pinjam);
                    int hasil = binarySearchNim(pinjam, cariNim);
                    if (hasil != -1) {
                        pinjam[hasil].tampilPeminjaman();
                    } else {
                        System.out.println("Peminjaman dengan NIM " + cariNim + " tidak ditemukan.");
                    }
                    break;
                case 0:
                    System.out.println("Terima kasih! Program selesai.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
                    break;
                }
            } else {
                System.out.println("Input tidak valid! Harap masukkan angka");
                sc.next(); 
                pilih = -1;
            }

        } while (pilih !=0);
    }
    
        public static void insertionSortDenda(Peminjaman10[] arr) {
            for (int i = 1; i < arr.length; i++) {
                Peminjaman10 key = arr[i];
                int j = i - 1;
                while (j >= 0 && arr[j].denda < key.denda) {
                    arr[j + 1] = arr[j];
                    j--;
                }
                arr[j + 1] = key;
            }
        }

        public static void sortNim(Peminjaman10[] arr) {
            for (int i = 1; i < arr.length; i++) {
                Peminjaman10 key = arr[i];
                int j = i - 1;
                while (j >= 0 && arr[j].mhs.nim.compareTo(key.mhs.nim) > 0) {
                    arr[j + 1] = arr[j];
                    j--;
                }
                arr[j + 1] = key;
            }
        }

        public static int binarySearchNim(Peminjaman10[] arr, String KeyNim) {
            int low = 0, high = arr.length - 1;
            int right = arr.length - 1;
            while (low <= high) {
                int mid = (high - low) / 2;
                int res = KeyNim.compareTo(arr[mid].mhs.nim);
                if (res == 0) return mid;
                if (res > 0) low = mid + 1;
                else high = mid - 1;
            }
            return -1; 
        }

    
}
