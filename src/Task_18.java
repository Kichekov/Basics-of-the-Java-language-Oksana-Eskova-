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
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < i; j++) {

            }

        }


    }
}
