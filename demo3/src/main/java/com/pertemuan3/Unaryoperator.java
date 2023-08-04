package com.pertemuan3;

public class Unaryoperator {
    public static void main(String[] args) {
        int angka = 10;
        int hasil1 = +angka; // Unary plus, tidak mengubah nilai angka
        int hasil2 = -angka; // Unary minus, mengubah nilai angka menjadi negatif
        boolean benar = true;
        boolean salah = !benar; // Unary NOT, mengubah nilai boolean menjadi sebaliknya

        System.out.println("Hasil 1: " + hasil1);
        System.out.println("Hasil 2: " + hasil2);
        System.out.println("Benar: " + benar);
        System.out.println("Salah: " + salah);
    }
}
