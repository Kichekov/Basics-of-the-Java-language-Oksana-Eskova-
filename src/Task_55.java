/*
Ввести текст из слов, разделенных пробелами. Между словами может быть любое количество пробелов.
Также пробелы могут быть перед первым и после последнего слова.
Также ввести контрольное слово.
Удалить из текста все появления данного слова (но не как части другого слова!)
Также удалить все лишние пробелы между словами и в начале и в конце строки.
Тестовые данные/
Sample Input:

A good    dog deserves a    good bone or goodness
good
Sample Output:

A dog deserves a bone or goodness


 */

import java.util.Scanner;

public class Task_55 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String srt = scan.nextLine();
        String controlWord = scan.next();
        srt = srt.trim();
        String[] words = srt.split(" +");
        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(controlWord)) continue;
            System.out.print(words[i] + " ");
        }


    }
}
