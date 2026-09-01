import java.util.Scanner;

public class Tugas2_06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input
        System.out.print("Masukkan panjang tanah: ");
        double panjang = input.nextDouble();

        System.out.print("Masukkan lebar tanah: ");
        double lebar = input.nextDouble();

        System.out.print("Masukkan diameter kolam: ");
        double diameter = input.nextDouble();

        System.out.print("Masukkan sisi taman: ");
        double sisi = input.nextDouble();

        // Proses
        double luasTanah = panjang * lebar;

        double jariJari = diameter / 2;
        double luasKolam = 3.14 * jariJari * jariJari;

        double luasTaman = sisi * sisi;

        double luasTidakDigunakan = luasTanah - luasKolam - luasTaman;

        // Output
        System.out.println("\n===== HASIL =====");
        System.out.println("Luas tanah          = " + luasTanah + " m2");
        System.out.println("Luas kolam          = " + luasKolam + " m2");
        System.out.println("Luas taman          = " + luasTaman + " m2");
        System.out.println("Luas tidak digunakan = " 
                           + luasTidakDigunakan + " m2");

        input.close();
    }
}
