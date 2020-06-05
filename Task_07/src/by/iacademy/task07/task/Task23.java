package by.iacademy.task07.task;

public class Task23 {
    public static void task23(){
        int n = 30;
        int calc =0;
        double[][] mas = new double[n][n];

        for (int i = 0; i<n;i++){
            for (int j = 0;j<n;j++){
                mas[i][j]=Math.sin((i*i-j*j)/n);
                if (mas[i][j]>0){
                    calc++;
                }
            }
        }
        System.out.println("Всего положительных элементов = "+calc);
    }
}
