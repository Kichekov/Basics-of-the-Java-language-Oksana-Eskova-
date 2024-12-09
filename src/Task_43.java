/*
Пользователь вводит количество строк и столбцов двумерного массива, а затем начальное значение
 генератора случайных чисел. Создать массив целых чисел указанной размерности и инициализировать
  его случайными числами от -10 до 10 (включительно). Массив вывести на консоль в виде таблицы,
  элементы которой отделяются знаками табуляции. Знак табуляции должен быть и  в конце каждой строки.
Вывести пустую строку после двумерного массива.
Для каждого столбца найти сумму положительных элементов и вывести на консоль, отделяя пробелами.

Тестовые данные
Sample Input:

4 5 89
Sample Output:

-3	-9	8	-6	2
9	1	-4	-4	-5
-10	5	-6	3	-3
-2	7	-4	1	-4

9 13 8 4 2

 */

import java.util.Random;
import java.util.Scanner;

public class Task_43 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int lines = scan.nextInt();// Пользователь вводит количество строк;
        int table = scan.nextInt();//Пользователь вводит количество столбцов двумерного массива;
        int start = scan.nextInt();//Пользователь вводит начальное значение генератора случайных чисел;
        Random rand = new Random(start);
        int[][] arr = new int[lines][table];
        //4 строки 5 столбцов
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j< arr[i].length; j++){
                arr[i][j] = rand.nextInt(-10,11);
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
        for (int i = 0; i < 4; i++){
            int sum = 0;
            for (int j = 0; j < 4; j++){
                sum+=arr[j][i];
                System.out.println(arr[j][i] + "\t");
            }
            System.out.println();
        }
    }
}
