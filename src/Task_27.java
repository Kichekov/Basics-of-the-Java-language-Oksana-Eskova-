/*
Напишите статический метод isPrime(), который возвращает true, если аргумент является простым числом,
 и false - в противном случае.
Простым называется целое положительное число, которое не имеет других делителей, кроме единицы и себя самого.
Отрицательные числа не могут быть простыми (поэтому функция должна возвращать false).
 Простыми также не являются числа 0 и 1.

В методе main продемонстрировано использование метода isPrime(). Этот код менять нельзя!
Тестовые данные
Sample Input:
1 13 23 67 10
Sample Output:
false true true true false

 */

import java.util.Scanner;

public class Task_27 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            int number = scan.nextInt();
            System.out.print(isPrime(number) + " ");
        }
    }
    // put your code here
    static boolean isPrime(int number) {
        if (number <= 0) {
            return false;
        }
        int counter = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                counter++;
            }
        }
        if (counter == 2) {
            return true;
        }
        return false;
    }
}
