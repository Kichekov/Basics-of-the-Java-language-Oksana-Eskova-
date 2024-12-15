/*
Напишите метод primer(), который принимает два целых числа и возвращает строку,
представляющую собой пример на сложение (см. тест). Используйте для формирования
 результата StringBuilder!

Исходный код метода main менять нельзя!

Тестовые данные
Sample Input:

8 11
Sample Output:

8 + 11 = 19
 */



import java.util.Scanner;

public class Task_59 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        String str = primer(a, b);
        System.out.println(str);
    }
    public static String primer( int a, int b){
        StringBuilder sum = new StringBuilder();
        sum.append(a).append(" + ").append(b).append(" = ").append(a+b);
        return sum.toString();
    }
}