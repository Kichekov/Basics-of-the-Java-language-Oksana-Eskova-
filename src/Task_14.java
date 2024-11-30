/*
Выполните задачу с использованием цикла do-while.
Пользователь вводит произвольное целое число (оно может быть отрицательным).
 Найдите количество цифр в числе и сумму цифр.
Выведите через пробел сначала количество, а потом сумму цифр.
Тестовые данные
Sample Input 1:

4579
Sample Output 1:

4 25
Sample Input 2:

0
Sample Output 2:

1 0

 */
import java.util.Scanner;

public class Task_14 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int number = scan.nextInt();
        number=Math.abs(number);
        int counter=0;
        int summa=0;

        do{
            counter++;
            summa+=number%10;
            number/=10;

        }while(number!=0);
        System.out.println(counter+" "+summa);

    }
}
