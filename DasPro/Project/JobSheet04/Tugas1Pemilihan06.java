import java.util.Scanner;

public class Tugas1Pemilihan06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("_ _ _ Cetak KRS SIAKAD _ _ _");
        System.out.print("Apakah UKT sudah lunas? (true/false): ");
        boolean uktLunas = sc.nextBoolean();

        String pesan = uktLunas ? "Pembayaran UKT terverifikasi\nSilahkan cetak KRS dan minta tanda tangan DPA" : "Registrasi ditolak. Silahkan lunasi UKT terlebih dahulu";
        System.out.println(pesan);
    }
    
}
