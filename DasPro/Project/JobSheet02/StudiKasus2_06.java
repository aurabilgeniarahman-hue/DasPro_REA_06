public class StudiKasus2_06 {
    public static void main(String[] args) {
        double panjangTanah = 100, lebarTanah = 30;
        double diameterKolam = 5, sisiTaman = 2;

        double luasTanah = panjangTanah * lebarTanah;
        double jariJari = diameterKolam / 2;
        double luasKolam = Math.PI * jariJari * jariJari;
        double luasTaman = sisiTaman * sisiTaman;
        double luasSisa = luasTanah - (luasKolam + luasTaman);

        System.out.println("Luas tanah sisa: " + luasSisa + " m2");
    }
}
