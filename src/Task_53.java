/*
Напишите статический метод, который проверяет, есть ли в конце строки подстрока ".com".
 Если да, то он возвращает часть строки без этого фрагмента. Если нет, то он возвращает строку
  без изменения.

Тестовые данные
Sample Input 1:

intel.com.think.com
Sample Output 1:

intel.com.think
Sample Input 2:

stepik.org
Sample Output 2:

stepik.org

 */

import java.util.Scanner;

public class Task_53 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        System.out.println(delCom(str));
    }
    // put your code here
    public static String delCom(String str){
        String com = str.substring(str.length()-4);
        String result = str;
        if (com.equals(".com")){
            result = str.substring(0,str.length()-4);
        }
        return result;
    }
}


