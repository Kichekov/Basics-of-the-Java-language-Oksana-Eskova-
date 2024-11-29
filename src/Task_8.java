/*
Пользователь вводит целое число - номер дня недели. Нужно вывести  "Working day",
 если это рабочий день,  "Saturday" - если суббота, и "Sunday" - если воскресенье.
 При неправильном номере дня недели  выводится "ERROR".
Используйте оператор switch. Нумерация дней недели  - с понедельника (номер 1).
Тестовые данные
Sample Input:

3
Sample Output:

Working day

 */

import java.util.Scanner;

public class Task_8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int day = scan.nextInt();
        switch (day) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Working day");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("ERROR");
                break;
        }

    }
}

