/*
Найти минимальное из пяти целых чисел, введенных пользователем.

Тестовые данные
Sample Input:

3 -2 5 0 1
Sample Output:

-2
 */

import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();
        int num4 = scan.nextInt();
        int num5 = scan.nextInt();

        int min = num1;

        if (num2 < min) {
            min = num2;
        }
        if (num3 < min) {
            min = num3;
        }
        if (num4 < min) {
            min = num4;
        }
        if (num5 < min) {
            min = num5;
        }
        System.out.println(min);
    }
}
