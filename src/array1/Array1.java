package array1;

import latihan02.Nasabah;

public class Array1 {
   //dengan kapastias, data masih kosong
    int[] angka1 = new int[10];
    
    //data langung diisi (kapasitas otomatis)
    int[] angka2 = new int[]{2, 10, 9, 19, 1};
    String[] nama = new String[]{"nama1", "nama2", "nama3"};
    String[][] namaMultidimensi = new String[][]{
        {"A1", "A2", "A3"},
        {"B1", "B2", "B3"},
        {"C1", "C2", "C3"},
    };
    
    public void ambilDataArray(){
        //ambil satu persatu
        System.out.println("Data array "+angka2[0]);
        System.out.println("Data arraymultidimensi "+namaMultidimensi[2][1]);
        //ambil satu persatu, dengan loop
        for(int i = 0; i < angka2.length; i++){
            System.out.println("Data array ke "+i+" adalah: "+angka2[i]);
        }
        for(int data: angka2){
            System.out.println("Data array ke "+data);
        }
        //array multidimensi
        for(String[] namaArray: namaMultidimensi){
            for(String nm: namaArray){
                System.out.println("Data array ke "+nm);
            }
        }
    }
    
    public void tambahDataArray(){
        angka1[0] = 90;
        angka1[1] = 4;
        angka1[2] = 65;
    }
    
    public static void main(String[] args) {
        Array1 array1 = new Array1();
        array1.ambilDataArray();
    }
    
}