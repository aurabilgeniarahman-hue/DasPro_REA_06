package Project.JobSheet06;

import java.util.Scanner;

public class StudiKasus2_06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String namaMahasiswa;
        String jenisKegiatan;
        int jumlahDokumenDiupload;
        int peringkatJuara;
        int statusPendanaanPKM;

        System.out.print("Masukkan nama mahasiswa: ");
        namaMahasiswa = input.nextLine();
        System.out.println("Nama mahasiswa: " + namaMahasiswa);
        System.out.print("Jenis kegiatan (BELMAWA/BAKORMA/MANDIRI/PKM/LAINNYA): ");
        jenisKegiatan = input.nextLine();

        if (jenisKegiatan.equalsIgnoreCase("BELMAWA") || 
            jenisKegiatan.equalsIgnoreCase("BAKORMA") || 
            jenisKegiatan.equalsIgnoreCase("MANDIRI")) {

            System.out.print("Masukkan peringkat juara (1, 2, atau 3): ");
            peringkatJuara = input.nextInt();

            if (peringkatJuara >= 1 && peringkatJuara <= 3) {
                System.out.print("Masukkan jumlah dokumen yang diupload (0-4): ");
                jumlahDokumenDiupload = input.nextInt();

                if (jumlahDokumenDiupload >= 4) {
                    System.out.println("Status: Mendapat Dana Penghargaan");
                } else {
                    System.out.println("Status: Tidak Mendapat Dana Penghargaan");
                    System.out.println("Alasan: Dokumen tidak lengkap, masih kurang " + (4 - jumlahDokumenDiupload) + " dokumen.");
                }
            } else {
                System.out.println("Status: Tidak Mendapat Dana Penghargaan");
                System.out.println("Alasan: Tidak meraih Juara 1, 2, atau 3.");
            }

        } else if (jenisKegiatan.equalsIgnoreCase("PKM")) {

            System.out.print("Status pendanaan PKM (1 = lolos, 0 = tidak lolos): ");
            statusPendanaanPKM = input.nextInt();

            if (statusPendanaanPKM == 1) {
                System.out.print("Masukkan jumlah dokumen yang diupload (0-4): ");
                jumlahDokumenDiupload = input.nextInt();

                if (jumlahDokumenDiupload >= 4) {
                    System.out.println("Status: Mendapat Dana Penghargaan");
                } else {
                    System.out.println("Status: Tidak Mendapat Dana Penghargaan");
                    System.out.println("Alasan: Dokumen tidak lengkap, masih kurang " + (4 - jumlahDokumenDiupload) + " dokumen.");
                }
            } else {
                System.out.println("Status: Tidak Mendapat Dana Penghargaan");
                System.out.println("Alasan: PKM tidak lolos pendanaan.");
            }

        } else {
            System.out.println("Status: Tidak Mendapat Dana Penghargaan");
            System.out.println("Alasan: Jenis kegiatan tidak memenuhi syarat pendanaan.");
        }

        input.close();
    }
}