package by.iacademy.task07.task;

import java.util.Random;

public class Task03 {
    public static void task03(){
        final int rows = 10;
        final int cols = 9;
        int[][] arr = new int[rows][cols];

        Random random = new Random();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = random.nextInt(10);
                    System.out.print(arr[i][j]+" ");
            }
            System.out.println();

        }

        System.out.println("А сейчас первый и последний столбец");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (j==0||j==(cols-1)){
                System.out.print(arr[i][j]+" ");}
            }
            System.out.println();

        }

    }
}
