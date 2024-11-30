/*
Пользователь вводит  высоту  и ширину рамки через пробел. Нарисовать рамку из звездочек.
Если вводятся некорректные данные (высота или ширина <= 0), то вывести "ERROR".
P.S. Пустые места внутри рамки - это пробелы.
Тестовые данные
Sample Input 1:
5 4
Sample Output 1:
****
*  *
*  *
*  *
****
Sample Input 2:
-1 5
Sample Output 2:
ERROR
Sample Input 3:
1 2
Sample Output 3:
**
 */

import java.util.Scanner;

public class Task_17 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int width = scan.nextInt();
        int height = scan.nextInt();
        if (width<0||height<0) {
            System.out.print("ERROR");
            return;
        }
        for (int i = 0; i < width; i++) {

            for (int j = 0; j < height; j++) {
                if (i == 0 || i == width - 1) {
                    System.out.print("*");
                }
                if (i != 0 && i != width - 1) {
                    if (j == 0 || j == height - 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
}
