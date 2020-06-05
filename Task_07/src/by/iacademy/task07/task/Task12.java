package by.iacademy.task07.task;

public class Task12 {
    public static void task12(){
        int m = 6;
        int n = m;
        int[][] mas = new int[m][n];


        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(i==j){
                    mas[i][j]=1*i;

                }else
                mas[i][j] = 0;
                System.out.print(mas[i][j] + " ");
            }
            System.out.println();
        }

    }
}
