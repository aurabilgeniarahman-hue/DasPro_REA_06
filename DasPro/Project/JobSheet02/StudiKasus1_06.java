public class StudiKasus1_06 {
    public static void main(String[] args) {
        double gajiPokok = 5000000;
        double tunjanganPerAnak = 100000;
        int jumlahAnak = 4;

        double totalTunjangan = jumlahAnak * tunjanganPerAnak;
        double potonganPensiun = 0.10 * gajiPokok;
        double gajiBersih = (gajiPokok + totalTunjangan) - potonganPensiun;

        System.out.println("Gaji Bersih per Bulan: Rp " + gajiBersih);
    }
}