/*
Напишите статический  метод printDivider(), который выводит все делители натурального числа
через пробел (включая единицу и само число). Метод не возвращает никакого значения!
Пример использования этого метода в main() менять нельзя!
Тестовые данные
Sample Input:
246
Sample Output:
1 2 3 6 41 82 123 246
 */

import java.util.Scanner;

public class Task_29 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        printDivider(number);
    }

    // put your code here
    static void printDivider(int num) {
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) System.out.print(i + " ");
        }
    }
}
