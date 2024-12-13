/*
Введите строку (в ней возможны пробелы). Замените в ней каждый символ «;»
  на пару символов «.,»
Тестовые данные
Sample Input:

hello;; by!; ;;
Sample Output:

hello.,., by!., .,.,
 */

import java.util.Scanner;
public class Task_50 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        String str = scan.nextLine();
        String s= ";";
        String f= ".,";
        String changed = str.replaceAll(s, f);
        System.out.print(changed);

    }
}
