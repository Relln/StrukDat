
public class Mahasiswa10 {

    String nama;
    String nim;
    String kelas;
    double ipk;

    public Mahasiswa10() {
    }
    
    public Mahasiswa10(String nm, String nim, double ipk, String kls) {
        nama = nm;
        this.nim = nim;
        this.ipk = ipk;
        kelas = kls;
    }

    void tampilkanInformasi() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Kelas: " + kelas);
        System.out.println("IPK: " + ipk);
    }

    void ubahKelas(String kelasBaru) {
        kelas = kelasBaru;
    }

    void updateIpk(double ipkBaru) {
        ipk = ipkBaru;
        if (0.0 <= ipk && ipk <= 4.0) {
            System.out.println("IPK valid");
        } else {
            System.out.println("IPK tidak valid");
        }
    }

    String nilaiKinerja() {
        if (ipk >= 3.5) {
            return "Sangat Baik";        
        } else if (ipk >= 3.0) {
            return "Baik";
        } else if (ipk >= 2.5) {
            return "Cukup";
        } else {
            return "Kurang";        
        }     
    }

}

