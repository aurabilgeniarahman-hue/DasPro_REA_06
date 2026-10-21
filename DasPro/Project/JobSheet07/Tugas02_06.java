import java.util.Scanner;

public class Tugas02_06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int jenis, durasi, total = 0;
        
        do {
            System.out.print("Masukkan jenis kendaraan (1 untuk mobil, 2 untuk motor, 0 untuk keluar): ");
            jenis = input.nextInt();
            
            if (jenis == 1 || jenis == 2) {
                System.out.print("Masukkan durasi parkir (jam): ");
                durasi = input.nextInt();
                
                if (jenis == 1) {
                    total += durasi * 3000;
                } else {
                    total += durasi * 2000;
                }
            }
            
        } while (jenis != 0);
        
        System.out.println("Total pembayaran parkir seluruh kendaraan: Rp " + total);
        
        input.close();
    }
}