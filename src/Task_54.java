import java.util.Scanner;

public class Task_54 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        str = str.trim();
        String[] words = str.split(" +");
        int max = 0;
        int imax = 0;
        for (int i = 0; i< words.length; i++){
            if (words[i].length() > max){
                imax = i;
                max = words[i].length();
            }

        }
        System.out.print( words[imax]);

    }
}
