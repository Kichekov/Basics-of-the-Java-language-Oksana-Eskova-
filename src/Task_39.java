/*
Пользователь вводит размер массива и начальное значение генератора случайных чисел.
Создать массив  чисел типа double заданного размера и заполнить его случайными числами от 0 до 2
 (не включая). Распечатать исходный массив, используя метод toString() - в квадратных скобках, элементы
  через запятую.
С новой строки вывести на консоль сумму максимального и минимального элементов массива.
Тестовые данные
Sample Input:

5 25
Sample Output:

[1.4631897195641836, 0.10745131965527377, 1.2906709676610488, 0.14895347726291952, 0.012141832026828503]
1.4753315515910121
 */

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task_39 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();//Пользователь вводит размер массива;
        int[] a = new int [size];
        int start = scan.nextInt();
        Random rand = new Random(start);


    }
}
