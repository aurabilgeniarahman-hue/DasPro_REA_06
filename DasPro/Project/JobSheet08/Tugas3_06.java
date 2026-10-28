import java.util.Scanner;

public class Tugas3_06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah toko: ");
        int jumlahToko = input.nextInt();

        int totalBarangSeluruhToko = 0;
        int maxBarang = -1;
        int tokoTerbanyak = 0;

        for (int i = 1; i <= jumlahToko; i++) {
            System.out.print("Masukkan jumlah pelanggan untuk Toko " + i + ": ");
            int jumlahPelanggan = input.nextInt();

            int totalBarangToko = 0;

            for (int j = 1; j <= jumlahPelanggan; j++) {
                System.out.print("Masukkan jumlah barang yang dibeli pelanggan " + j + ": ");
                int jumlahBarang = input.nextInt();
                totalBarangToko += jumlahBarang;
            }

            totalBarangSeluruhToko += totalBarangToko;
            System.out.println("Toko " + i + " - pelanggan: " + jumlahPelanggan + ", total barang: " + totalBarangToko);

            if (totalBarangToko > maxBarang) {
                maxBarang = totalBarangToko;
                tokoTerbanyak = i;
            }
        }
        System.out.println("Total barang seluruh toko: " + totalBarangSeluruhToko);
        System.out.println("Toko dengan barang terbanyak: " + tokoTerbanyak);

        input.close();
    }
} 



