import java.util.Scanner;

public class KasusKaryawan006 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Deklarasi variabel & Data lain (Per bulan)
        double gajiPokok, bonus, totGajiBulanan, totGajiTahunan;
        double tunjTransp = 600000;
        double tunjMkn = 400000;

        // 1. Input gajiPokok
        System.out.print("Masukkan Gaji Pokok: Rp ");
        gajiPokok = scanner.nextDouble();

        // 2. Hitung bonus
        bonus = 0.05 * gajiPokok;

        // 3. Hitung total gaji per bulan (Gaji Pokok + Tunjangan + Bonus - Pajak 10%)
        totGajiBulanan = gajiPokok + tunjTransp + tunjMkn + bonus - (0.10 * gajiPokok);

        // Hitung total gaji per tahun (12 bulan)
        totGajiTahunan = totGajiBulanan * 12;

        // 4. Output bonus dan total gaji
        System.out.println("----------------------------------------");
        System.out.println("Bonus Kinerja (per bulan)  : Rp " + bonus);
        System.out.println("Total Gaji Diterima / Bulan: Rp " + totGajiBulanan);
        System.out.println("Total Gaji Diterima / Tahun: Rp " + totGajiTahunan);
    }
}