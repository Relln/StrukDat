package Praktikum06;

import java.util.Scanner;

public class MahasiswaDemo10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jml = sc.nextInt();

        MahasiswaBerprestasi10 data = new MahasiswaBerprestasi10(jml);
        for (int i = 0; i < jml; i++) {
            System.out.println("Masukkan data mahasiswa ke-" + (i + 1));
            System.out.print("NIM: ");
            String nim = sc.next();
            System.out.print("Nama: ");
            String nama = sc.next();
            System.out.print("Kelas: ");
            String kelas = sc.next();
            System.out.print("IPK: ");
            double ipk = sc.nextDouble();

            Mahasiswa10 mhs = new Mahasiswa10(nim, nama, kelas, ipk);
            data.tambah(mhs);
        }

        System.out.println("Data Mahasiswa sebelum sorting:");
        data.tampil();

        System.out.println("Data Mahasiswa setelah sorting berdasarkan IPK (DESC) :");
        data.bubbleSort();
        data.tampil();
    }
}
