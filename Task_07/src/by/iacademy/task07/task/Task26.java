package by.iacademy.task07.task;

import java.util.Scanner;

public class Task26 {
    public static void task26(){
        Scanner in = new Scanner(System.in);
        System.out.print("Введите размер матрицы n: ");
        int n = in.nextInt();
        System.out.print("Введите размер матрицы m: ");
        int m = in.nextInt();
        int [][] mas = new int[n][m];
        int [] sumMinus = new int[n];
        int [] maxElement = new int [n];
        int [] minElement = new int[n];


        for (int i=0;i<n;i++){
            for(int j = 0;j<m;j++){
                System.out.print("Введите значение ячейки массива ["+i+"]["+j+"]:");
                while (in.hasNextInt()==false){
                    in.next();
                    System.out.print("Введите значение ячейки массива ["+i+"]["+j+"]:");
                }
                mas[i][j] = in.nextInt();

                if(mas[i][j]<0){
                    sumMinus[i]=sumMinus[i]+mas[i][j];
                }
            }
        }
        System.out.println("Вывод нашей матрицы на экран:");
        for (int i=0;i<n;i++){
            for(int j = 0;j<m;j++){
                System.out.format("%3d",mas[i][j]);
            }
            System.out.println();
        }

        for (int i=0;i<n;i++){
            for(int j = 0;j<1;j++){
                maxElement[i] = mas[i][j];
                minElement[i] = mas[i][j];

            }
        }
        for (int i=0;i<n;i++){
            for(int j = 0;j<m;j++){
                if (mas[i][j]>maxElement[i]){
                    maxElement[i] = mas[i][j];
                }
                if (mas[i][j]<minElement[i]){
                    minElement[i] = mas[i][j];
                }
            }
        }
        for (int i =0;i<n;i++){
            System.out.println("максимальный элемент строки ["+i+"]="+maxElement[i]);
        }
        for (int i =0;i<n;i++){
            System.out.println("минимальный элемент строки ["+i+"]="+minElement[i]);
        }


        for (int i=0;i<n;i++){
            for(int j = 0;j<m;j++){
                if (mas[i][j] == maxElement[i]){
                    mas[i][j] = minElement[i];
                }
                else if (mas[i][j]==minElement[i]){
                    mas[i][j] = maxElement[i];
                }

            }
        }
        System.out.println("Вывод нашей новой матрицы на экран с поменяными min и max:");
        for (int i=0;i<n;i++){
            for(int j = 0;j<m;j++){
                System.out.format("%3d",mas[i][j]);
            }
            System.out.println();
        }

    }
}
