package by.iacademy.task07.task;

import java.util.Random;

public class Task09 {
    public static void task09(){
        int rows = 5;
        int cols = rows;
        int[][] arr = new int[rows][cols];

        Random random = new Random();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = random.nextInt(10);
                System.out.format("%4d",arr[i][j]);
            }
            System.out.println();

        }
        System.out.println("А сейчас крестиком");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (i==j||(j+i==rows-1)){
                    System.out.format("%4d",arr[i][j]);
                }else
                    System.out.print("    ");
            }
            System.out.println();
        }
    }
}
