package Praktikum06;

public class DataDosen10 {
        Dosen10 [] dataDosen = new Dosen10[10];
        int idx = 0;

        void tambah(Dosen10 dsn) {
            if (idx < dataDosen.length) {
                dataDosen[idx] = dsn;
                idx++;
            } else {
                System.out.println("Data sudah penuh!");
            }
        }

        void tampil() {
            for (int i = 0; i < idx; i++) {
                dataDosen[i].tampil();
                System.out.println("-------------------");
            }
        }

        //Sorting ASC menggunakan Bubble Sort
        void sortingASC() {
            for (int i = 0; i < idx - 1; i++) {
                for (int j = 1; j < idx - i; j++) {
                    if (dataDosen[j].usia < dataDosen[j - 1].usia) {
                        Dosen10 temp = dataDosen[j];
                        dataDosen[j] = dataDosen[j - 1];
                        dataDosen[j - 1] = temp;
                    }
                }
            }
        }

        //Sorting DSC menggunakan Insortion Sort
        void sortingDSC() {
            for (int i = 1; i < idx; i++) {
                Dosen10 temp = dataDosen[i];
                int j = i;
                while (j > 0 && dataDosen[j - 1].usia < temp.usia) {
                    dataDosen[j] = dataDosen[j - 1];
                    j--;
                }
                dataDosen[j] = temp;
            }
        }
    
}
