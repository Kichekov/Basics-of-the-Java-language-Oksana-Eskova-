/*
Выполните задачу с использованием цикла while.
Пользователь вводит 10 оценок ученика (в 10-балльной системе).
Нужно подсчитать, сколько среди них неудовлетворительных оценок (менее 4 баллов)
Тестовые данные
Sample Input 1:

6 7 3 2 9 5 4 1 7 8
Sample Output 1:

3
Sample Input 2:

5 7 8 9 9 10 7 4 9 8
Sample Output 2:

0
 */
import java.util.Scanner;

public class Task_9 {
    public static void main(String[] args) {
        final int X = 10;
        int counter = 0;
        int a = 0;
        Scanner scan = new Scanner(System.in);

        while (a < X) {
            int estimation = scan.nextInt();
            if (estimation < 4) {
                counter++;
            }
            a++;
        }
        System.out.println(counter);
    }
}

