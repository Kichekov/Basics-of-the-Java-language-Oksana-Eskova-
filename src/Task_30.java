/*
Напишите статический метод maxNumberDivider(), который в заданном диапазоне находит первое число с наибольшим
 количеством делителей.
Метод main() менять нельзя!
Совет: сделайте отдельный  метод, который подсчитывает количество делителей числа, а затем вызывайте его в
 методе maxNumberDivider().
 Тестовые данные
Sample Input:
530 545
Sample Output:
540
 */

import java.util.Scanner;

public class Task_30 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int max = maxNumberDivider(a, b);
        System.out.println(max);
    }

    // put your code here
    static int maxNumberDivider(int a, int b) {
        int max = 0;
        int imax = 0;
        for (int i = a; i <= b; i++) {
            if (delit(i) > max) {
                max = delit(i);
                imax = i;
            }
        }
        return imax;
    }

    static int delit(int number) {
        int counter = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) counter++;
        }
        return counter;
    }
}

