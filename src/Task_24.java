/*
Выведите первое составное число в заданном диапазоне. Составным называется число, у которого более двух делителей.
(т.е. оно делится на единицу, на себя и еще на что-то). Единица не является ни простым, ни составным числом!)
Пользователь вводит границы диапазона через пробел (положительные целые числа).
Границы диапазона могут быть некорректны (первое число больше второго). В этом случае все равно происходит поиск,
как для корректных границ.
Если в заданном диапазоне нет таких чисел, то нужно вывести "NO".
Тестовые данные
Sample Input 1:
8 22
Sample Output 1:
8
Sample Input 2:
22 8
Sample Output 2:
8
Sample Input 3:
1 3
Sample Output 3:
NO

 */
import java.util.Scanner;

public class Task_24 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number_a = scan.nextInt();
        int number_b = scan.nextInt();
        int min = Math.min(number_a, number_b);
        int max = Math.max(number_a, number_b);
        int counter = 0;
        boolean result = true;
        BLOCK:
        for (int i = min; i <= max; i++) {
            counter = 0;
             for (int j = 1; j <= min; j++) {
                if (i % j == 0) {
                    counter++;
                }

            }
            if (counter > 2) {
                System.out.print(i);
                result = false;
                break BLOCK;
            }
        }
        if (result == true){
            System.out.print("NO");
        }

    }
}
