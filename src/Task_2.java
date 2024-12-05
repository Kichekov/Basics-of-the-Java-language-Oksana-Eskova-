/*
Пользователь вводит целое трехзначное число. Вывести сумму его нечетных цифр.

Если число не является трехзначным, вывести "ERROR".

Если нечетных цифр нет, то вывести "NO".

Тестовые данные
P.S. Если число отрицательное, то знак нужно отбросить перед вычисление цифр.
Sample Input 1:

367
Sample Output 1:

10
Sample Input 2:

-351
Sample Output 2:

9

 */

import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int number=scan.nextInt();
        number=Math.abs(number);
        if (number<99||number>999) {
            System.out.println("ERROR");
            return;
        }
        int count=0;
        int sum=0;
        int num1=number/100;
        int num3=number%10;
        int num2=(number%100)/10;
        if (num1%2==0){
            count++;
        }
        else {
            sum+=num1;
        }
        if (num2%2==0){
            count++;
        }
        else {
            sum+=num2;
        }
        if (num3%2==0){
            count++;
        }
        else {
            sum+=num3;
        }
        if (count==3){
            System.out.println("NO");
            return;
        }
        else {
            System.out.println(sum);
        }
    }
}
