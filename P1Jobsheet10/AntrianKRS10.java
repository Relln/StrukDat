package P1Jobsheet10;

public class AntrianKRS10 {
    DataMahasiswa10[] queue;
    int front;
    int rear;
    int size;
    int maxDPA = 30;
    int maxQUEUE = 10;
    int total = 0;

    public AntrianKRS10() {
        queue = new DataMahasiswa10[maxQUEUE];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
    }

    public boolean IsEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean IsFull() {
        if (size == maxQUEUE) {
            return true;
        } else {
            return false;
        }
    }

    public void clear() {
        front = 0;
        rear = -1;
        size = 0;
        System.out.println("Antrian berhasil dikosongkan.");
    }

    public void enqueueKRS(DataMahasiswa10 Dmhs) {
        if (!IsFull()) {
            rear = (rear + 1) % maxQUEUE;
            queue[rear] = Dmhs;
            size++;
            System.out.println("Mahasiswa " + Dmhs.nama + " berhasil masuk antrian.");
        } else {
            System.out.println("Antrian sudah penuh. Tidak bisa menambahkan mahasiswa.");
        }
    }

    public void dequeueKRS() {
        if (size < 2) {
            System.out.println("Proses KRS minimal membutuhkan 2 mahasiswa dalam antrian");
            return;
        }

        System.out.println("Memproses KRS untuk mahasiswa:");
        for (int i = 0; i < 2; i++) {
            if (total < maxDPA) {
                System.out.println("Selesai diproses: " + queue[front].nama);
                front = (front + 1) % maxQUEUE;
                size--;
                total++;
            } else {
                System.out.println("Batas DPA sudah penuh. Mahasiswa berikutnya tidak bisa diproses.");
                break;
            }
        }
    }

    public void tampilkanData() {
       if (IsEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        } else {
            System.out.println("Isi Antrian KRS:");
            for (int i = 0; i < size; i++) {
                System.out.println((i + 1) + ". " + queue[(front + i) % maxQUEUE].nama);
            }
        }
    }

    public void lihatPeek() {
        if (size > 0) {
            System.out.println("Informasi Posisi");
            System.out.println("1 Terdepan: " + queue[front].nama);
            if (size > 1) {
                System.out.println("2 Terdepan: " + queue[(front + 1) % maxQUEUE].nama);
            }
            System.out.println("Paling Akhir: " + queue[rear].nama);
        } else {
            System.out.println("Antrian kosong.");
        }
    }

    public void printStats() {
        System.out.println("--- Status Antrian KRS ---");
        System.out.println("Jumlah Mahasiswa dalam Antrian: " + size);
        System.out.println("Total mahasiswa sudah proses KRS: " + total);
        System.out.println("Sisa Kuota DPA: " + (maxDPA - size));
    }
}
