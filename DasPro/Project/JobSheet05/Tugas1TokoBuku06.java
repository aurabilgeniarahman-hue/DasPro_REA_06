import java.util.Scanner;
public class tugas1TokoBuku06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan hari (Senin/Selasa/Rabu/Kamis/Jumat/Sabtu/Minggu): ");
        String hari = input.nextLine().trim();
        System.out.print("Janis buku yang dibeli (Kamus/Novel/Lainnya): ");
        String jenisBuku = input.nextLine().trim();
        System.out.print("Masukkkan harga satuan buku: Rp.");
        int hargaBuku = input.nextInt();
        System.out.print("Jumlah buku yang dibeli: ");
        int jumlahBuku = input.nextInt();
        double diskon = 0.0;

        if (hari.equalsIgnoreCase("Rabu")) {
            if (jenisBuku.equalsIgnoreCase("Kamus")) {
                if (jumlahBuku > 2) {
                    diskon = 0.12;
                } else {
                    diskon = 0.10;
                }
            } else if (jenisBuku.equalsIgnoreCase("Novel")) {
                if (jumlahBuku > 3) {
                    diskon = 0.09;
                } else {
                    diskon = 0.08;
                }
            } else if (jenisBuku.equalsIgnoreCase("Lainnya")) {
                if (jumlahBuku > 3) {
                    diskon = 0.07; 
                } else {
                    diskon = 0.05;
                }
            }
        } else {
            diskon = 0.0;
        }

        double totalBelanja = hargaBuku * jumlahBuku;
        double hargaDiskon = totalBelanja * diskon;
        double totalBayar = totalBelanja - hargaDiskon;
        System.out.println("=== TOKO BUKU IDAMANMU ===");
        System.out.println("Hari pembelian: " + hari);
        System.out.println("Jenis buku yang dibeli: " + jenisBuku);
        System.out.println("Total belanjaan Anda: Rp." + totalBelanja);
        System.out.println("Besar diskon yang diberikan: Rp." + hargaDiskon);
        System.out.println("Total harga yang harus dibayar setelah diskon: Rp. " + totalBayar);
        System.out.println("=== TERIMA KASIH ===");

        input.close();
    }
}