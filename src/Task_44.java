/*
Пользователь вводит количество строк и столбцов двумерного массива, а затем начальное значение
генератора случайных чисел. Создать массив целых чисел указанной размерности и инициализировать его
случайными числами от -10 до 10 (включительно). Массив вывести на консоль в виде таблицы, элементы которой
отделяются знаками табуляции. Знак табуляции должен быть и  в конце каждой строки.

В каждой строке найти первый отрицательный элемент и вывести индекс соответствующего столбца или слово "NO",
 если он отсутствует.

Тестовые данные
Sample Input:

4 3 100
Sample Output:

6	0	-6
2	-9	-4
7	7	3
0	-9	-8
2
1
NO
1
 */
import java.util.Random;
import java.util.Scanner;

public class Task_44 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int lines = scan.nextInt();// Пользователь вводит количество строк;
        int table = scan.nextInt();//Пользователь вводит количество столбцов двумерного массива;
        int start = scan.nextInt();//Пользователь вводит начальное значение генератора случайных чисел;
        Random rand = new Random(start);
        int[][] arr = new int[lines][table];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = rand.nextInt(-10, 11);
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }

        for (int i = 0; i < arr.length; i++) {
            int iminus = -1;
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] < 0) {
                    iminus = j;
                    break;
                }
            }
            if (iminus == -1) {
                System.out.println("NO");
            } else {
                System.out.println(iminus);
            }

        }
    }
}
