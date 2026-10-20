import java.util.Scanner;

public class MenghitungLuasPersegiPanjang06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int panjang;
        int lebar;
        int luas;

        System.out.print("Masukkan panjang: ");
        panjang = scanner.nextInt();
        
        System.out.print("Masukkan lebar: ");
        lebar = scanner.nextInt();

        luas = panjang * lebar;
        
        System.out.println("Luas persegi adalah " + luas);
    }
}