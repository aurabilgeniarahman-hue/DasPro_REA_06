import java.util.Scanner;

public class LuasPersegiPanjang006 {
    public static void main(String[] args) {
        // Deklarasi Scanner
        Scanner scanner = new Scanner(System.in);

        // Deklarasi variabel
        int panjang;
        int lebar;
        int luas;

        // Input panjang dan lebar
        System.out.print("Masukkan panjang: ");
        panjang = scanner.nextInt();
        
        System.out.print("Masukkan lebar: ");
        lebar = scanner.nextInt();

        // Hitung luas
        luas = panjang * lebar;

        // Tampilkan hasil luas
        System.out.println("Luas persegi adalah " + luas);
    }
}