/*
Массив целых неотрицательных чисел вводится с консоли. Сначала пользователь вводит количество
элементов массива, а потом сами элементы.
Найти последний минимальный элемент и заменить его  на -1.
Преобразованный массив вывести на консоль, отделяя элементы пробелами.

Тестовые данные
Sample Input:
8
2 11 2 15 6 2 20 7
Sample Output:
2 11 2 15 6 -1 20 7
 */


/*import java.util.Scanner;

public class Task_36 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num_iteration = scan.nextInt(); //пользователь вводит количество элементов массива.
        average(num_iteration);
    }

    public static void average(int num_iteration) {
        Scanner scan = new Scanner(System.in);
        int[] a = new int[num_iteration];
        for (int i = 0; i < a.length; i++) {
            a[i] = scan.nextInt();
        }
        int min = a[0];
        int imin = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] <= min) {
                imin = i;
            }
        }
        a[imin] = -1;
        for (int v : a){
            System.out.print(v+" ");
        }
    }
}*/
import java.util.Scanner;
public class Task_36 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num_iteration = scan.nextInt(); //пользователь вводит количество элементов массива.
        int[] a = new int[num_iteration];
        for (int i = 0; i < a.length; i++) {
            a[i] = scan.nextInt();
        }
        int min = a[0];
        int imin = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] <= min) {
                imin = i;
            }
        }
        a[imin] = -1;
        for (int v : a) {
            System.out.print(v + " ");
        }
    }
}


