import java.text.NumberFormat;
import java.util.Scanner;
import java.util.Locale;

public class Tugas02Array_06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] menu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang Goreng", "Teh Tarik", "Cappucino", "Chocolate Ice"};
        int[] harga = {15000, 13000, 10000, 12000, 8000, 18000, 20000};

        int jumlah;
        do {
            System.out.print("Masukkan jumlah item yang ingin dipesan: ");
            while (!input.hasNextInt()) {
                System.out.println("Jumlah harus berupa angka.");
                input.nextLine();
                System.out.print("Masukkan jumlah item yang ingin dipesan: ");
            }
            jumlah = input.nextInt();
            input.nextLine();
            if (jumlah <= 0) {
                System.out.println("Jumlah item harus lebih dari 0.");
            }
        } while (jumlah <= 0);

        String[] pesanan = new String[jumlah];
        int[] hargaPesanan = new int[jumlah];
        int totalBiaya = 0;

        for (int item = 0; item < pesanan.length; item++) {
            boolean ditemukan;
            do {
                System.out.println("\nDaftar menu:");
                for (int i = 0; i < menu.length; i++) {
                    System.out.println("[" + (i + 1) + "] " + menu[i] + " (Rp. " + harga[i] + ")");
                }

                System.out.print("Masukkan nomor menu untuk item ke-" + (item + 1) + ": ");
                String pilihan = input.nextLine().trim();
                ditemukan = false;

                for (int i = 0; i < menu.length; i++) {
                    if (String.valueOf(i + 1).equals(pilihan)) {
                        pesanan[item] = menu[i];
                        hargaPesanan[item] = harga[i];
                        totalBiaya += harga[i];
                        ditemukan = true;
                        break;
                    }
                }

                if (!ditemukan) {
                    System.out.println("Menu tidak tersedia. Silakan pilih menu dari daftar.");
                }
            } while (!ditemukan);
        }

        NumberFormat formatRupiah = NumberFormat.getNumberInstance(Locale.forLanguageTag("id-ID"));

        System.out.println("\n==================== RINCIAN PESANAN ====================");
        System.out.printf("%-5s %-25s %15s%n", "No.", "Nama Menu", "Harga");
        System.out.println("----------------------------------------------------------");
        for (int i = 0; i < pesanan.length; i++) {
            System.out.printf("%-5d %-25s Rp %12s%n",
                    i + 1, pesanan[i], formatRupiah.format(hargaPesanan[i]));
        }
        System.out.println("----------------------------------------------------------");
        System.out.printf("%-31s Rp %12s%n", "TOTAL BIAYA", formatRupiah.format(totalBiaya));
        System.out.println("==========================================================");

        input.close();
    }
}
