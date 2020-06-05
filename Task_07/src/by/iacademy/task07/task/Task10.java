package by.iacademy.task07.task;

import java.util.Random;

public class Task10 {
    public static void task10(){
        final int rows = 10;
        final int cols = 10;
        int k = 1;
        int p = 5;
        int[][] arr = new int[rows][cols];

        Random random = new Random();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = random.nextInt(10);
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();

        }

        System.out.println("А сейчас "+p+"-ый столбец");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (j==p-1){
                    System.out.print(arr[i][j]+" ");}
            }
            System.out.println();

        }
        System.out.println("А сейчас "+k+"-ая строка");

        for (int i = 0; i<rows; i++) {
            if (i==k-1){
                for (int j = 0; j< cols; j++) {
                    System.out.print(arr[i][j]+" ");
                }
                System.out.println();}
        }

    }
}
