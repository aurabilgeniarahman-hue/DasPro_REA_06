import java.util.Scanner;

public class Tugas01Array_06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = input.nextInt();
        int totalNilai = 0;
        
        int[] nilai = new int[jumlahMahasiswa];

        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilai[i] = input.nextInt();
            totalNilai += nilai[i];
        }

        double rataRata = (double) totalNilai / jumlahMahasiswa;
        System.out.println("Rata-rata nilai: " + rataRata);


        int tertinggi = nilai[0];
        int terendah = nilai[0];
        for (int i = 1; i < jumlahMahasiswa; i++) {
            if (nilai[i] > tertinggi) {
                tertinggi = nilai[i];
            }
            if (nilai[i] < terendah) {
                terendah = nilai[i];
            }
        }
        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.println("Nilai terendah: " + terendah);

        for (int i = 0; i < jumlahMahasiswa; i++) {
            String status;
            if (nilai[i] >= 70) {
                status = "LULUS";
            } else {
                status = "TIDAK LULUS";
            }
            System.out.println("Nilai mahasiswa ke-" + (i + 1) + ": " + nilai[i] + " (" + status + ")");
        }

        input.close();
    }
}

