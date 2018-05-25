public class Main {
    public static void main(String[] args) {
        PersegiPanjang persPanjang = new PersegiPanjang(10, 6);
        double luas = persPanjang.hitungLuas();
        double keliling = persPanjang.hitungKeliling();
        System.out.println("Luas adalah = "+luas);
        System.out.println("Keliling adalah = "+keliling);
    }
}