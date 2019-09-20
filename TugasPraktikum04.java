package Jobsheet10;

import java.util.Scanner;

public class TugasPraktikum04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan sebuah kata/kalimat : ");
        String cari = input.nextLine();
        int total=0;


        int a = 0;
        for (int j = 0; j < cari.length(); j++) {
            if (cari.charAt(j) == 'a'){
                a++;
            }
        }

        int i = 0;
        for (int j = 0; j < cari.length(); j++) {
            if (cari.charAt(j) == 'i'){
                i++;
            }
        }

        int u = 0;
        for (int j = 0; j < cari.length(); j++) {
            if (cari.charAt(j) == 'u'){
                u++;
            }
        }

        int e = 0;
        for (int j = 0; j < cari.length(); j++) {
            if (cari.charAt(j) == 'e'){
                e++;
            }
        }

        int o = 0;
        for (int j = 0; j < cari.length(); j++) {
            if (cari.charAt(j) == 'o'){
                o++;
            }
        }

        total = a + i + u + e + o ;
        System.out.println("Jumlah huruf a : "+a);
        System.out.println("Jumlah huruf i : "+i);
        System.out.println("Jumlah huruf u : "+u);
        System.out.println("Jumlah huruf e : "+e);
        System.out.println("Jumlah huruf o : "+o);
        System.out.println("Jumlah huruf vokal : "+ total);

    }
}
