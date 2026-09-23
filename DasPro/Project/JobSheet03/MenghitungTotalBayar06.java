import java.util.Scanner;

public class MenghitungTotalBayar06 {
    public static void main(String[] args) {
        // Deklarasi Scanner
        Scanner scanner = new Scanner(System.in);

        // Deklarasi variabel
        int harga;
        double potongan;
        double jml_bayar;
        double diskon = 0.15;

        // Input harga
        System.out.print("Masukkan harga: ");
        harga = scanner.nextInt();

        // Hitung potongan
        potongan = diskon * harga;

        // Hitung jumlah bayar
        jml_bayar = harga - potongan;

        // Tampilkan isi variabel jml_bayar
        System.out.println("Jumlah yang harus anda bayar adalah Rp. " + jml_bayar);
    }
}