/*
Напишите две перегрузки статического  метода square() для вычисления площади прямоугольника.
В одном случае в метод передаются две стороны прямоугольника, а в другом - одна сторона квадрата
(все - вещественные числа).
В методе main() вводится сначала целое число:
1 означает, что нужно вычислить площадь квадрата. И затем следует ввод одного вещественного числа
(стороны квадрата)
2 означает, что нужно вычислить площадь прямоугольника. Затем следует ввод двух сторон прямоугольника.
Выводимую площадь нужно представить с двумя знаками после десятичной точки.

Тестовые данные
Sample Input 1:

2 4.4 3.2
Sample Output 1:

14.08
Sample Input 2:

1 5.5
Sample Output 2:

30.25

 */

import java.util.Scanner;

public class Task_32 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int var = scan.nextInt();
        double a, b;
        if (var == 1) {
            a = scan.nextDouble();
            System.out.printf("%.2f", square(a));
        } else if (var == 2) {
            a = scan.nextDouble();
            b = scan.nextDouble();
            System.out.printf("%.2f", square(a, b));
        }


    }
    static double square(double a) {
        return a * a;
    }

    static double square(double a, double b) {
        return a * b;
    }
}
