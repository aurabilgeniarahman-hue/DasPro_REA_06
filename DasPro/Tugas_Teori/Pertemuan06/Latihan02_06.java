import java.util.Scanner;

public class Latihan02_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== SISTEM PERHITUNGAN DISKON TOKO BUKU ===");

        // Input data
        System.out.print("Masukkan hari pembelian: ");
        String hari = sc.nextLine().trim();

        System.out.print("Masukkan jenis buku (kamus / novel / lainnya): ");
        String jenisBuku = sc.nextLine().trim();

        System.out.print("Masukkan jumlah buku yang dibeli: ");
        int jumlahBuku = sc.nextInt();

        System.out.print("Masukkan harga satuan buku (Rp): ");
        double hargaSatuan = sc.nextDouble();

        double diskon = 0;

        // Pengecekan utama: Diskon hanya berlaku pada hari Rabu
        if (hari.equalsIgnoreCase("Rabu")) {

            // Pemilihan bersarang (Nested IF) berdasarkan jenis & jumlah buku
            if (jenisBuku.equalsIgnoreCase("kamus")) {
                if (jumlahBuku > 2) {
                    diskon = 0.12; // 10% + 2%
                } else {
                    diskon = 0.10; // 10%
                }
            } else if (jenisBuku.equalsIgnoreCase("novel")) {
                if (jumlahBuku > 3) {
                    diskon = 0.09; // 7% + 2%
                } else {
                    diskon = 0.08; // 7% + 1%
                }
            } else {
                if (jumlahBuku > 3) {
                    diskon = 0.05; // 5%
                } else {
                    diskon = 0.00; // 0%
                }
            }

        } else {
            // Jika bukan hari Rabu, tidak ada diskon
            diskon = 0.00;
        }

        // Perhitungan total
        double totalHarga = jumlahBuku * hargaSatuan;
        double jumlahDiskon = totalHarga * diskon;
        double totalBayar = totalHarga - jumlahDiskon;

        // Tampilan Output
        System.out.println("-------------------------------------------");
        System.out.println("Hari Pembelian  : " + hari);
        System.out.println("Jenis Buku      : " + jenisBuku);
        System.out.println("Jumlah Buku     : " + jumlahBuku);
        System.out.println("Persentase Diskon: " + (diskon * 100) + "%");
        System.out.println("Total Diskon    : Rp " + jumlahDiskon);
        System.out.println("Total Bayar     : Rp " + totalBayar);
        System.out.println("-------------------------------------------");

        sc.close();
    }
}