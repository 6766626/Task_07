package by.iacademy.task07.task;

import java.util.Random;

public class Task38 {
    public static void task38(){
        int n = 5;
        int[][] a = new int[n][n];
        int[][] b = new int[n][n];
        int[][] sum = new int[n][n];

        System.out.println("Матрица №1");
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = random.nextInt(100);
                System.out.format("%4d",a[i][j]);
            }
            System.out.println();

        }
        System.out.println("Матрица №2");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                b[i][j] = random.nextInt(100);
                System.out.format("%4d",b[i][j]);
            }
            System.out.println();

        }
        System.out.println("Сумма матриц:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                sum[i][j] = a[i][j]+b[i][j];
                System.out.format("%4d",sum[i][j]);
            }
            System.out.println();

        }

    }
}
