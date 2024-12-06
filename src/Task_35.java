/*
Массив из вещественных чисел типа double заполнить случайными значениями от 0 до 5 (не включая).
 Пользователь вводит размер массива, а затем начальное значение генератора случайных чисел.
Вывести исходный массив на консоль в одной строке, разделяя элементы пробелами. Пробел должен быть в
 том числе и после последнего элемента массива.
Найти среднее арифметическое элементов массива и вывести его с новой строки.  Заменить все элементы
  больше среднего его значением.
C новой строки вывести преобразованный массив. Элементы отделяются пробелами.
Все вещественные числа при выводе округляются до двух знаков после десятичной точки.
Тестовые данные
Sample Input:
10 45
Sample Output:
3.63 4.35 1.50 3.77 1.29 3.07 2.09 4.80 4.70 3.77
3.30
3.30 3.30 1.50 3.30 1.29 3.07 2.09 3.30 3.30 3.30

 */

import java.util.Scanner;
import java.util.Random;
public class Task_35 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();// Пользователь вводит размер массива.
        int start = scan.nextInt();//Пользователь вводит начальное значение генератора случайных чисел.
        Random rand = new Random(start);
        double[] a = new double [size];
        double sum = 0;
        for (int i = 0; i<a.length; i++){
            a[i] = rand.nextDouble(5);
            sum +=a[i];
            System.out.printf("%.2f ", a[i]);
        }
        double sred = sum/size;
        System.out.println();
        System.out.printf("%.2f", sred);
        System.out.println();
        for (int i = 0; i<a.length; i++){
            if (a[i]>sred){
                a[i] = sred;
            }
        }
        for (double v : a) {
            System.out.printf("%.2f ", v);
        }

    }
}
