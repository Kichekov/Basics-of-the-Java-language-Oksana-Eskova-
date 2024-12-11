/*
Напишите четыре статических метода  для работы с одномерным массивом целых чисел:
1) init()  - заполнение массива случайными числами от -3 до 5 (включительно);
2) print() - вывод массива на консоль в строку, отделяя элементы пробелами;
3) findMax() - поиск индекса первого максимального элемента в одномерном массиве.
4) reduceAfterMax() - создает новый массив, удаляя все элементы после первого максимума.
Первые три метода уже были созданы на шаге 2.
В main() пользователь вводит количество элементов одномерного массива и начальное значение генератора
случайных чисел.
 Выводится на консоль сформированный массив, и затем с новой строки  - сформированный массив с
  удаленной частью.
Код метода main() менять нельзя!

Тестовые данные
Sample Input:

10 99
Sample Output:

1 2 3 3 0 5 4 5 2 5
1 2 3 3 0 5
 */

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class Task_47 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] ar = new int[scan.nextInt()];
        long seed = scan.nextLong();
        init(ar, seed);
        print(ar);
        //reduceAfterMax(ar);
        int[] b = reduceAfterMax(ar);
        print(b);
    }


    public static void init(int[] ar, long seed) {//заполнение массива случайными числами от -3 до 5 (включительно);
        Random rand = new Random(seed);
        for (int i = 0; i < ar.length; i++) {
            ar[i] = rand.nextInt(-3, 6);
        }
    }

    public static void print(int[] ar) { // Выводится на консоль сформированный массив
        for (int num : ar) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    private static int findMax(int[] ar) {
        int find = 0;
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] > ar[find]) {
                find = i;
            }
        }
        return find + 1;
    }

    public static int[] reduceAfterMax(int[] ar) {

        int find = findMax(ar);

        int[] c = Arrays.copyOf(ar, find);
        return c;
    }
}

