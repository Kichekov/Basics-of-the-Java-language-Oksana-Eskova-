/*
Пользователь вводит ширину треугольника (от 1 до 9). Изобразить треугольник числами,
 как показано в примере теста.
Тестовые данные
Sample Input:

5
Sample Output:

55555
4444
333
22
1
 */
import java.util.Scanner;

public class Task_16 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int width = scan.nextInt();
        for (int i = width; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
