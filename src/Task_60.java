/*
Пользователь вводит строку, в которой среди других символов содержатся символы цифр.
Сформируйте строку, которая "представляет" сумму этих цифр. Выведите полученную строку на консоль.
Если в исходной строке цифр нет, то должно быть выведено ERROR.
Р.S.  Преобразовать символ в число можно вычитанием кода символа '0'
Тестовые данные
Sample Input:

ab34c#5i02k tolkien25
Sample Output:

3+4+5+0+2+2+5=21

 */

import java.util.Scanner;
public class Task_60 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        char[] charArray = str.toCharArray();
        StringBuilder sb = new StringBuilder();
        int sum = 0;
        for (int i = 0; i < charArray.length; i++) {
            char s = charArray[i];
            String result = "" + s;
            if (result.matches("[0-9]")) {
                sb.append(result).append("+");
                int num = Integer.parseInt(result);
                sum += num;
            }
        }
        if (sb.length() == 0) {
            System.out.print("ERROR");
            return;
        }
        sb = sb.delete(sb.length() - 1, sb.length());
        sb = sb.append("=").append(sum);
        System.out.print(sb);
    }
}
