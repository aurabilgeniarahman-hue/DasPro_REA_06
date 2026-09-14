import java.util.Scanner;
        public class GajiKaryawan006 {    public static void main(String[] args) {
        // Deklarasi Scanner
        Scanner scanner = new Scanner(System.in);

        // Deklarasi variabel
        int gajiPokok;
        double bonus, totGaji;
        double tunjTransp = 600000;
        double tunjMkn = 400000;

        // Input gaji pokok
        System.out.print("Masukkan Gaji Pokok: ");
        gajiPokok = scanner.nextInt();

        // Hitung bonus
        bonus = 0.05 * gajiPokok;

        // Hitung total gaji
        totGaji = gajiPokok + tunjTransp + tunjMkn + bonus - (0.1 * gajiPokok);

        // Tampilkan isi variabel bonus dan totGaji
        System.out.println("Bonus Bulanan anda adalah Rp. " + bonus);
        System.out.println("Gaji yang diterima adalah Rp. " + totGaji);
    }
}

