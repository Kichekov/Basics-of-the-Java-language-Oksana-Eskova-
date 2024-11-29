/*
Программа должна определить зарплату служащего компании.
Пользователь вводит количество отработанных часов (целое) и почасовой тариф
 (вещественное). Компания платит обычный тариф за первые 20 часов (включительно),
  полуторный тариф за время, отработанное от 20 (не включая) до 40 часов (включительно),
   и двойной тариф за время свыше 40 часов.
Например, если служащий отработал 42 часа, а почасовой тариф 10.5 рублей, то он получит
20*10.5=210 рублей за первые 20 часов;
20*10.5*1.5=315 рублей за вторые 20 часов;
2*10.5*2=42 рубля за последние 2 часа.
Итого 210+315+42=567 рублей.

Вывести зарплату служащего, округлив ее до двух знаков после десятичной точки.
Если введено отрицательное значение количества часов или отрицательный тариф,
 вывести ERROR.

Тестовые данные
Sample Input:

42 10.5
Sample Output:

567.00
 */

import java.util.Scanner;

public class Task_5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double HoursWorked = scan.nextDouble();
        double rate = scan.nextDouble();
        int hours = 20;
        double sum = 0;
        if (HoursWorked < 0) {
            System.out.println("ERROR");
            return;
        }
        if (rate < 0) {
            System.out.println("ERROR");
            return;
        }
        if (HoursWorked < 20) {
            sum = HoursWorked * rate;
        }
        if (HoursWorked > 20 && HoursWorked < 40) {
            sum = (20 * rate) + (HoursWorked - 20) * rate * 1.5;
        }
        if (HoursWorked > 40) {
            sum = (20 * rate) + (20 * rate * 1.5) + ((HoursWorked - 40) * rate * 2);
        }
        System.out.printf("%.2f", sum);
    }
}
