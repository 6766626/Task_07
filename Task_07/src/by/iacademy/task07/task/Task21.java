package by.iacademy.task07.task;

public class Task21 {
    public static void task21(){
            int m = 8;
            int n = m;
            int[][] mas = new int[m][n];

            for (int i = 0; i<n/2;i++){
                for (int j=0;j<=i;j++){
                   mas[i][j]=n-i+j;
                }
            }
        for (int i = n/2; i<n;i++){
            for (int j=0;j<n/2;j++){
                mas[i][j]=n-i+j;
            }
        }
        for (int i = n/2; i<n;i++){
            for (int j=n/2;j<=i;j++){
                mas[i][j]=n+j-i;
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
