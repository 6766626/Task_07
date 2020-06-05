package by.iacademy.task07.task;

public class Task17 {
    public static void task17() {
        int m = 6;
        int n = m;
        int[][] mas = new int[m][n];
        initMas(mas);
    }


public static void initMas(int mas[][]) {
    int m = 6;
    int n = m;
    for (int i = 0; i < m; i++) {
        for (int j = 0; j < n; j++) {
            if (i == 0 || j == (n - 1) || j == 0 || i == (n - 1)) {
                mas[i][j] = 1;

            } else
                mas[i][j] = 0;
            System.out.print(mas[i][j] + " ");
        }
        System.out.println();
    }
}
}
