import java.util.Scanner;

public class Latihan02_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== PROGRAM PENENTU BONUS PEGAWAI ===");
        System.out.println("Catatan: Masukkan jam kerja negatif (< 0) untuk menghentikan program.\n");
        double jamKerja, gajiHarian, bonus, totalGaji;
        do {
            System.out.print("Masukkan jumlah jam kerja: ");
            jamKerja = scanner.nextDouble();

            if (jamKerja < 0) {
                System.out.println("-> Jam kerja negatif terdeteksi. Program dihentikan.");
                break;
            }
            System.out.print("Masukkan gaji harian: ");
            gajiHarian = scanner.nextDouble();

            if (jamKerja > 8) {
                bonus = 0.20 * gajiHarian; 
                System.out.println("Status: MENDAPATKAN BONUS!");
                System.out.println("Besaran Bonus (20%): Rp " + bonus);
            } else {
                bonus = 0;
                System.out.println("Status: Tidak mendapatkan bonus.");
            }
            totalGaji = gajiHarian + bonus;
            System.out.println("Total penerimaan hari ini: Rp " + totalGaji);
            System.out.println("--------------------------------------------------");
        } while (jamKerja >= 0);

        System.out.println("\n=== PROGRAM SELESAI ===");
        scanner.close();
    }
}