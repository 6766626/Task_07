package by.iacademy.task07.task;

import java.util.Scanner;

public class Task27 {
    public static void task27(){
        Scanner in = new Scanner(System.in);
        System.out.print("Введите номер строки для замены до 4: ");
        int n = in.nextInt()-1;
        System.out.print("Введите номер второй строки для замены до 4: ");
        int m = in.nextInt()-1;
        int [][] mas = new int[4][4];
        int [] stolbN = new int[4];
        int [] stolbM = new int [4];
        int rand  = 0;

        System.out.println("вывод обычной матрицы");
        for (int i=0;i<4;i++){
            for(int j = 0;j<4;j++){
                mas[i][j]=rand +1;
                rand++;
                System.out.format("%3d",mas[i][j]);
            }
            System.out.println();
        }


        for (int i=0;i<4;i++){
            for(int j = 0;j<4;j++){
                if (j==n){
                    stolbN[i]= mas[i][j];}

                if (j==m){
                    stolbM[i]= mas[i][j];}

            }
        }




        System.out.println("вывод новой матрицы");
        for (int i=0;i<4;i++){
            for(int j = 0;j<4;j++){
                if (j==n){
                    mas[i][j] = stolbM[i];}
                if (j==m){
                    mas[i][j] = stolbN[i];}
                System.out.format("%3d",mas[i][j]);
            }
            System.out.println();
        }


    }
}
