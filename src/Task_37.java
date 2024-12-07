/*
Массив из целых чисел заполнить случайными значениями от -5 до 15 (включая обе границы)
Пользователь вводит размер массива, а затем начальное значение генератора случайных чисел.
Вывести исходный массив на консоль в одной строке, разделяя элементы пробелами. Пробел должен
 быть в том числе и после последнего элемента массива.
Поменять местами первый максимальный и последний отрицательный элементы.
 Если отрицательных элементов нет в массиве, то он должен остаться без изменения.
C новой строки вывести измененный массив, отделяя элементы пробелами.
Тестовые данные
Sample Input:

10 77
Sample Output:

7 -5 -1 5 -3 8 2 -1 -3 -3
7 -5 -1 5 -3 -3 2 -1 -3 8

 */

import java.util.Scanner;
import java.util.Random;

public class Task_37 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt(); //пользователь вводит количество элементов массива.
        int[] a = new int[size];
        int start = scan.nextInt();//начальное значение генератора случайных чисел.
        Random rand = new Random(start);
        for (int i = 0; i < a.length; i++) {
            a[i] = rand.nextInt(-5, 16);
        }
        int max = a[0];
        int min = a[0];
        int imin = -1;
        int imax = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
                imax = i;
            }
            if (a[i] < 0) {
                min = a[i];
                imin = i;
            }

            System.out.print(a[i] + " ");
        }
        System.out.println();
        //System.out.println("max "+max+"  "+"imax "+ imax);
        //System.out.println("min "+min+"  "+"imin "+ imin);
        if (imin == -1) {
            for (int num : a) {
                System.out.print(num + " ");
            }
        } else {
            int temp = a[imax];
            a[imax] = a[imin];
            a[imin] = temp;
            for (int num : a) {
                System.out.print(num + " ");
            }
        }
    }

}

