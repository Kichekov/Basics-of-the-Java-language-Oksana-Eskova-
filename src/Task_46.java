/*
Напишите три статических метода для работы с двумерным массивом:

1) initArray() - инициализирует двумерный массив случайными целыми числами от 0 до 10 (включительно);
2) printArray() - выводит двумерный массив на консоль в виде таблицы (элементы строках отделяются
 знаками табуляции, и знак табуляции должен быть в конце каждой строки)
3)  printMaxIndex() - для каждой строки двумерного массива выводит индекс столбца первого максимального
 элемента. Элементы отделяются пробелами.
 В методе main() вводятся три целых числа: количество строк и количество столбцов массива,
 а затем начальное значение генератора случайных чисел.
Двумерный массив создается и выводится, а затем выводятся индексы максимальных элементов.
Код метода main() менять нельзя!
P.S. Желательно при реализации метода printMaxIndex() использовать вызов метода findMax(),
 который был написан на предыдущем шаге.

Тестовые данные
Sample Input:

3 4 88
Sample Output:

1	10	2	8
9	8	2	9
3	2	9	0

1 0 2

 */


import java.util.Random;
import java.util.Scanner;

public class Task_46 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] mas = new int[scan.nextInt()][scan.nextInt()];
        long seed = scan.nextLong();
        initArray(mas, seed);
        printArray(mas);
        System.out.println();
        printMaxIndex(mas);
    }

    public static void initArray(int[][] mas, long seed) {
        Random rand = new Random(seed);
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                mas[i][j] = rand.nextInt(11);
            }
        }
        System.out.println();
    }

    public static void printArray(int[][] mas) {
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                System.out.print(mas[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void printMaxIndex(int[][] mas) {

        for (int i = 0; i < mas.length; i++) {
            int imax = 0;
            for (int j = 0; j < mas[i].length; j++) {
                if (mas[i][j] > mas[i][imax]) {
                    imax = j;
                }
            }
            System.out.print(imax + " ");
        }
    }
}
