import java.util.Arrays;
import java.util.Scanner;

public class ModifikasiSearchNilai_06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan banyaknya nilai yang ingin dimasukkan: ");
        int n = input.nextInt();
        int[] nilai = new int[n];
        System.out.println("Masukkan " + n + " nilai:");
        for (int i = 0; i < n; i++) {
            System.out.print("Nilai ke-" + (i + 1) + ": ");
            nilai[i] = input.nextInt();
        }
        System.out.print("Masukkan nilai yang ingin dicari: ");
        int key = input.nextInt();
        boolean ditemukan = false;

        for (int i = 0; i < nilai.length; i++) {
            if (nilai[i] == key) {
                System.out.println("Nilai " + key + " ditemukan pada indeks ke-" + i);
                ditemukan = true;
                break;
            }
        }

        if (!ditemukan) {
            System.out.println("Nilai yang dicari tidak ditemukan. Key " + key
                    + " tidak ada dalam array " + Arrays.toString(nilai) + ".");
        }
        input.close();
    }
}
