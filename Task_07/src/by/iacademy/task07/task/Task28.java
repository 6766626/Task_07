package by.iacademy.task07.task;

import java.util.Random;

public class Task28 {
    public static void task28(){

        int[][] arr = new int[10][10];
        int [] mas  = new int[10];
        int maxSum;
        int maxStolbec=0;

        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                arr[i][j] = random.nextInt(10);
                mas[j] = mas[j]+arr[i][j];
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();

        }
        maxSum = mas[0];
        for (int j=0;j<10;j++){
            if (mas[j]>maxSum){
                maxSum = mas[j];
                maxStolbec = j;}
                System.out.println("Сумма столбца цифр столбца ["+(j+1)+"]="+mas[j]);

        }
        System.out.println("Наибольшая сумма="+maxSum+" в столбце "+(maxStolbec+1));

    }
}
