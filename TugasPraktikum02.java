package Jobsheet10;

public class TugasPraktikum02 {
    public static void main(String[] args) {

        int[] data = new int[]{92,94,88,82,98,84,96};
        int jumlah=0;
        float mean;

        System.out.println("Data pada array : ");
        for (int i = 0; i < data.length; i++) {

            System.out.print(data[i]+"\t");
        }

        for (int i = 0; i < data.length; i++) {
            jumlah += data[i];
        }
        mean = jumlah / data.length;
        System.out.print("\nRata-rata array adalah : "+ mean);

        System.out.print("\nNilai diatas rata-rata : ");
        for (int i = 0; i < data.length; i++) {
            if (data[i] > mean){
                System.out.print(data[i]+ "\t");
            }
        }

    }
}
