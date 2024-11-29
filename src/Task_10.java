/*
Выполните задачу с использованием цикла while.
Нужно найти произведение всех целых чисел в диапазоне, указанном пользователем.
Пользователь вводит границы диапазона через пробел. При этом не всегда
 первое вводимое число меньше второго.
Произведение чисел быстро растет, поэтому для него используйте переменную типа double.
Форматирование при выводе не используйте!
Тестовые данные
Sample Input 1:
3 7
Sample Output 1:
2520.0
Sample Input 2:
7 3
Sample Output 2:
2520.0
Sample Input 3:
44 39
Sample Output 3:
5.08251744E9
 */

import java.util.Scanner;

public class Task_10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double min = a;
        double max = b;
        if (b < min) {
            double temp = a;
            min = b;
            max = temp;
        }
        double sum = 1;
        while (min <= max) {
            sum *= min;
            min++;
        }
        System.out.println(sum);
    }
}

