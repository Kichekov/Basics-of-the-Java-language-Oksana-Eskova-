/*
Пользователь вводит размер массива и начальное значение генератора случайных чисел.
Создать массив  целых чисел заданного размера и заполнить его случайными числами от 10 до 20 (включительно).
Распечатать исходный массив, используя метод toString() - в квадратных скобках, элементы через запятую.
Затем вводятся два индекса (индексы в тестах корректные). Отсортировать по возрастанию часть массива между
 двумя этими индексами (включая оба).
С новой строки вывести преобразованный массив на консоль методом toString().
Тестовые данные
Sample Input:

10 85
1 4
Sample Output:

[20, 14, 10, 19, 18, 18, 20, 20, 16, 11]
[20, 10, 14, 18, 19, 18, 20, 20, 16, 11]
 */

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task_40 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();//Пользователь вводит размер массива.
        int[] a = new int[size];
        int start = scan.nextInt();//Пользователь вводит начальное значение генератора случайных чисел.
        //вводятся два индекса
        int x = scan.nextInt();
        int y = scan.nextInt();
        Random rand = new Random(start);
        for (int i = 0; i<a.length; i++){
            a[i] = rand.nextInt(10,21);
        }
        String srt = Arrays.toString(a);
        System.out.println(srt);
        Arrays.sort(a,x,y+1);
        System.out.println(Arrays.toString(a));

    }
}
