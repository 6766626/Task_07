package by.iacademy.task07.task;

import java.util.Random;

public class Task31 {
    public static void task31(){
        int[][] arr = new int[5][5];
        int schet = 0;


        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                arr[i][j] = random.nextInt(999);
                System.out.format("%4d",arr[i][j]);
                if (arr[i][j] > 9&&arr[i][j]<100){
                    schet++;
                }
            }
            System.out.println();

        }
        System.out.println("Всего двузначных чисел "+ schet);
    }
}
