    public class Operator006 {
    public static void main(String[] args) {
        int x = 10;
        System.out.println("x++ = " + x++);
        System.out.println("Setelah evaluasi, x = " + x);
        
        x = 10;
        System.out.println("++x = " + ++x);
        System.out.println("Setelah evaluasi, x = " + x);
        
        int y = 12;
        // Menggunakan == untuk perbandingan
        System.out.println(x > y || y == x && y == x);
        
        int z = x ^ y;
        System.out.println("Hasil x ^ y adalah " + z);
        
        // Mengubah ekspresi z2; menjadi bit shift right (z >>= 2)
        z >>= 2; 
        System.out.println("Hasil akhir " + z);
    }
}