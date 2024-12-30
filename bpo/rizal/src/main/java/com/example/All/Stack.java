package com.example.All;

public class Stack {
    private int maxSize; // Ukuran maksimum tumpukan
    private int[] stackArray; // Array untuk menyimpan elemen-elemen tumpukan
    private int top; // Indeks dari elemen teratas tumpukan

    // Konstruktor untuk inisialisasi tumpukan
    public Stack() {
        maxSize = 5; // Ukuran maksimum tumpukan default
        stackArray = new int[maxSize];
        top = -1; // Tumpukan awalnya kosong
    }

    // Method push untuk menambahkan elemen ke dalam tumpukan
    public void push(int element) {
        if (isFull()) {
            System.out.println("Tumpukan penuh, tidak bisa menambahkan elemen " + element);
        } else {
            stackArray[++top] = element; // Menambahkan elemen dan menaikkan nilai top
            System.out.println("Elemen " + element + " ditambahkan ke dalam tumpukan.");
        }
    }

    // Method pop untuk mengeluarkan elemen teratas dari tumpukan
    public int pop() {
        if (isEmpty()) {
            System.out.println("Tumpukan kosong, tidak bisa mengeluarkan elemen.");
            return -1; // Nilai kembalian untuk tumpukan kosong
        } else {
            int removedElement = stackArray[top--]; // Menghapus dan mengurangi nilai top
            System.out.println("Elemen " + removedElement + " dihapus dari tumpukan.");
            return removedElement; // Mengembalikan elemen yang dihapus
        }
    }
       // Method untuk memeriksa apakah tumpukan kosong
       public boolean isEmpty() {
        return (top == -1);
    }

    // Method untuk memeriksa apakah tumpukan penuh
    public boolean isFull() {
        return (top == maxSize - 1);
    }

    public static void main(String[] args) {
        Stack stack = new Stack(); // Membuat instansiasi dari kelas Stack

        stack.push(1); // Menambahkan elemen ke dalam tumpukan
        stack.push(2);
        stack.push(3);

        System.out.println("Elemen yang dikeluarkan: " + stack.pop()); // Mengeluarkan elemen dari tumpukan
        System.out.println("Elemen yang dikeluarkan: " + stack.pop()); // Mengeluarkan elemen lainnya
    }
}