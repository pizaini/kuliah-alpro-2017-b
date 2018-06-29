/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bubblesort;

import java.util.Arrays;

/**
 *
 * @author Pizaini
 */
public class RunBubbleSort {
    public static void main(String[] args) {
        int[] data = {9, 7, 6, 5, 4};
        //sebelum diurutkan
        System.out.println(Arrays.toString(data));
        System.out.println("Pengurutan");
        //bubble sort
        for(int j = 0; j < data.length - 1; j++){
            for(int i = data.length - 1; i > 0; i--){
                    int a = data[i];
                    int b = data[i-1];
                    if(a < b){
                        data[i] = b;
                        data[i-1] = a;
                    }
                //menampilakn hasil setiap langkah
                System.out.println(Arrays.toString(data));
            }
            //hasil setiap tahapan
            System.out.println("Tahap ke "+(j+1)+" "+Arrays.toString(data));
        }
        //setelah pengurutan
        System.out.println(Arrays.toString(data));
    }
}
