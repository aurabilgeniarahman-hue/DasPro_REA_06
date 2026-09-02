import java.util.Scanner;

public class ModifikasiStudiKasus1_06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Gaji Pokok: ");
        double gajiPokok = input.nextDouble();
        System.out.print("Masukkan Tunjangan per Anak: ");
        double tunjanganPerAnak = input.nextDouble();
        System.out.print("Masukkan Jumlah Anak: ");
        int jumlahAnak = input.nextInt();

        double totalTunjangan = jumlahAnak * tunjanganPerAnak;
        double potonganPensiun = 0.10 * gajiPokok;
        double gajiBersih = (gajiPokok + totalTunjangan) - potonganPensiun;

        System.out.println("Gaji Bersih per Bulan: Rp " + gajiBersih);
    }
}