package Tugas_Teori.Pertemuan02;

import java.util.Scanner;

public class Tugas1_06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input
        System.out.print("Masukkan gaji pokok: ");
        double gajiPokok = input.nextDouble();

        System.out.print("Masukkan jumlah anak: ");
        int jumlahAnak = input.nextInt();

        // Nilai tetap
        double tunjanganPerAnak = 100000;
        double persenPensiun = 0.10;

        // Proses
        double tunjanganAnak = jumlahAnak * tunjanganPerAnak;
        double potonganPensiun = gajiPokok * persenPensiun;
        double gajiBersih = gajiPokok + tunjanganAnak - potonganPensiun;

        // Output
        System.out.println("\n===== HASIL PERHITUNGAN =====");
        System.out.println("Gaji Pokok        : Rp" + gajiPokok);
        System.out.println("Jumlah Anak       : " + jumlahAnak);
        System.out.println("Tunjangan Anak    : Rp" + tunjanganAnak);
        System.out.println("Potongan Pensiun  : Rp" + potonganPensiun);
        System.out.println("Gaji Bersih       : Rp" + gajiBersih);

        input.close();
    }
}
