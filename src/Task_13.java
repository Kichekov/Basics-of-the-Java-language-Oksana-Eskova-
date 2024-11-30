/*
Выполните задачу с использованием цикла do-while.
Пользователь вводит целое число (контрольное число). А затем вводится произвольное
количество положительных целых чисел. Признаком конца ввода является любое отрицательное
число.
Подсчитать во вводимой последовательности количество положительных делителей
контрольного числа.

Тестовые данные
Sample Input:

78
5 6 4 1 26 28 -5
Sample Output:

3
 */

import java.util.Scanner;

public class Task_13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int controlNamber = scan.nextInt();
        int x, counter;
        counter = 0;

        do {
            x = scan.nextInt();
            if (controlNamber % x == 0 && x > 0) {
                counter++;
            }
        } while (x > 0);
        System.out.println(counter);
    }
}

