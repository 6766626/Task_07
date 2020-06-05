package by.iacademy.task07.task;

public class Task20 {
    public static void task20(){
        int m = 8;
        int n = m;
        int[][] mas = new int[m][n];

        for (int i = 0; i<n;i++){
            for (int j=0;j<n;j++){
                mas[i][j] = 1;
            }
        }

        for (int i = 0; i<n/2;i++){
            for (int j=i+1;j<n-1-i;j++){
                mas[i][j] = 0;
            }
        }
        for (int i = n/2+1; i<n;i++){
            for (int j=(n-i);j<i;j++){
                mas[i][j] = 0;
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.format("%3d",mas[i][j]);
            }
            System.out.println();
        }
    }
}
