package by.iacademy.task07.task;

public class Task14 {
    public static void task14(){
        int m = 10;
        int n = m;
        int[][] mas = new int[m][n];


        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(i+j==n-1){
                    mas[i][j]=i+1;

                }else
                    mas[i][j] = 0;
                System.out.format("%3d",mas[i][j]);
            }
            System.out.println();
        }
    }
}
