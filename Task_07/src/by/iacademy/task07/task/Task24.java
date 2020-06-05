package by.iacademy.task07.task;

public class Task24 {
    public static void task24(){
        double [] mas = {1,2,3};
        double [][] mas2 = new double [mas.length][mas.length];

        for (int i=0;i<1;i++){
            for (int j =0; j<mas.length;j++){
                mas2 [i][j] = mas[j];
            }

        }

        for (int i=1;i<mas.length;i++){
            for (int j =0; j<mas.length;j++){
                mas2 [i][j] = Math.pow(mas2[0][j],i+1);
            }

        }
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas.length; j++) {
                System.out.print(mas2[i][j]+" ");
            }
            System.out.println();
        }
    }
}
