package Praktikum09;

public class StackSurat10 {

    Surat10[] stack;
    int top;
    int size;

    public StackSurat10(int size) {
        this.size = size;
        stack = new Surat10[size];
        top = -1;
    }

    public boolean isFull() {
        if (top == size - 1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isEmpty() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    public void push(Surat10 surat) {
        if (!isFull()) {
            top++;
            stack[top] = surat;
            System.out.println("Surat izin diterima");
        } else {
            System.out.println("Stack penuh! Tidak bisa menambahkan surat lagi.");
        }
    }

    public void pop() {
        if (!isEmpty()) {
            Surat10 surat = stack[top];
            top--;
            System.out.println("Surat izin diproses: " + surat);
        } else {
            System.out.println("Stack kosong! Tidak ada surat untuk diproses.");
        }
    }

    public void peek() {
        if (!isEmpty()) {
            System.out.println("Surat izin terakhir: " + stack[top]);
        } else {
            System.out.println("Stack kosong!");
        }
    }

    public void Search(String nama) {
        boolean ditemukan = false;
        for (int i = top; i >= 0; i--) {
            if (stack[i].namaMahasiswa.equalsIgnoreCase(nama)) {
                System.out.println("Data ditemukan di posisi ke-" + (top - i + 1) + " dari atas.");
                System.out.println("Detail: " + stack[i]);
                ditemukan = true;
                break;
            }
        }
        if (!ditemukan) {
            System.out.println("Surat atas nama '" + nama + "' tidak ditemukan.");
        }
    }

}
