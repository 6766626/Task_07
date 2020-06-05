package by.iacademy.task07.task;

public class Task22 {
    public static void task22(){
        int m = 8;
        int n = m;
        int[][] mas = new int[m][n];

        for (int i = 0; i<n/2;i++){
            for (int j=0;j<n/2;j++){
                mas[i][j]=j+i+1;
            }
        }
        for (int i = n/2; i<n;i++){
            for (int j=0;j<n-i;j++){
                mas[i][j]=i+1-j;
            }
        }
        for (int i = 0; i<n;i++){
            for (int j=n/2;j<n-i;j++){
                mas[i][j]=j+i+1;
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
