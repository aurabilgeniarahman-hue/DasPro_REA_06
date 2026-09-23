import java.util.Scanner;

public class TugasParkir06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan lama parkir (jam) : ");
        int lamaParkir = input.nextInt();

        int totalTarif;

        if (lamaParkir <= 2) {
            totalTarif = 2000;
        } else {
            int jamBerlebih = lamaParkir - 2;
            totalTarif = 2000 + (jamBerlebih * 1000);
        }

        System.out.println("Total Biaya Parkir : Rp " + totalTarif);
    }
}