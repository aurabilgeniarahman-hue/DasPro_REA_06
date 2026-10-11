package Project.JobSheet06;
import java.util.Scanner;
public class StudiKasus1_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hargaPerCup = 18000;
        int jumlahCup;
        int totalHarga;
        int diskon;
        int totalBayar;
        int kembalian;
        int kurang;

        System.out.print("Masukkan jumlah cup yang dibeli: ");
        jumlahCup = scanner.nextInt();
        System.out.print("Masukkan jumlah uang yang dibayarkan: ");
        int uangBayar = scanner.nextInt();
        
        totalHarga = hargaPerCup * jumlahCup;

        if (totalHarga >= 18000) {
            diskon = (int) (totalHarga * 0.10);
        } else {
            diskon = 0;
        }

        totalBayar = totalHarga - diskon;
       
        System.out.println("Total Harga: Rp " + totalHarga);
        System.out.println("Diskon: Rp " + diskon);
        System.out.println("Total Bayar: Rp " + totalBayar);

        if (uangBayar >= totalBayar) {
            kembalian = uangBayar - totalBayar;
            System.out.println("Kembalian: Rp " + kembalian);
        } else {
            kurang = totalBayar - uangBayar;
            System.out.println("Uang yang dibayarkan kurang sebesar: Rp " + kurang);
        }

        scanner.close();
    }
}
