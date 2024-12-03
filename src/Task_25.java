/*

 */
import java.util.Scanner;

public class Task_25 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        int sum = 0;
        for (int i = 2; i < number; i++) {
            if (number % i == 0 && i % 2 == 0) {
                sum += i;
            }
        }
        System.out.print(sum);
    }
}
