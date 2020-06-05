package by.iacademy.task07.task;

public class Task01 {
    public static void task01(){
        int [][] mas = new int[4][3];
        for (int i = 0;i<4;i++){
            for (int j = 0;j<3;j++){
                if ( (mas[i][0]+mas[i][1]+mas[i][2])==0){
                    mas[i][j] = 1;
                } else{
                    mas[i][j] =0;
                }
                System.out.print(mas [i][j] + " ");

            }
            System.out.println();
        }

    }
}
