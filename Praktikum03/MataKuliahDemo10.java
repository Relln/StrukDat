package Praktikum03;

import java.util.Scanner;
public class MataKuliahDemo10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MataKuliah10[] arrayOfMataKuliah = new MataKuliah10[3];

        System.out.print("Masukkan jumlah Mata Kuliah: ");
        int jmlElemen = Integer.parseInt(sc.nextLine());

        MataKuliah10[] arrayOfMatakuliah = new MataKuliah10[jmlElemen];
        
        for (int i=0; i < arrayOfMatakuliah.length; i++) {
            System.out.println("Masukkan Data Matakuliah ke-" + (i + 1));
           arrayOfMatakuliah[i] = new MataKuliah10();
           arrayOfMatakuliah[i].tambahData(sc); 
        }

        for (int i=0; i < arrayOfMatakuliah.length; i++) {
            System.out.println("Data Matakuliah ke-" + (i + 1 ));
            arrayOfMatakuliah[i].cetakInfo();
        }
    }
}
