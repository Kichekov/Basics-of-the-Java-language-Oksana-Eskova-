/*
Вывести на экран таблицу умножения от 1 до k.  Значение k (0<k<10) вводит пользователь.

Элементы таблицы отделять знаком табуляции (знак табуляции должен быть также и в конце каждой строки).

Тестовые данные
Sample Input:

5
Sample Output:

1	2	3	4	5
2	4	6	8	10
3	6	9	12	15
4	8	12	16	20
5	10	15	20	25

 */
import java.util.Scanner;

public class Task_20 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        for (int i = 1; i <= num; i++) {
            System.out.print(i + "\t");
            for (int j = 1; j <= num; j++) {
                System.out.print(i * j  + "\t");
            }
            System.out.println();
        }

    }
}
