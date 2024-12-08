/*
Пользователь вводит количество строк и столбцов двумерного массива, а затем начальное значение
 генератора случайных чисел. Создать целочисленный массив указанной размерности и инициализировать
  его случайными числами от -5 до 4 (включительно). Массив вывести на консоль в виде таблицы, элементы
   которой отделяются знаками табуляции. Знак табуляции должен быть и  в конце каждой строки.
Найти максимальный элемент и подсчитать, сколько раз он встречается в массиве. Вывести максимальный элемент
и найденное количество с  новой строки через пробел.
Тестовые данные
Sample Input:

4 5 100
Sample Output:

0	-5	-1	3	-4
1	1	3	-2	-2
-3	2	1	2	-3
4	-5	3	-2	4
4 2
 */

import java.util.Random;
import java.util.Scanner;

public class Task_42 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int stroki = scan.nextInt();// Пользователь вводит количество строк;
        int stolb = scan.nextInt();//Пользователь вводит количество столбцов двумерного массива;
        int start = scan.nextInt();//Пользователь вводит начальное значение генератора случайных чисел;
        Random rand = new Random(start);
        int maxNum =0;

        int[][] arr = new int[stroki][stolb];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = rand.nextInt(-5, 5);
                if (arr[i][j] > maxNum) {
                    maxNum = arr[i][j];
                }
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == maxNum) {
                    count++;
                }

            }
        }

        System.out.println(maxNum + " " + count);
    }
}
