package by.iacademy.task07.task;


public class Task13 {
    public static void task13(){
        int m = 10;
        int n = 10;
        int[][] mas = new int[m][n];


        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                mas[i][j] = j+1;
            }
        }
        System.out.println("А теперь выводим массив, как в условии:");
        for (int i = 0; i < m; i++) {
            if (i==0||i%2==0){
                for (int j = 0; j < n; j++) {
                    System.out.print(mas[i][j] + " ");}
            }else
            {
                for (int j =n-1; j>=0; j--) {
                    System.out.print(mas[i][j] + " ");}
            }

            System.out.println();
        }


    }
}
