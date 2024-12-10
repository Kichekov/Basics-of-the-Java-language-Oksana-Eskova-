/*
Напишите три статических метода  для работы с одномерным массивом целых чисел:
1) init()  - заполнение массива случайными числами от -3 до 5 (включительно);
2) print() - вывод массива на консоль в строку, отделяя элементы пробелами;
3) findMax() - поиск индекса первого максимального элемента в одномерном массиве.
Пользователь вводит количество элементов одномерного массива и начальное значение генератора
 случайных чисел.
Выводится на консоль сформированный массив, и затем с новой строки - найденный индекс первого
максимального элемента  в массиве.
Код метода main() менять нельзя!
Тестовые данные
Sample Input:
10 15
Sample Output:
0 -1 -2 0 -2 2 2 4 2 -2
7
 */

import java.util.Random;
import java.util.Scanner;

public class Task_45 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] ar = new int[scan.nextInt()];//Пользователь вводит количество элементов одномерного массива
        long seed = scan.nextLong();//Пользователь вводит начальное значение генератора случайных чисел.
        init(ar, seed);
        print(ar);
        int ind = findMax(ar);
        System.out.println(ind);
    }

    public static void init(int[] mas, long start) {
        Random rand = new Random(start);
        for (int i = 0; i < mas.length; i++) {
            mas[i] = rand.nextInt(-3, 6);
        }
    }
        public static void print(int[] mas) {
            for (int i = 0; i < mas.length; i++) {
                System.out.print(mas[i]+" ");
            }
            System.out.println();
        }
        public static int findMax(int[] mas){
            double max =  Double.NEGATIVE_INFINITY;
            int imax = -1;
            for (int i = 0; i < mas.length; i++) {
                if (mas[i]>max){
                    max = mas[i];
                    imax = i;

                }

            }
            return imax;
        }


    }
