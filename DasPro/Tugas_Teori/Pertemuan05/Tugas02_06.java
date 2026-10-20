import java.util.Scanner;
public class Tugas02_06 {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);

        int antrean;
        System.out.print("Masukkan nomor antrean: ");
        antrean = input.nextInt();

        switch (antrean) {
            case 1:
                System.out.println("Layanan Legalisir Ijazah");
                System.out.println("Loket A");
                break;
            case 2:
                System.out.println("Layanan Surat Keterangan Aktif Kuliah");
                System.out.println("Loket B");
                break;
            case 3:
                System.out.println("Layanan Pembayaran UKT");
                System.out.println("Loket C");
                break;
            case 4:
                System.out.println("Layanan Pengajuan Cuti Akademik");
                System.out.println("Loket D");
                break;
            default:
                System.out.println("Antrean Tidak Valid");
        }
        
        input.close();
    }
    
}