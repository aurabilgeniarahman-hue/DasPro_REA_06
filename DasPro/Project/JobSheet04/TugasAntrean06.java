import java.util.Scanner;

public class TugasAntrean06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== MESIN ANTREAN AKADEMIK ===");
        System.out.println("1. Layanan KRS");
        System.out.println("2. Cetak Transkrip");
        System.out.println("3. Legalisir Ijazah");
        System.out.println("4. Konsultasi Dosen");
        System.out.print("Pilih kode layanan (1-4): ");
        int kode = input.nextInt();

        switch (kode) {
            case 1:
                System.out.println("Anda memilih: Layanan KRS");
                System.out.println("Silakan menuju ke Loket 1");
                break;
            case 2:
                System.out.println("Anda memilih: Cetak Transkrip");
                System.out.println("Silakan menuju ke Loket 2");
                break;
            case 3:
                System.out.println("Anda memilih: Legalisir Ijazah");
                System.out.println("Silakan menuju ke Loket 3");
                break;
            case 4:
                System.out.println("Anda memilih: Konsultasi Dosen");
                System.out.println("Silakan menuju ke Ruang Dosen");
                break;
            default:
                System.out.println("Kode layanan tidak tersedia");
                break;
        }


    }
}