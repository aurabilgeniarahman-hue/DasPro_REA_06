import java.util.Scanner;

public class MenghitungTotalBayar06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int harga;
        double potongan;
        double jml_bayar;
        double diskon = 0.15;

        System.out.print("Masukkan harga: ");
        harga = scanner.nextInt();

        potongan = diskon * harga;

        jml_bayar = harga - potongan;

        System.out.println("Jumlah yang harus anda bayar adalah Rp. " + jml_bayar);
    }
}