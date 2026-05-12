package Praktikum12;

import java.util.Scanner;

public class Main10 {
    public static void main(String[] args) {
        LayananAntrian10 q = new LayananAntrian10();
        Scanner sc = new Scanner(System.in);
        int menu;

        do {
            System.out.println("\n--- MENU ANTRIAN KEMAHASISWAAN ---");
            System.out.println("1. Tambah Antrian (Enqueue)");
            System.out.println("2. Panggil Antrian (Dequeue)");
            System.out.println("3. Cek Antrian Depan & Belakang");
            System.out.println("4. Cek Jumlah Antrian");
            System.out.println("5. Kosongkan Antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            menu = sc.nextInt();
            sc.nextLine();

            switch (menu) {
                case 1:
                    System.out.print("NIM  : ");
                    String nim = sc.nextLine();
                    System.out.print("Nama : ");
                    String nama = sc.nextLine();
                    System.out.print("Kelas : ");
                    String kelas = sc.nextLine();
                    q.enqueue(new Mahasiswa10(nim, nama, kelas));
                    break;
                case 2:
                    q.dequeue();
                    break;
                case 3:
                    q.peek();
                    break;
                case 4:
                    q.displaySize();
                    break;
                case 5:
                    q.clear();
                    break;
            }
        } while (menu != 0);
    }
}
