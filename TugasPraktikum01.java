package Jobsheet10;

import java.util.Scanner;

public class TugasPraktikum01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int cari;
        int counter = 0;
        boolean found = false;

        int[] data = new int[]{69, 48, 69, 23, 34, 69, 53};

        System.out.println("Data pada array : ");
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + "\t");
        }

        System.out.print("\nMasukkan angka yang ingin dicari : ");
        cari = input.nextInt();

        for (int i = 0; i < data.length; i++) {
            if (cari == data[i]) {
                counter++;
                found = true;
            }

        }
        if (found) {
            System.out.println("Data ditemukan sebanyak " + counter + " kali");
        } else {
            System.out.println("Data tidak ditemukann");
        }

    }
}