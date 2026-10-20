import java.util.Scanner;
public class Contoh01_06 {
    public static void main(String [] args) {
    Scanner input = new Scanner(System.in);

        int panjang, lebar, luas;
        System.out.print("Masukkan panjang persegi panjang: ");
        panjang = input.nextInt();

        System.out.print("Masukkan lebar persegi panjang: ");
        lebar = input.nextInt();    

        luas = panjang * lebar;
        System.out.println("Luas persegi panjang adalah: " + luas);

input.close();
    }
}