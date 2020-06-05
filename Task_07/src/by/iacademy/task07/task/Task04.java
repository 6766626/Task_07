package by.iacademy.task07.task;

import java.util.Random;

public class Task04 {
    public static void task04(){
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

            System.out.println("А сейчас первая и последняя строка");

            for (int i = 0; i<rows; i++) {
                if (i==0||(i==(rows-1))){
                for (int j = 0; j< cols; j++) {
                        System.out.print(arr[i][j]+" ");
                }
                System.out.println();}
            }

    }
}
