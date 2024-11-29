/*
Грузовой самолет должен пролететь с грузом из пункта А в пункт С через пункт В.
Емкость бака для топлива у самолета – 300 литров. В точке А бак заправляют полностью.
 Потребление топлива на 1 км в зависимости от веса груза у самолета следующее:
          - до 500 кг  (включительно) :    1 литров / км
          - до 1000 кг (включительно):   4 литров / км
          - до 1500 кг (включительно):   7 литров / км
          - до 2000 кг (включительно):   9 литров / км.
          - более 2000 кг – самолет не поднимает.
Пользователь вводит расстояние между пунктами А и В,  расстояние между пунктами В и С,
а также вес груза. Программа должна рассчитать какое минимальное количество топлива
необходимо для дозаправки самолету в пункте В, чтобы долететь из пункта А в пункт С.
В случае невозможности преодолеть любое из расстояний – программа должна вывести ERROR.
Числовой результат работы программы округляется до двух знаков после десятичной точки.

Тестовые данные
Sample Input 1:

200 200 300
Sample Output 1:

100.00
Sample Input 2:

136 268 600
Sample Output 2:

ERROR
 */

import java.util.Scanner;

public class Task_6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double distanceA = scan.nextDouble();//расстояние А
        double distanceB = scan.nextDouble();//расстояние Б
        double cargo = scan.nextDouble();//вес груза
        int tankAir = 300;//объем бака
        double expend = 1;//расход топлива


        if (cargo > 500 && cargo < 1000) {
            expend = 4;
        }
        if (cargo > 1000 && cargo < 1500) {
            expend = 7;
        }
        if (cargo > 1500 && cargo < 2000) {
            expend = 9;
        }
        if (cargo >= 2500) {
            System.out.println("ERROR");
            return;
        }
        if (distanceA * expend > tankAir) {
            System.out.println("ERROR");
            return;
        }
        if (distanceB * expend > tankAir) {
            System.out.println("ERROR");
            return;
        } else {
            tankAir -= distanceA * expend;

            if (((distanceB - tankAir) * expend > 300)) {
                System.out.println("ERROR");
                return;
            } else {
                double dozapr = distanceB * expend - tankAir;
                if (dozapr < 0) {
                    dozapr = 0;
                }
                System.out.printf("%.2f", dozapr);
            }

        }


    }
}

