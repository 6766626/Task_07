package by.iacademy.task07.task;

import java.util.Random;

public class Task39 {
    public static void task39(){
        int l = 3;
        int n = 3;
        int m = 2;
        int[][] a = new int[l][n];
        int[][] b = new int[m][n];
        int[][] x = new int[l][n];

        System.out.println("Матрица №1");
        Random random = new Random();
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = random.nextInt(10);
                System.out.format("%4d",a[i][j]);
            }
            System.out.println();

        }
        System.out.println("Матрица №2");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                b[i][j] = random.nextInt(10);
                System.out.format("%4d",b[i][j]);
            }
            System.out.println();

        }


        for (int i=0; i<l; ++i){
            for (int j=0; j<n; ++j){
                for (int k=0; k<m; ++k){
                    x[i][j] = a[i][k] * b[k][j];
                }
            }
        }
        System.out.println("Произведение матриц:");

        for (int i = 0; i < l; i++) {
            for (int j = 0; j < n; j++) {
                System.out.format("%4d",x[i][j]);
            }
            System.out.println();

        }
    }
}
