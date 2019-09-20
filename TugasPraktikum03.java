package Jobsheet10;

public class TugasPraktikum03 {
    public static void main(String[] args) {
        int[] data = new int[]{83,76,45,90,85,80,78,74};
        System.out.println("Data pada array : ");
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i]+"\t");
        }

        System.out.println("\nNilai kelipatan tiga : ");
        for (int i = 0; i < data.length; i++) {
            if (data[i]%3 == 0){
                System.out.print(data[i]+"\t");
            }
        }

    }
}
