import java.util.Scanner;

public class BiayaCetak006 {    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Deklarasi variabel & konstanta
        int jumlahLembar;
        int biayaPerLembar = 500;
        int biayaJilid = 5000;
        int totalBiaya;

        // Input jumlah lembar
        System.out.print("Masukkan jumlah lembar dokumen (x): ");
        jumlahLembar = scanner.nextInt();

        // Proses perhitungan
        totalBiaya = (jumlahLembar * biayaPerLembar) + biayaJilid;

        // Output
        System.out.println("----------------------------------------------");
        System.out.println("Biaya Cetak (" + jumlahLembar + " lembar) : Rp " + (jumlahLembar * biayaPerLembar));
        System.out.println("Biaya Penjilidan       : Rp " + biayaJilid);
        System.out.println("Total yang Harus Dibayar: Rp " + totalBiaya);
    }
}
