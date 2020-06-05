package by.iacademy.task07.task;

import java.util.Random;

public class Task11 {
    public static void task11() {

        int m = 6;
        int n = 5;
        int[][] mas = new int[m][n];

        Random random = new Random();

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                mas[i][j] = random.nextInt(10);
                System.out.print(mas[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("А теперь выводим массив, как в условии:");
        for (int i = 0; i < m; i++) {
            if (i==0||i%2==0){
            for (int j = 0; j < n; j++) {
                System.out.print(mas[i][j] + " ");}
            }else
                {
                for (int j =n-1; j>=0; j--) {
                    System.out.print(mas[i][j] + " ");}
            }

            System.out.println();
        }

    }
}
