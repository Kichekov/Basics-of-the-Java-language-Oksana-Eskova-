/*
Требуется найти среднюю оценку за экзамен для группы студентов.
Заранее число студентов группы неизвестно. Оценки вводятся с клавиатуры
до тех пор, пока не будет введено отрицательное число.

Результат должен быть округлен до одного знака после десятичной точки.
Программа содержит ошибки. Скопируйте ее в Intellij Idea и воспользуйтесь
 отладчиком. Исправленную программу введите в поле для ответа.
 */
import java.util.Scanner;

public class Task_15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int grade, k = 0, sum = 0;
        double sred;
        grade = scan.nextInt();
        while (grade >= 0) {
            sum += grade;
            k++;
            grade = scan.nextInt();
        }
        if (k > 0) {
            sred = (double) sum / k;
            System.out.printf("%.1f",sred);
        } else {
            System.out.println("No data");
        }
    }
}
