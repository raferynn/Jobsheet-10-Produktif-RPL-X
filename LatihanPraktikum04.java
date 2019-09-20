package Jobsheet10;

import java.util.Scanner;

public class LatihanPraktikum04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan sebuah kata/kalimat : ");
        String cari = input.nextLine();

        int a = 0;
        for (int i = 0; i < cari.length(); i++) {
            if (cari.charAt(i) == 'a'){
                a++;
            }
        }
        System.out.println("Jumlah huruf a pada kalimat diatas adalah "+a);

    }
}
