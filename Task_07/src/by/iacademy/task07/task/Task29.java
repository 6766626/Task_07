package by.iacademy.task07.task;

import java.util.Random;

public class Task29 {
    public static void task29(){
        int[][] arr = new int[5][5];


        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                arr[i][j] = (random.nextInt(20)-10);

                System.out.format("%3d",arr[i][j]);
            }
            System.out.println();

        }
        System.out.println("А сейчас все положительные цифры главной диагонали: ");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
               if (i==j&&arr[i][j]>0){
                 System.out.print(arr[i][j]+" ");
               }

            }

        }

    }
}
