package by.iacademy.task07.task;

import java.util.Random;

public class Task07 {
    public static void task07(){
        final int rows = 5;
        final int cols = 5;
        int sum = 0;
        int[][] arr = new int[rows][cols];

        Random random = new Random();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = (random.nextInt(21)-10);
                System.out.format("%4d",arr[i][j]);
            }
            System.out.println();

        }
        System.out.print("А вот сумма отрицательных нечетных элементов = ");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if ((arr[i][j]%2!=0)&&(arr[i][j]%2<0)){
                    sum = sum+arr[i][j];
                }
            }


        }
        System.out.println(-sum);

    }
}
