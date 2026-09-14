    import java.util.Scanner;
    
    public class StudiKasus006 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Deklarasi variabel & data lain
        double harga, potongan, jml_bayar;
        double diskon = 0.15;

        // 1. Input harga
        System.out.print("Masukkan harga pakaian: Rp ");
        harga = scanner.nextDouble();

        // 2. Proses perhitungan
        potongan = diskon * harga;
        jml_bayar = harga - potongan;

        // 3. Output
        System.out.println("----------------------------");
        System.out.println("Besar Potongan (Diskon) : Rp " + potongan);
        System.out.println("Jumlah yang Harus Dibayar : Rp " + jml_bayar);
    }
}
