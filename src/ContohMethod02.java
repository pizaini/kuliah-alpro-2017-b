public class ContohMethod02 {
    public static void main(String[] args) {
        //Membuat instance
        ContohMethod02 contohMethod02 = new ContohMethod02();
        //Memanggil method
        int luas = contohMethod02.hitungLuas2(10, 2);
        System.out.println("Luas "+luas);
        
        
    }
    
    public int hitungLuas2(int panjang, int lebar){
        int luas = panjang * lebar; 
        return luas;
    }
    public void hitungLuas(int panjang, int lebar){
        int luas = panjang * lebar;
        System.out.println("Luas  = "+luas);
    }
    
    public void hitungKeliling(int panjang, int lebar){
        int keliling = (panjang + lebar) * 2;
        System.out.println("Keliling = "+keliling);
    }
    
    
}
