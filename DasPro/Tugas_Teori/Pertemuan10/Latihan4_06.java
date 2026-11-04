import java.util.Scanner;

public class Latihan4_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int jumlahProduk = 0;
        while (jumlahProduk < 1) {
            System.out.print("Masukkan jumlah produk (minimal 1): ");
            jumlahProduk = scanner.nextInt();
        }

        int jumlahHari = 0;
        while (jumlahHari < 1) {
            System.out.print("Masukkan jumlah hari (minimal 1): ");
            jumlahHari = scanner.nextInt();
        }

        double totalSeluruhProduk = 0;

        int i = 1;
        while (i <= jumlahProduk) {
            System.out.println("\n--- Produk ke-" + i + " ---");
            double totalProduk = 0;

            for (int j = 1; j <= jumlahHari; j++) {
                int terjual = -1;
                
                do {
                    System.out.print("Masukkan jumlah terjual hari ke-" + j + " (tidak boleh negatif): ");
                    terjual = scanner.nextInt();
                    
                    if (terjual < 0) {
                        System.out.println("Jumlah terjual tidak boleh negatif! Silakan masukkan ulang.");
                    }
                } while (terjual < 0);

                totalProduk += terjual;
            }

            double rataRataHarian = totalProduk / jumlahHari;
            totalSeluruhProduk += totalProduk;

            System.out.println("-> Total penjualan produk ke-" + i + " = " + totalProduk);
            System.out.println("-> Rata-rata harian produk ke-" + i + " = " + rataRataHarian);

            i++;
        }

        System.out.println("==========================================");
        System.out.println("Rekapitulasi Keseluruhan");
        System.out.println("Total seluruh produk = " + totalSeluruhProduk);
        System.out.println("==========================================");

        scanner.close();
    }
}

