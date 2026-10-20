import java.util.Scanner;
public class Contoh02_06 {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);

        double harga, potongan, jumlahBayar, diskon;
        diskon = 0.15;

        System.out.print("Masukkan harga barang Anda: ");
        harga = input.nextInt();

        potongan = harga * diskon;
        System.out.println("Anda mendapat potongan sebesar: " + potongan);

        jumlahBayar = harga - potongan;
        System.out.println("Jumlah yang harus dibayar adalah: " + jumlahBayar);

input.close();
    }
}