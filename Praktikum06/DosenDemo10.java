package Praktikum06;

public class DosenDemo10 {
    public static void main(String[] args) {
        DataDosen10 list = new DataDosen10();
        Dosen10 dsn1 = new Dosen10("D001", "Dr. Andi", true, 32);
        Dosen10 dsn2 = new Dosen10("D002", "Dr. Budi", true, 50);
        Dosen10 dsn3 = new Dosen10("D003", "Dr. Citra", false, 30);
        Dosen10 dsn4 = new Dosen10("D004", "Dr. Dedi", true, 55);
        Dosen10 dsn5 = new Dosen10("D005", "Dr. Edi", true, 45);
        Dosen10 dsn6 = new Dosen10("D006", "Dr. Farah", false, 33);
        Dosen10 dsn7 = new Dosen10("D007", "Dr. Gita", false, 36);
        Dosen10 dsn8 = new Dosen10("D008", "Dr. Hamid", true, 42);
        Dosen10 dsn9 = new Dosen10("D009", "Dr. Ira", false, 40);
        Dosen10 dsn10 = new Dosen10("D010", "Dr. Joko", true, 58);

        list.tambah(dsn1);
        list.tambah(dsn2); 
        list.tambah(dsn3);
        list.tambah(dsn4);
        list.tambah(dsn5);
        list.tambah(dsn6);
        list.tambah(dsn7);
        list.tambah(dsn8);
        list.tambah(dsn9);
        list.tambah(dsn10);

        System.out.println("Data Dosen sebelum sorting:");
        list.tampil();

        System.out.println("Data Dosen setelah sorting ASC:"); 
        list.sortingASC();
        list.tampil();

        System.out.println("Data Dosen setelah sorting DSC:");
        list.sortingDSC();
        list.tampil();


    }
}
