import java.util.Scanner;

public class Task_21 {
    public static void main(String[] args) {
        int i;
         for (i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == j) break ;
                System.out.printf("i=%d j=%d \n", i, j);
            }
        }
    }
}