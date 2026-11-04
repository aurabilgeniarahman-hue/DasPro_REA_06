public class Latihan2_06 {
    public static void main(String[] args) {
        char huruf = 'a';
        int jumlahBaris = 5;
        for (int i = 1; i <= jumlahBaris; i++) {
            for (int j = 1; j <= jumlahBaris - i; j++) {
                System.out.print(" ");
            }
            int jumlahKolom = 2 * i - 1;
            for (int k = 1; k <= jumlahKolom; k++) {
                System.out.print(huruf);
                huruf++;
            }
            System.out.println();
        }
    }
} 
