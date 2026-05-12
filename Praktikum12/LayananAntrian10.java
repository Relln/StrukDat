package Praktikum12;

public class LayananAntrian10 {
    Mahasiswa10 mhs;
    int size = 0;
    Node10 head, tail;

    public boolean isEmpty() {
        return head == null;
    }

    public void clear() {
        head = tail = null;
        size = 0;
        System.out.println("Antrian telah dikosongkan.");
    }

    public void enqueue(Mahasiswa10 mhs) {
        Node10 newNode = new Node10(mhs, null);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
        } else {
            System.out.print("Memanggil antrian: ");
            head.data.tampilInformasi();
            head = head.next;
            size--;
            if (head == null) tail = null;
        }
    }

    public void peek() {
        if (!isEmpty()) {
            System.out.print("Paling Depan: "); head.data.tampilInformasi();
            System.out.print("Paling Belakang: "); tail.data.tampilInformasi();
        } else {
            System.out.println("Antrian kosong.");
        }
    }

    public void displaySize() {
        System.out.println("Jumlah mahasiswa dalam antrian: " + size);
    }
}
