/*
Пользователь вводит строку из слов, разделенных пробелами.  Заменить все слова, которые
 содержат букву z на слово "ERROR". Также удалить все лишние пробелы в начале и в конце
 строки. Между словами оставить ровно один пробел.
Тестовые данные
Sample Input:
   mama   zlobno   myla    puzzle  and    ramy

Sample Output:
mama ERROR myla ERROR and ramy
 */
import java.util.Scanner;

public class Task_57 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        str = str.trim();
        String[] arr = str.split(" +");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].contains("z")) {
                arr[i] = "ERROR";
            }
            sb.append(arr[i]).append(" ");

        }
        System.out.println(sb);
    }
}
