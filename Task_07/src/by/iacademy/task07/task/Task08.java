package by.iacademy.task07.task;

import java.util.Random;

public class Task08 {
    public static void task08(){
        int rows = 5;
        int cols = 5;
        int sum = 0;
        int[][] arr = new int[rows][cols];

        Random random = new Random();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = random.nextInt(10);
                System.out.format("%4d",arr[i][j]);
            }
            System.out.println();

        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (arr[i][j]==7){
                    sum = sum+1;
                }
            }
        }
        System.out.println("всего "+sum+"шт. 7-ок в массиве");
    }
}
