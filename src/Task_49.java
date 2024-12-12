/*
Введите три строки (могут содержать пробелы). Выведите их в порядке возрастания.
Тестовые данные
Sample Input:
Hello, world!
Hello, sky!
By-by, baby!

Sample Output:
By-by, baby!
Hello, sky!
Hello, world!

 */

import java.util.Arrays;
import java.util.Scanner;

public class Task_49 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] srt = {scan.nextLine(), scan.nextLine(), scan.nextLine()};
        Arrays.sort(srt);
        for (int i = 0; i < 3; i++) {
            System.out.println(srt[i]);
        }
    }
}
