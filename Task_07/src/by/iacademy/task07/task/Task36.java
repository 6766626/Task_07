package by.iacademy.task07.task;

import java.util.Random;

public class Task36 {
    public static void task36(){
        int n = 5;
        int[][] a = new int[n][n];


        Random random = new Random();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = random.nextInt(999);
                System.out.format("%4d",a[i][j]);
            }
            System.out.println();

        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(i==0&&j==0)           a[i][j]=(a[i+1][j]+a[i][j+1])/2;
                else if(i==0&&j==n-1)        a[i][j]=(a[i+1][j]+a[i][j-1])/2;
                else if(i==n-1&&j==0)        a[i][j]=(a[i-1][j]+a[i][j+1])/2;
                else if(i==n-1&&j==n-1)     a[i][j]=(a[i-1][j]+a[i][j-1])/2;
                else if(i==0&&j>0&&j<n)    a[i][j]=(a[i][j-1]+a[i][j+1]+a[i+1][j])/3;
                else if(i==n-1&&j>0&&j<n) a[i][j]=(a[i][j-1]+a[i][j+1]+a[i-1][j])/3;
                else if(i>0&&i<n&&j==0)    a[i][j]=(a[i-1][j]+a[i+1][j]+a[i][j+1])/3;
                else if(i>0&&i<n&&j==n-1) a[i][j]=(a[i-1][j]+a[i+1][j]+a[i][j-1])/3;
                else if(i>0&&i<n&&j>0||j<n) a[i][j]=(a[i-1][j]+a[i][j+1]+a[i+1][j]+a[i][j-1])/4;

            }
        }
        System.out.println("Сглаженная матрица:");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.format("%4d",a[i][j]);
            }
            System.out.println();

        }
    }
}
