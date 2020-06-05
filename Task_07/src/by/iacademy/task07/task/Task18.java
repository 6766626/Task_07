package by.iacademy.task07.task;

public class Task18 {
    public static void task18(){
        int m = 6;
        int n = m;

        int[][] mas = new int[m][n];
        initMas(mas);
    }

    public static void initMas (int [][] ar) {
            int m = 6;
            int n = m;
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (i > n - j - 1) {
                        ar[i][j] = 0;
                    } else
                        ar[i][j] = i + 1;

                    System.out.format("%3d", ar[i][j]);
                }
                System.out.println();
            }
        }
}
