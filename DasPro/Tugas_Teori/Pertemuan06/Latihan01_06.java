import java.util.Scanner;

public class Latihan01_06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int Bil1,Bil2,Bil3,Terbesar;
        System.out.print("Masukkan Bil1: ");
        Bil1 = input.nextInt();
        System.out.print("Masukkan Bil2: ");
        Bil2 = input.nextInt();
        System.out.print("Masukkan Bil3: ");
        Bil3 = input.nextInt();
        
        if (Bil1 > Bil2) {
            if (Bil1 > Bil3) {
                Terbesar = Bil1;
            } else {
                Terbesar = Bil3;
            }
        } else {
            if (Bil2 > Bil3) {
                Terbesar = Bil2;
            } else {
                Terbesar = Bil3;
            }
        }

        System.out.println("Bilangan yang terbesar adalah: " + Terbesar);

        input.close();
    }
}                                                                                               

