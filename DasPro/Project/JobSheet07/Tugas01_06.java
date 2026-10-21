import java.util.Scanner;

public class Tugas01_06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int hargaTiket = 50000;
        int totalTiketTerjual = 0;
        double totalHargaPenjualan = 0;
        
        System.out.print("Masukkan jumlah pelanggan yang dilayani hari ini: ");
        int jumlahPelanggan = input.nextInt();
        
        int i = 1;
        while (i <= jumlahPelanggan) {
            System.out.print("Masukkan jumlah tiket untuk pelanggan ke-" + i + ": ");
            int jumlahTiket = input.nextInt();

            if (jumlahTiket < 0) {
                System.out.println("Jumlah tiket tidak valid! Masukkan ulang angka yang benar.");
                continue;
            }
            
            double diskon = 0;
            if (jumlahTiket > 10) {
                diskon = 0.15; 
            } else if (jumlahTiket > 4) {
                diskon = 0.10;
            }
            
            double hargaTotal = jumlahTiket * hargaTiket;
            double potongan = hargaTotal * diskon;
            double totalBayar = hargaTotal - potongan;
        
            totalTiketTerjual += jumlahTiket;
            totalHargaPenjualan += totalBayar;
            
            System.out.println("Diskon yang didapat: " + (int)(diskon * 100) + "%");
            System.out.println("Total bayar: Rp " + (long)totalBayar);
            
            i++; 
        }
        
        System.out.println("==================================");
        System.out.println("         PENJUALAN TIKET          ");
        System.out.println("==================================");
        System.out.println("Total tiket terjual : " + totalTiketTerjual);
        System.out.println("Total pendapatan    : Rp " + (long)totalHargaPenjualan);
        System.out.println("==================================");
        
        input.close();
    }
}