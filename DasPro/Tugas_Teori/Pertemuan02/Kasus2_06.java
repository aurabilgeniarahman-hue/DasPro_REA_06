package Tugas_Teori.Pertemuan02;

import java.util.Scanner;

public class Kasus2_06 {
    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);

        int jumlah_tabungan_awal, lama_menabung;
        double prosentase_bunga =0.02, bunga, jumlah_tabungan_akhir;

        System.out.print("Masukkan Jumlah tabungan anda : ");
        jumlah_tabungan_awal = input.nextInt();
        System.out.print("Masukkan lama menabung anda : ");
        lama_menabung= input.nextInt();

        bunga = lama_menabung*prosentase_bunga*jumlah_tabungan_awal;
        jumlah_tabungan_akhir=bunga+jumlah_tabungan_awal;

        System.out.println("Bunga adalah "+ bunga);
        System.out.println("Jumalah tabungan akhir anda adalah " + jumlah_tabungan_akhir);
    }

    
}