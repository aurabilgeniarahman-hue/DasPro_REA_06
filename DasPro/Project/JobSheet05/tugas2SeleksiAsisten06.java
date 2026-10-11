import java.util.Scanner;

public class tugas2SeleksiAsisten06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input data mahasiswa
        System.out.print("Apakah status mahasiswa aktif? (ya/tidak): ");
        String statusAktif = sc.nextLine().trim();

        System.out.print("Apakah sedang mendapatkan sanksi akademik? (ya/tidak): ");
        String sanksiAkademik = sc.nextLine().trim();

        // Seleksi Tahap 1: Status aktif dan tidak ada sanksi akademik
        if (statusAktif.equalsIgnoreCase("ya") && sanksiAkademik.equalsIgnoreCase("tidak")) {
            
            System.out.print("Masukkan nilai Dasar Pemrograman (0-100): ");
            int nilaiDP = sc.nextInt();

            System.out.print("Apakah memiliki sertifikat kompetensi pemrograman? (ya/tidak): ");
            sc.nextLine(); // membersihkan buffer enter
            String sertifikat = sc.nextLine().trim();

            // Seleksi Tahap 2: Nilai DP >= 80 ATAU memiliki sertifikat
            if (nilaiDP >= 80 || sertifikat.equalsIgnoreCase("ya")) {
                
                System.out.println("\nSelamat! Anda lolos seleksi administratif dan dipanggil untuk mengikuti wawancara.");
                
                System.out.print("Masukkan nilai wawancara (0-100): ");
                int nilaiWawancara = sc.nextInt();

                // Seleksi Tahap 3: Nilai wawancara minimal 75
                if (nilaiWawancara >= 75) {
                    System.out.println("Hasil: DITERIMA sebagai asisten praktikum!");
                } else {
                    System.out.println("Gagal! Nilai wawancara kurang dari 75.");
                }

            } else {
                System.out.println("Gagal! Nilai Dasar Pemrograman kurang dari 80 dan tidak memiliki sertifikat kompetensi pemrograman.");
            }

        } else {
            System.out.println("Gagal! Mahasiswa tidak berstatus aktif atau sedang mendapatkan sanksi akademik.");
        }

        sc.close();
    }
}