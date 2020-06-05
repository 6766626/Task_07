package by.iacademy.task07.task;

import java.util.Random;

public class Task06 {
    public static void task06(){
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

        System.out.println("А сейчас только те нечетные столбцы, где первый элемент меньше последнего");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (j==0||(j%2==0)){
                    if(arr[0][j]<arr[rows-1][j]){
                    System.out.print(arr[i][j]+" ");}}
            }
            System.out.println();

        }

    }
}
