package by.iacademy.task07.task;
import java.util.Random;

public class Task02 {
    public static void task02(){

        final int rows = 3;
        final int cols = 2;
        int[][] arr = new int[rows][cols];

        Random random = new Random();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = random.nextInt(10);
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();

        }
    }
}
