/*
Пользователь вводит целое неотрицательное число. Нужно вывести "YES", если это число простое и "NO",
если оно простым не является.
Простым называется число, которое делится нацело только на единицу и на себя. Единица не является простым числом.
Тестовые данные
Sample Input 1:
13
Sample Output 1:
YES
Sample Input 2:
1
Sample Output 2:
NO
 */
import java.util.Scanner;
public class Task_22 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int num = scan.nextInt();
        if (num==1){
            System.out.println("NO");
            return;
        }
        for (int i=2; i<=num; i++){
            if (num%i==0 && i!=num){
                System.out.println("NO");
                break;}
            if (num%i==0 && i==num){
                System.out.println("YES");
                break;}


        }
    }
}
