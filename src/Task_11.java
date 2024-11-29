/*
Выполните задачу с использованием цикла for.
Найти минимальное число в последовательности целых чисел.
Пользователь вводит количество целых чисел, а затем сами числа через пробел.
Тестовые данные
Sample Input:

6
2 8 -1 4 0 9
Sample Output:

-1

 */

import java.util.Scanner;

public class Task_11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int min = 0;
        int col = scan.nextInt();
        for (int i = 0; i < col; i++) {
            int num = scan.nextInt();
            if (i == 0) {
                min = num;
            }
            if (num < min) {
                min = num;
            }
        }
        System.out.println(min);
    }

}

