
/*
Напишите метод, который проверяет, что строка является адресом почты gmail.com
 (т.е. в конце строки "@gmail.com", знак @ только один, и имя пользователя перед @ не пусто)).
Метод main()  менять нельзя!
Тестовые данные
Sample Input 1:
petr.ivanov@gmail.com
Sample Output 1:
YES
Sample Input 2:
ivanov@petr@gmail.com
Sample Output 2:
NO

 */
import java.util.Scanner;
public class Task_52 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        if (isGMailAddress(str)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
    private static boolean isGMailAddress(String str) {
       boolean result = true;
        if (str.indexOf('@')==0) return false;
        String adr = str.substring(str.indexOf('@'));
        if (adr.equals("@gmail.com")==false){
           return false;
       }
       return result;
    }
}



