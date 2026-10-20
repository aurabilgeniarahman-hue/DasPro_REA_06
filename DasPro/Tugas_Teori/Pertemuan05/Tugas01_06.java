import java.util.Scanner;
public class Tugas01_06 {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        int lamaParkir;
        System.out.print("Masukkan durasi parkir (jam): ");
        lamaParkir = input.nextInt();
        
        int biayaParkir;
        if (lamaParkir <= 2) {
            biayaParkir = 2000;
        } else {
            biayaParkir = 2000 + (lamaParkir - 2) * 1000;
        }
        System.out.println("Biaya Parkir: " + biayaParkir);

        input.close();
    }
}