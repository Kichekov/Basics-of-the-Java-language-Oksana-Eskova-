/*
Пользователь вводит высоту треугольника. Нарисовать треугольник из звездочек,
как показано в примере теста.
Если вводятся некорректные данные (высота  <= 0), то вывести "ERROR".
Тестовые данные
Sample Input:

5
Sample Output:

*****
 ****
  ***
   **
    *

 */

import java.util.Scanner;

public class Task_18 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int height = scan.nextByte();
        if (height <= 0) {
            System.out.print("ERROR");
            return;
        }
        int prob = 0;
        for (int i = 0; i < height; i++) {
            for (int k = 0; k < prob; k++) {
                System.out.print(' ');
            }
            for (int j = i + 1; j <= height; j++) {
                System.out.print("*");
            }
            System.out.println();
            prob++;
        }
    }
}

