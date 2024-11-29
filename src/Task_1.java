/*
Пользователь вводит координаты двух точек на плоскости
(в первой строке через пробел - координата X и координата Y первой точки,
затем во второй строке также через пробел координаты второй точки).
 Нужно определить, какая из точек ближе к началу координат.
Выводится одно из сообщений: "Первая точка ближе", "Вторая точка ближе",
"Точки на равных расстояниях".

Тестовые данные
Sample Input 1:

3.5 -1.5
2 4.8
Sample Output 1:

Первая точка ближе
Sample Input 2:

2.2 -4.1
4.1 2.2
Sample Output 2:

Точки на равных расстояниях
 */

import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    double x = scan.nextDouble();
    double y = scan.nextDouble();
    double x1 = scan.nextDouble();
    double y1 = scan.nextDouble();

    double z = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
    double z1 = Math.sqrt(Math.pow(x1, 2) + Math.pow(y1, 2));
        if(z < z1){
        System.out.println("Первая точка ближе");
        }
        else if(z > z1){
        System.out.println("Вторая точка ближе");
        }
        else if(z == z1){
        System.out.println("Точки на равных расстояниях");
        }


}
}



