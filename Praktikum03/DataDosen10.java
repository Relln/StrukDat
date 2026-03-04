package Praktikum03;

public class DataDosen10 {
    
    public static void dataSemuaDosen(Dosen10[] arrayOfDosen) {
        for (Dosen10 dosen : arrayOfDosen) {
            System.out.println("Kode            : " + dosen.kode);
            System.out.println("Nama            : " + dosen.nama);
            System.out.println("Jenis Kelamin   : " + (dosen.jenisKelamin ? "Pria" : "Wanita"));
            System.out.println("Usia            : " + dosen.usia);
            System.out.println("------------------------------------");
        }
    }

    public static void jumlahDosenPerJenisKelamin(Dosen10[] arrayOfDosen) {
        int jumlahPria = 0;
        int jumlahWanita = 0;

        for (Dosen10 dosen : arrayOfDosen) {
            if (dosen.jenisKelamin) {
                jumlahPria++;
            } else {
                jumlahWanita++;
            }
        }
        System.out.println("Jumlah Dosen Pria   : " + jumlahPria);
        System.out.println("Jumlah Dosen Wanita : " + jumlahWanita);
    }

    public static void rerataUsiaDosenPerJenisKelamin(Dosen10[] arrayOfDosen) {
        int totalUsiaPria = 0;
        int totalUsiaWanita = 0;
        int jmlPria = 0;
        int jmlWanita = 0;

        for (Dosen10 dosen : arrayOfDosen) {
            if (dosen.jenisKelamin) {
                totalUsiaPria += dosen.usia;
                jmlPria++;
            } else {
                totalUsiaWanita += dosen.usia;
                jmlWanita++;
            }
        }

        double rerataUsiaPria = jmlPria > 0 ? (double) totalUsiaPria / jmlPria : 0;
        double rerataUsiaWanita = jmlWanita > 0 ? (double) totalUsiaWanita / jmlWanita : 0;

        System.out.println("Rerata Usia Dosen Pria   : " + rerataUsiaPria);
        System.out.println("Rerata Usia Dosen Wanita : " + rerataUsiaWanita);
    }

    public static void infoDosenPalingTua(Dosen10[] arrayOfDosen) {
        Dosen10 dosenTua = arrayOfDosen[0];

        for (Dosen10 dosen : arrayOfDosen) {
            if (dosen.usia > dosenTua.usia) {
                dosenTua = dosen;
            }
        }

        System.out.println("Dosen Paling Tua:");
        System.out.println("Kode            : " + dosenTua.kode);
        System.out.println("Nama            : " + dosenTua.nama);
        System.out.println("Jenis Kelamin   : " + (dosenTua.jenisKelamin ? "Pria" : "Wanita"));
        System.out.println("Usia            : " + dosenTua.usia);
    }

    public static void infoDosenPalingMuda(Dosen10[] arrayOfDosen) {
        Dosen10 dosenMuda = arrayOfDosen[0];

        for (Dosen10 dosen : arrayOfDosen) {
            if (dosen.usia < dosenMuda.usia) {
                dosenMuda = dosen;
            }
        }

        System.out.println("Dosen Paling Muda:");
        System.out.println("Kode            : " + dosenMuda.kode);
        System.out.println("Nama            : " + dosenMuda.nama);
        System.out.println("Jenis Kelamin   : " + (dosenMuda.jenisKelamin ? "Pria" : "Wanita"));
        System.out.println("Usia            : " + dosenMuda.usia);
    }
}
