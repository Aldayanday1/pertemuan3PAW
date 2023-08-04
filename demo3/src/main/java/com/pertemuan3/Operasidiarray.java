package com.pertemuan3;

public class Operasidiarray {
    public static void main(String[] args) {
        int[] angka = {1, 2, 3, 4, 5};
        int total = 0;
        for (int nilai : angka) {
            total += nilai;
        }
        double rataRata = (double) total / angka.length;
        System.out.println("Total: " + total);
        System.out.println("Rata-rata: " + rataRata);
    }
}
