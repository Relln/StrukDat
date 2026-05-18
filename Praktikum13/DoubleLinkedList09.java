package Praktikum13;

public class DoubleLinkedList09 {

    Node09 head;
    Node09 tail;

    public DoubleLinkedList09() {
        head = null;
        tail = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(Mahasiswa09 data) {
        Node09 newNode = new Node09(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    public void addLast(Mahasiswa09 data) {
        Node09 newNode = new Node09(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void add(Mahasiswa09 data, int index) {
        if (index < 0) {
            System.out.println("Index tidak valid.");
            return;
        }

        if (index == 0) {
            addFirst(data);
        } else if (isEmpty()) {
            System.out.println("Linked List masih kosong, data otomatis dimasukkan di awal.");
            addFirst(data);
        } else {
            Node09 current = head;
            int currentIndex = 0;

            while (current != null && currentIndex < index) {
                current = current.next;
                currentIndex++;
            }

            if (current == null) {
                addLast(data);
            } else {
                Node09 newNode = new Node09(data);
                newNode.next = current;
                newNode.prev = current.prev;

                if (current.prev != null) {
                    current.prev.next = newNode;
                }
                current.prev = newNode;
                System.out.println("Data berhasil ditambahkan pada indeks ke-" + index);
            }
        }
    }

    public void insertAfter(String keyNim, Mahasiswa09 data) {
        Node09 current = head;
        while (current != null && !current.data.nim.equals(keyNim)) {
            current = current.next;
        }

        if (current == null) {
            System.out.println("Data dengan NIM " + keyNim + " tidak ditemukan.");
            return;
        }

        Node09 newNode = new Node09(data);
        if (current == tail) {
            newNode.prev = current;
            current.next = newNode;
            tail = newNode;
        } else {
            newNode.prev = current;
            newNode.next = current.next;
            current.next.prev = newNode;
            current.next = newNode;
        }
        System.out.println("Data berhasil disisipkan setelah NIM " + keyNim);

    }

    public void removeFirst() {
        if (isEmpty()) {
            System.out.println("Linked List kosong.");
            return;
        }
        System.out.println("Data berikut berhasil dihapus dari awal:");
        head.data.tampil();

        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
    }

    public void removeLast() {
        if (isEmpty()) {
            System.out.println("Linked List kosong.");
            return;
        }
        System.out.println("Data berikut berhasil dihapus dari akhir:");
        tail.data.tampil();

        if (head == tail) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Linked List masih kosong.");
            return;
        }
        Node09 current = head;
        while (current != null) {
            current.data.tampil();
            System.out.println("--------------------");
            current = current.next;
        }
    }

    public void printReverse() {
        if (isEmpty()) {
            System.out.println("Linked List masih kosong.");
            return;
        }
        Node09 current = tail;
        while (current != null) {
            current.data.tampil();
            current = current.prev;
        }
    }
}
