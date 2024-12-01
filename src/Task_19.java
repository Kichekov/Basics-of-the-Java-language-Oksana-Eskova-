/*
Пользователь вводит ширину треугольника. Нарисовать треугольник из звездочек,
как показано в примерах теста.
Если вводятся некорректные данные (ширина  <= 0), то вывести "ERROR".
Р.S. В конце каждой строки невидимых пробелов нет! (Перевод курсора сразу после звездочек).
Тестовые данные
Sample Input 1:
7
Sample Output 1:

*******
 *****
  ***
   *
Sample Input 2:
4
Sample Output 2:

****
 **

 */

import java.util.Scanner;

public class Task_19 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double width = scan.nextDouble();
        if (width<0){
            System.out.print("ERROR");
            return;
        }
        double str = Math.round(width / 2);
        int prob = 0;
        for (int i = 0; i < str; i++) {
            for (int j = 0; j < prob; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < width; j++) {
                System.out.print("*");
            }
            width -= 2;
            prob++;
            System.out.println();
        }

    }
}
