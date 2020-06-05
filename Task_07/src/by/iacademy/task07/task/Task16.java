package by.iacademy.task07.task;

public class Task16 {
    public static void task16() {
        int m = 6;
        int n = m;
        int[][] mas = new int[m][n];
        initMas(mas);
    }

public static void initMas(int mas[][]){
    int m = 6;
    int n = m;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(i==j){
                    mas[i][j]=1*(i+1)*(i+2);

                }else
                    mas[i][j] = 0;
                System.out.format("%3d",mas[i][j]);
            }
            System.out.println();
        }
    }
}
