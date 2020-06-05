package by.iacademy.task07.task;

import java.util.Random;

public class Task33 {
    public static void task33(){
        int[][] arr = new int[5][5];
        int [] [] newarr = new int [5][5] ;


        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                arr[i][j] = random.nextInt(999);
                System.out.format("%4d",arr[i][j]);
            }
            System.out.println();

        }
        int min = 0;

        for(int l=0; l<5; l++){
            for(int i = 0; i < 4; i++){
                for(int j = 0; j <4 ; j++){
                    if(arr[j][l] > arr[j+1][l]){
                        min = arr[j][l];
                        arr[j][l]=arr[j+1][l];
                        arr[j+1][l] = min;
                    }
                }
            }
        }

        System.out.println();
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.format("%4d",arr[i][j]);
            }
            System.out.println();

        }

        int max = 999;

        for(int l=0; l<5; l++){
            for(int i = 0; i < 4; i++){
                for(int j = 0; j <4 ; j++){
                    if(arr[j][l] < arr[j+1][l]){
                        max = arr[j][l];
                        arr[j][l]=arr[j+1][l];
                        arr[j+1][l] = max;
                    }
                }
            }
        }

        System.out.println();
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.format("%4d",arr[i][j]);
            }
            System.out.println();

        }

    }
}
