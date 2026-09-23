    import java.util.Scanner;

    public class CicilanLaptop006 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Deklarasi variabel
        double hargaLaptop, uangMuka, sisaHarga;
        double pokokCicilan, bunga, totalCicilanPerBulan;
        int jumlahBulan;

        // Input data
        System.out.print("Masukkan harga laptop (x): Rp ");
        hargaLaptop = sc.nextDouble();

        System.out.print("Masukkan uang muka (y): Rp ");
        uangMuka = sc.nextDouble();

        System.out.print("Masukkan lama cicilan dalam bulan (z): ");
        jumlahBulan = sc.nextInt();

        // Proses perhitungan
        sisaHarga = hargaLaptop - uangMuka;
        pokokCicilan = sisaHarga / jumlahBulan;
        bunga = 0.02 * sisaHarga; // Bunga tetap 2% dari sisa harga
        totalCicilanPerBulan = pokokCicilan + bunga;

        // Output
        System.out.println("----------------------------------------------");
        System.out.println("Sisa harga setelah DP : Rp " + sisaHarga);
        System.out.println("Bunga per bulan (2%)   : Rp " + bunga);
        System.out.println("Cicilan per bulan      : Rp " + totalCicilanPerBulan);
    }
}
