public class ContohVariabel06 {

    public static void main(String[] args) {
        String salahSatuHobySayaAdalah = "Bermain petak umpet";
        boolean isPandai = true;
        char jenisKelamin = 'L';
        byte _umurSayaSekarang = 20;
        double ipk = 3.24, tinggi = 1.78;

        System.out.println(salahSatuHobySayaAdalah);
        System.err.println("Apakah pandai? " + isPandai);
        System.out.println("Jenis Kelamin: " + jenisKelamin);
        System.out.println("Umurku Saat ini: " + _umurSayaSekarang);
        System.out.println(String.format("Saya beripk %s, dengan tinggi badan %s", ipk, tinggi));
    }
}