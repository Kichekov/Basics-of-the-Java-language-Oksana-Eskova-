/*
Напишите статический метод simpleInRange(), который подсчитывает количество простых чисел в заданном диапазоне.
 Если границы диапазона введены неверно (первое число больше второго), то в методе нужно их переставить местами.
 В методе main продемонстрировано использование  simpleInRange() (этот код менять нельзя!)
 P. S. Используйте метод isPrime(), уже реализованный в предыдущем задании!

Тестовые данные
Sample Input 1:
1 10
Sample Output 1:
4
Sample Input 2:
20 5
Sample Output 2:
6
 */

import java.util.Scanner;

public class Task_28 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int kol = simpleInRange(a, b);
        System.out.println(kol);
    }

    // put your code here
    static boolean isPrime(int number) {
        if (number <= 0) return false;
        int counter = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) counter++;
        }
        if (counter == 2) return true;
        return false;
    }

    static int simpleInRange(int x, int y) {
        int a = Math.min(x, y);
        int b = Math.max(x, y);
        int sum = 0;
        for (int i = a; i <= b; i++) {
            if (isPrime(i)) sum++;
        }
        return sum;
    }
}
