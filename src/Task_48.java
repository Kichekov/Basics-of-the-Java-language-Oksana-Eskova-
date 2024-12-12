/*
Напишите три статических метода для работы с двумерным массивом целых чисел:
1) initArray() - инициализирует двумерный массив случайными числами от 0 до 10 (включительно);
2) printArray() - выводит двумерный массив на консоль в виде таблицы (элементы строках отделяются
знаками табуляции, и знак табуляции должен быть в конце каждой строки)
3)  deleteRow() - создает новый двумерный массив из исходного (первый параметр метода),
 удаляя строку, индекс которой передается в качестве второго параметра. Если индекс неверный
  (отрицательный или больше последнего индекса строк), то возвращает исходный массив без изменений.
В методе main() вводятся четыре целых числа: количество строк и количество столбцов массива,
 начальное значение генератора случайных чисел и индекс строки для удаления.
Двумерный массив создается и выводится в виде таблицы. Затем выводится новый массив.
Код метода main() менять нельзя!
Тестовые данные
Sample Input:
4 3 77 2
Sample Output:

9	6	7
9	4	2
6	5	5
6	0	9

9	6	7
9	4	2
6	0	9
 */

import java.util.Scanner;
import java.util.Random;

public class Task_48 {
public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int[][] mas = new int[scan.nextInt()][scan.nextInt()];
    long seed = scan.nextLong();
    int ind = scan.nextInt();
    initArray(mas, seed);
    printArray(mas);
    System.out.println();
    mas = deleteRow(mas, ind);
     printArray(mas);
}

    public static void initArray(int[][] mas, long seed) {
        Random rand = new Random(seed);
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                mas[i][j] = rand.nextInt(11);
            }
        }
    }

    public static void printArray(int[][] mas) {
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                System.out.print(mas[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static int[][] deleteRow(int[][] mas, int ind) {
        if (ind < 0 || ind >= mas.length) {
            return mas;
        }
        int[][] b = new int[mas.length - 1][];
        for (int i = 0; i < ind; i++) {//переписываем все до k-й строки
            b[i] = mas[i];
        }
        for (int i = ind + 1; i < mas.length; i++) { //переписываем от k-й строки до конца
            b[i - 1] = mas[i];
        }
        return b;
       }
}
