import java.util.Scanner;

public class ModifikasiArrayRataNilai_06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMhs = input.nextInt();

        int nilaiMhs[] = new int[jumlahMhs];
        int total = 0;
        double rataRata;

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilaiMhs[i] = input.nextInt();
            total += nilaiMhs[i];
        }
        rataRata = (double) total / nilaiMhs.length;
        System.out.println("Total : " + total);
        System.out.println("Rata-rata : " + rataRata);

        int nilaiBesar = 0;
        for (int i = 0; i < nilaiMhs.length; i++) {
            if (nilaiMhs[i] > 70) {
                nilaiBesar++;
            }
        }
        System.out.println("Jumlah mahasiswa yang memiliki nilai lebih dari 70: " + nilaiBesar);

        String predikat;
        if (rataRata >= 85) {
           predikat = "SANGAT BAIK";
        } else if (rataRata >= 70) {
            predikat = "BAIK";
        } else {
            predikat = "PERLU PENDAMPINGAN";
        }

        int tertinggi = nilaiMhs[0];
        int terendah = nilaiMhs[0];
        for (int i = 1; i < nilaiMhs.length; i++) {
            if (nilaiMhs[i] > tertinggi) {
                tertinggi = nilaiMhs[i];
            }
            if (nilaiMhs[i] < terendah) {
                terendah = nilaiMhs[i];
            }
        }
        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.println("Nilai terendah: " + terendah);
        System.out.println("Predikat kelas: " + predikat);

        input.close();
    }
}
