package Praktikum12;

import java.util.Scanner;

public class SLLMain10 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    SingleLinkedList10 sll = new SingleLinkedList10();
    
    Mahasiswa10 mhs = new Mahasiswa10("1234", "Agris", "TI-1A", 3.5);
    Mahasiswa10 mhs2 = new Mahasiswa10("9101", "Cintia", "TI-1A", 3.7);
    Mahasiswa10 mhs3 = new Mahasiswa10("5678", "Bimon", "TI-1A", 3.6);

    sll.addFirst(mhs);
    sll.addLast(mhs2);
    sll.addLast(mhs3);
    sll.print();

    System.out.println("data index 1 : ");
    sll.getData(1);
    
    System.out.println("data mahasiswa an Bimon berada pada index : "+sll.indexOf("bimon"));
    System.out.println();

    sll.removeFirst();
    sll.removeLast();
    sll.print();
    sll.removeAt(0);
    sll.print();

    }
}
