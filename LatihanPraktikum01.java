package Jobsheet10;

import java.util.Scanner;

public class LatihanPraktikum01 {
    public static void main(String[] args) {
        String cari;
        boolean found = false;

        String[] data = new String[]{"rafi","radit","billy","nacha","farrel"};
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan data yang ingin dicari : ");
        cari = input.nextLine();

        for (int i = 0; i < data.length; i++) {
            if (cari.equalsIgnoreCase(data[i])) {
                found = true;
            }
        }

        if (found==true) {
            System.out.println("Data ditemukan!!");
        }else {
            System.out.println("Data tidak ditemukan");
        }
    }
}
