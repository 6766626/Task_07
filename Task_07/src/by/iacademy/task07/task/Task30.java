package by.iacademy.task07.task;

import java.util.Random;

public class Task30 {
    public static void task30(){
        int[][] arr = new int[10][20];
        int [] schet = new int[10];


        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 20; j++) {
                arr[i][j] = random.nextInt(15);
                System.out.format("%3d",arr[i][j]);
                if (arr[i][j] == 5){
                    schet[i]++;
                }
            }
            System.out.println();

        }
        System.out.println("А сейчас номера строк, в которых цифра 5 встречается больше 3 раз:");
        for (int i = 0; i < 10; i++) {
           if (schet[i]>=3){
               System.out.println("В строке "+(i+1)+" пятерок аж целых "+schet[i]+" штуки!");
           }
        }
    }
}
