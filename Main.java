package com.Tugas3;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Baju baju = new Baju();
        baju.erigo();

        System.out.print("Baju yang akan anda beli bertipe : ");
        baju.jenis = input.nextLine();
        System.out.print("Jumlah baju yang akan anda beli adalah : ");
        baju.jumlah = input.nextInt();
        baju.totalharga();
    }
}

class Baju {
    String jenis;
    int harga;
    int jumlah;

    final int bajuA = 100000;
    final int bajuB = 125000;
    final int bajuC = 175000;

    void erigo() {
        System.out.println("Baju yang tersedia : ");
        System.out.println("Baju A dengan harga " + bajuA);
        System.out.println("Baju B dengan harga " + bajuA);
        System.out.println("Baju C dengan harga " + bajuC);
    }

    void hargaA() {
        if (jumlah > 100) {
            this.harga = 95000;
        } else {
            this.harga = bajuA;
        }
    }

    void hargaB() {
        if (jumlah > 100) {
            this.harga = 120000;
        } else {
            this.harga = bajuB;
        }
    }

    void hargaC() {
        if (jumlah > 100) {
            this.harga = 160000;
        } else {
            this.harga = bajuC;
        }
    }
    void totalharga() {
        if (jenis.equalsIgnoreCase("A"))
            hargaA();
        else if (jenis.equalsIgnoreCase("B"))
            hargaB();
        else if (jenis.equalsIgnoreCase("C"))
            hargaC();

        System.out.println("Jenis yang anda beli : " + jenis);
        System.out.println("Harga per buah       : " + harga);
        System.out.println("Total harga          : " + harga * jumlah);
    }
}


//Nama  : Prayoga Dwi Purwono
//kelas : TI-E
//NIM   : 215150707111021

