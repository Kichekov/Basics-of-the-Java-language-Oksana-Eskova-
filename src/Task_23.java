import java.util.Scanner;

public class Task_23 {
    public static void main(String[] args) {
      /*  Вариант №1
        Scanner scan = new Scanner(System.in);
        int beginning = scan.nextInt();
        int end = scan.nextInt();
        int count = 0;
        for (int i = beginning; i <= end; i++) {
            count = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }

            }
            if (count == 2) {
                System.out.print(i + " ");
                count = 0;
            }
        }
    }
}*/
        // Вариант №2
        Scanner scan = new Scanner(System.in);
        int beginning = scan.nextInt();
        int end = scan.nextInt();
        for (int i = beginning; i <= end; i++) {
            for (int j = 2; j <= i; j++) {
                if (i==1){break;}
                if (i % j == 0 && i!=j) {break;}
                if (i % j == 0 && i==j) {System.out.print(i+" ");}

            }
        }
    }
}
