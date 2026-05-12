package Praktikum12;

import java.util.Scanner;

public class SLLMain10 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    SingleLinkedList10 sll = new SingleLinkedList10();
    char pilih;

    do {
            System.out.println("--- Input Data Mahasiswa ---");
            System.out.print("Nama    : ");
            String nama = sc.nextLine();
            System.out.print("NIM     : ");
            String nim = sc.nextLine();
            System.out.print("Kelas   : ");
            String kelas = sc.nextLine();
            System.out.print("IPK     : ");
            double ipk = sc.nextDouble();
            sc.nextLine(); 

            Mahasiswa10 mhs = new Mahasiswa10(nama, nim, kelas, ipk);
            sll.addLast(mhs);

            System.out.print("Tambah data lagi? (y/n): ");
            pilih = sc.next().charAt(0);
            sc.nextLine(); 
            System.out.println("");

        } while (pilih == 'y' || pilih == 'Y');

        sll.print();



    }
}
