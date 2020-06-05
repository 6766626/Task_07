package by.iacademy.task07.task;

public class Task25 {
    public static void task25(){
        int n = 8;
        int[][] mas = new int[n][n];

        for(int i=0;i<mas.length;i++){
            for (int j=0;j<mas.length;j++){
                mas[i][j]=n*i+j+1;
                System.out.format("%3d", mas[i][j]);
            }
            System.out.println();
        }
    }
}
