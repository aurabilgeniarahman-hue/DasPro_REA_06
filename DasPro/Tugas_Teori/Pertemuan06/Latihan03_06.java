import java.util.Scanner;

public class Latihan03_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int harga, minUkuran, maxUkuran;

        System.out.print("Silahkan pilih merek (Converse/Sketcher/Nike) : ");
        String merek = sc.nextLine();

        if (merek.equalsIgnoreCase("Converse")) {
            System.out.print("Silahkan pilih kategori (Slip On/High Top) : ");
            String kategori = sc.nextLine();

            if (kategori.equalsIgnoreCase("Slip On")) {
                harga = 800000;
                minUkuran = 36;
                maxUkuran = 40;
            } else {                       // High Top
                harga = 1200000;
                minUkuran = 40;
                maxUkuran = 44;
            }
        } else if (merek.equalsIgnoreCase("Sketcher")) {
            System.out.print("Silahkan pilih kategori (Woman/Man) : ");
            String kategori = sc.nextLine();

            if (kategori.equalsIgnoreCase("Woman")) {
                harga = 1000000;
                minUkuran = 36;
                maxUkuran = 41;
            } else {                       // Man
                harga = 1800000;
                minUkuran = 41;
                maxUkuran = 44;
            }
        } else {                           // Nike
            System.out.print("Silahkan pilih kategori (Kids/Adult) : ");
            String kategori = sc.nextLine();

            if (kategori.equalsIgnoreCase("Kids")) {
                harga = 750000;
                minUkuran = 36;
                maxUkuran = 40;
            } else {                       // Adult
                harga = 1500000;
                minUkuran = 40;
                maxUkuran = 44;
            }
        }

        System.out.print("Silahkan masukkan ukuran (" + minUkuran + "-" + maxUkuran + ") : ");
        int ukuran = sc.nextInt();

        if (ukuran >= minUkuran) {
            if (ukuran <= maxUkuran) {
                System.out.println("Harga sepatu " + merek + " ukuran " + ukuran + " adalah Rp" + harga);
            } else {
                System.out.println("Ukuran tidak tersedia");
                sc.close();
            }
        }
    }
}