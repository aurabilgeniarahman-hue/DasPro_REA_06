import java.util.Scanner;

public class Latihan01_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        double totalJam = 0;
        int hari = 1;

        System.out.println("=== PROGRAM PELACAK WAKTU BELAJAR SISWA ===");

        do {
            System.out.print("Masukkan jam belajar hari ke-" + hari + ": ");
            double jam = scanner.nextDouble();

            if (jam > 10 || jam < 0) {
                System.out.println("-> Input tidak valid (maksimal 10 jam/hari atau negatif). Silakan masukkan ulang!\n");
                continue;
            }
            totalJam += jam;
            hari++;

        } while (hari <= 7);

        System.out.println("\n-------------------------------------------");
        System.out.println("Total waktu belajar selama seminggu: " + totalJam + " jam");
        System.out.println("-------------------------------------------");

        scanner.close();
    }
}