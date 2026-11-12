import java.util.Scanner;

public class ArrayNilai_06 {
    public static void main(String[] args) {
        int[] nilaiAkhir = new int[10];
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < nilaiAkhir.length; i++) {
            System.out.print("Masukkan nilai akhir mahasiswa ke-" + (i + 1) + ": ");
            nilaiAkhir[i] = input.nextInt();
        }
        for (int i = 0; i < nilaiAkhir.length; i++) {
            String status;
            if (nilaiAkhir[i] >= 70) {
                status = "LULUS";
            } else {
                status = "TIDAK LULUS";
            }
            System.out.println("Nilai akhir mahasiswa ke-" + (i + 1) + ": " + nilaiAkhir[i] + " (" + status + ")");
        }
        input.close();
    }
}

