import java.util.Scanner;

public class ModifikasiStudiKasus2_06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Panjang Tanah: ");
        double panjangTanah = input.nextDouble();
        System.out.print("Masukkan Lebar Tanah: ");
        double lebarTanah = input.nextDouble();
        System.out.print("Masukkan Diameter Kolam: ");
        double diameterKolam = input.nextDouble();
        System.out.print("Masukkan Sisi Taman: ");
        double sisiTaman = input.nextDouble();

        double luasTanah = panjangTanah * lebarTanah;
        double jariJari = diameterKolam / 2;
        double luasKolam = Math.PI * jariJari * jariJari;
        double luasTaman = sisiTaman * sisiTaman;
        double luasSisa = luasTanah - (luasKolam + luasTaman);

        System.out.println("Luas tanah sisa: " + luasSisa + " m2");

    }
}