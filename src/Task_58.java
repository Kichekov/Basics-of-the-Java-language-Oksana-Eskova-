/*
Пользователь вводит строку из слов, разделенных одним пробелом. Переставить слова местами так,
чтобы каждое следующее слово начиналось с буквы, которой заканчивается предыдущее слово (существование
 такого слова в тестах гарантируется).


Тестовые данные
        Номер теста	Входные данные	Выходные данные
        1	trolli emodji road tiger dog insert game
            trolli insert tiger road dog game emodji
        2	one kobra load absurd exel drotik
        	one exel load drotik kobra absurd
        3	хомяк рак аист тур курица
        	хомяк курица аист тур рак

 */

import java.util.Scanner;

public class Task_58 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        str = str.trim();
        String[] arr = str.split(" +");
        StringBuilder sb = new StringBuilder();
        sb.append(arr[0] + " ");
        for (int i = 0; i< arr.length-1; i++){
            String x = arr[i].substring(arr[i].length() - 1);
            for (int j = 1; j < arr.length; j++) {
                String y = arr[j].substring(0,1);
                if (x.equals(y)){
                    sb.append(arr[j]+" ");
                    String tmp = arr[i+1];
                    arr[i+1] = arr[j];
                    arr[j] = tmp;
                    break;
                }
            }
        }
        System.out.println(sb);

    }
}
