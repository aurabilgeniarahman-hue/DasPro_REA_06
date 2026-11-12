import java.util.Scanner;

public class ModifikasiArrayNilai_06 {
    public static void main(String[] args) {
        int[] nilaiAkhir = new int[10];
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < nilaiAkhir.length; i++) {
            System.out.print("Masukkan nilai akhir mahasiswa ke-" + (i + 1) + ": ");
            nilaiAkhir[i] = input.nextInt();
        }

        for (int nilai : nilaiAkhir) {
            if (nilai > 70) {
                System.out.println("Nilai: " + nilai);
            }
        }

        int jmlLulus = 0;
        int jmlTidakLulus = 0;
        for (int nilai : nilaiAkhir) {
            if (nilai >= 70) {
                jmlLulus++;
            } else {
                jmlTidakLulus++;
            }
        }
        System.out.println("Jumlah mahasiswa yang lulus: " + jmlLulus);
        System.out.println("Jumlah mahasiswa yang tidak lulus: " + jmlTidakLulus);
        input.close();
    }
}
