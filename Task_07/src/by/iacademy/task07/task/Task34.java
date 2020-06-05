package by.iacademy.task07.task;

public class Task34 {
    public static void task34(){
        int m = 5;
        int n = 5;
        int mas[][] = new int[m][n];

        for (int i=0;i<m;i++){
            for(int j = 0;j<n;j++){
                if (j<i){
                    mas[i][j]=0;
                } else
                    mas[i][j]=1;
                System.out.format("%4d",mas[i][j]);
            }
            System.out.println();
        }
    }
}
