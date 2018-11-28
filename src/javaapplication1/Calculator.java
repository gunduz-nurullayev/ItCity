package javaapplication1;

import java.util.Random;
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        int[] a = new int[10];
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (5 * Math.random());
            System.out.print(a[i] + " ");
        }
        
        outer:for(int i = 0; i < a.length; i++){
            for(int j = i-1; j >=0; j--){
                if(a[i] == a[j]){
                    continue outer;
                }
            }
            int count = 0;
            for(int j = i; j < a.length; j++){
                if(a[i] == a[j]){
                    count ++;
                }
            }
            System.out.print( "\n" + a[i] + " " + count );
        }
        

    }
}
