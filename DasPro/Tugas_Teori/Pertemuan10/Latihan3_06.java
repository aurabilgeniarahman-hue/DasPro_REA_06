public class Latihan3_06 {
    public static void main(String[] args) {
        int n = 5; 
       
        for (int i = 1; i <= n; i++) {
            int totalJumlah = 0;
            System.out.print("n = " + i + " → jumlah kuadrat = ");

            for (int j = 1; j <= i; j++) {
                int kuadrat = j * j;
                totalJumlah += kuadrat;
                
                System.out.print(kuadrat);
                
                if (j < i) {
                    System.out.print(" + ");
                }
            }
            
            System.out.println(" = " + totalJumlah);
        }
    }
}





