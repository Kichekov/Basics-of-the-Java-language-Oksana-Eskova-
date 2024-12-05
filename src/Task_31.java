/*
Напишите статический метод printTriangle(), который выводит на консоль треугольник, показанный в примерах тестов.
Параметрами метода являются ширина основания и символ, которым рисуется треугольник.
В конце каждой строки нет невидимых пробелов, курсор переводится сразу после последнего символа.
Также напишите метод main(), в котором вводятся с консоли ширина треугольника и символ, а затем вызывается метод
 printTriangle().
Совет. В классе Scanner нет метода для ввода отдельного символа. Можно ввести данные как строку, а потом взять первый
символ этой строки:

String str = scan.next();
char sim = str.charAt(0);
Тестовые данные
Sample Input 1:

7 #
Sample Output 1:

   #
  ###
 #####
#######
Sample Input 2:

4 $
Sample Output 2:

 $$
$$$$
 */


import java.util.Scanner;

public class Task_31 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int width = scan.nextInt();
        String str = scan.next();
        char sim = str.charAt(0);
        printTriangle(width, sim);
    }

    static void printTriangle(int width, char sim) {
        int r;
        if (width % 2 == 0) {
            r = 2;
        } else {
            r = 1;
            width += 1;
        }
        int prob = ((width - 1) / 2);
        for (int i = 0; i < Math.floor(width / 2.0); i++) {
            for (int x = 0; x < prob; x++) {
                System.out.print(" ");
            }
            for (int j = 0; j < r; j++) {
                System.out.print(sim);
            }
            prob--;
            r += 2;
            System.out.println();
        }
    }
}
