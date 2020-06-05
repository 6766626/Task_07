package by.iacademy.task07.task;

import java.util.Random;

public class Task35 {
    public static void task35(){
        int[][] arr = new int[5][5];


        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                arr[i][j] = random.nextInt(999);
                System.out.format("%4d",arr[i][j]);
            }
            System.out.println();

        }
        int max = arr[0][0];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (arr[i][j]>max){
                    max = arr[i][j];
                }
            }
        }

        System.out.println("Максимальное значение матрицы = "+max);
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (arr[i][j]%2!=0){
                    arr[i][j] = max;
                }
            }
        }
        System.out.println("Матрица с замененными нечетными элементами ");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.format("%4d",arr[i][j]);
            }
            System.out.println();

        }
    }
}
