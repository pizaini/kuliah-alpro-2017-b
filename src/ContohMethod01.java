
import java.util.Scanner;

public class ContohMethod01 {
    
    public static void main(String[] args) {
        //Membuat instance
        ContohMethod01 contohMethod01 = new ContohMethod01();
        //memanggil method
        int luas = contohMethod01.hitungLuasPersegiPanjang2(10, 5);
        System.out.println("Luas  = "+luas);
    }
    
    public void iniAdalahMethod(){
        System.out.println("Ini berasal dari method lain");
    }
    
    public void iniMethodDua(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Inputkan nama: ");
        String nama = scanner.next();
        System.out.println("Nama anda "+nama);
    }
    
    public void hitungLuasPersegiPanjang(int panjang, int lebar){
        int luas = panjang * lebar;
        System.out.println("Luas persegi panjang = "+luas);
    }
    
    public int hitungLuasPersegiPanjang2(int panjang, int lebar){
        System.out.println("method dipanggil");
        int luas = panjang * lebar;
        return luas;
    }
}
