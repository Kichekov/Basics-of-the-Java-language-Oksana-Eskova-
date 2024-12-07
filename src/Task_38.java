/*
Пользователь вводит размер массива и начальное значение генератора случайных чисел.
Затем он вводит контрольный элемент (целое число).
Создать массив заданного размера и заполнить его случайными числами от 2 до 15 (включительно).
 Отсортировать массив по возрастанию. Распечатать отсортированный массив, используя метод toString()
  - в квадратных скобках, элементы через запятую.
Найти в отсортированном массиве индекс контрольного элемента и удалить все элементы после него
(создать новый массив нужного размера).
Если контрольный элемент отсутствовал в массиве, то вывести "ERROR". В противном случае распечатать
 полученный массив методом toString().
Тестовые данные
Sample Input:

8 11
10
Sample Output:

[5, 6, 7, 10, 11, 13, 14, 15]
[5, 6, 7, 10]

 */
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task_38 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();//Пользователь вводит размер массива;
        int startNum = scan.nextInt(); //Пользователь вводит начальное значение генератора случайных чисел;
        int controlNum = scan.nextInt(); //Пользователь вводит контрольный элемент;
        Random rand = new Random(startNum);
        int[] a = new int[size];
        for (int i = 0; i<a.length; i++){
            a[i] = rand.nextInt(2, 16);
        }
        Arrays.sort(a);//сортировка массива;
        String str = Arrays.toString(a);// перевод массива в строку;
        System.out.println(str);
        int indControlNum = Arrays.binarySearch (a,controlNum);
        if (indControlNum<0){ //Проверка на отсутствие контрольного элемента;
            System.out.print("ERROR");
            return;
        }
        else {//если контрольный элемент найден;
            indControlNum+=1;
            int[] newA = Arrays.copyOf(a, indControlNum);
            System.out.println(Arrays.toString(newA));
        }
    }
}
