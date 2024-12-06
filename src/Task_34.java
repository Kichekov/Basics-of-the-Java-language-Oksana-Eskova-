/*
Массив из целых чисел заполнить случайными значениями от -5 до 5 (включая обе границы) Пользователь
вводит размер массива, а затем начальное значение генератора случайных чисел.
- Вывести исходный массив на консоль в одной строке, разделяя элементы пробелами.
  Пробел должен быть в том числе и после последнего элемента массива.
- Найти сумму положительных элементов массива и произведение отрицательных элементов.
  Произведение быстро растет, поэтому оно должно иметь тип double.

C новой строки вывести результаты программы через пробел (сначала сумму, а потом произведение).

Тестовые данные
Sample Input:

10 7
Sample Output:

-3 5 5 -3 1 -1 0 2 5 5
23 -9.0

 */

import java.util.Scanner;
import java.util.Random;

public class Task_34 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt(); //Пользователь вводит размер массива
        int[] a = new int[size];
        int start = scan.nextInt();//Пользователь вводит начальное значение генератора случайных чисел.
        Random rand = new Random(start);
        int sum = 0;
        long pr = 1;
        for (int i = 0; i < a.length; i++) {
            a[i] = rand.nextInt(-5, 6);
            System.out.print(a[i] + " ");
            if (a[i] > 0) {
                sum += a[i];
            }
            else if (a[i]<0){
                pr *= a[i];
            }
        }
        System.out.println();
        System.out.print(sum+" "+(double)pr);
    }
}
