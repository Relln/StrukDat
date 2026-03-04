package Praktikum03;

import java.util.Scanner;

public class DosenDemo10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Dosen10[] arrayOfDosen = new Dosen10[3];
        String kode, nama, jK;
        boolean jenisKelamin;
        int usia; 

        for (int i=0; i < 3; i++) { 
            System.out.println("Masukkan Data Dosen ke-" + (i + 1));
            System.out.print("Kode          : ");
            kode = sc.nextLine();
            System.out.print("Nama          : ");
            nama = sc.nextLine();
            System.out.print("Jenis Kelamin : ");
            jK = sc.nextLine();
            jenisKelamin = jK.equalsIgnoreCase("Pria");
            System.out.print("Usia          : ");
            usia = Integer.parseInt(sc.nextLine());
            System.out.println("------------------------------------");
        
            arrayOfDosen[i] = new Dosen10(kode, nama, jenisKelamin, usia);
        }

        DataDosen10.dataSemuaDosen(arrayOfDosen);
        DataDosen10.jumlahDosenPerJenisKelamin(arrayOfDosen);
        DataDosen10.rerataUsiaDosenPerJenisKelamin(arrayOfDosen);
        DataDosen10.infoDosenPalingTua(arrayOfDosen);
        DataDosen10.infoDosenPalingMuda(arrayOfDosen);

    }
}
