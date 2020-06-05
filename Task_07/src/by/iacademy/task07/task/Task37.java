package by.iacademy.task07.task;

import java.util.Random;

public class Task37 {
    public static void task37(){
        int n = 5;
        int[][] a = new int[n][n];
        int[] mas1 = new int[n];
        int[] mas2 = new int[n];


        Random random = new Random();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = random.nextInt(999);
                System.out.format("%4d",a[i][j]);
            }
            System.out.println();

        }
       for (int b = 0; b<n;b++){
           int k = random.nextInt(n);
           if (k<0){
               k = k+1;
           }
           int z = random.nextInt(n);
           if (z<0){
               z = z+1;
           }

                for (int j = 0; j < n; j++) {
                    mas1[j] = a[k][j];
            }


                for (int j = 0; j < n; j++) {
                    mas2[j] = a[z][j];
               }
           for (int j = 0; j < n; j++) {
               a[k][j] = mas2[j];
           }
           for (int j = 0; j < n; j++) {
               a[z][j] = mas1[j];
           }
       }
        System.out.println("Случайно поменяные строки массива:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.format("%4d",a[i][j]);
            }
            System.out.println();

        }


    }
}
