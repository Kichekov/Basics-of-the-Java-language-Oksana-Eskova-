import java.util.Scanner;
import java.io.*;
public class Task_41 {
    public static void main(String[] arge) {
        Scanner scan = new Scanner(System.in);
        int numString = Integer.parseInt(scan.nextLine());;
        int count = 0;

        for (int i = 0; i <numString; i++) {
            String str = scan.nextLine();
            for (int j = 0; j <str.length(); j++) {
                if ( str.charAt(j) == 'a' || str.charAt(j) == 'o' || str.charAt(j) == 'u' || str.charAt(j) == 'i' || str.charAt(j) == 'e' || str.charAt(j) == 'y') {
                    count++;
                }
            }
            System.out.println();
            System.out.print(count + " ");
            count = 0;
        }

    }

}



