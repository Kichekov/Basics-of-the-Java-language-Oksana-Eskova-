import java.util.Scanner;

public class Task_51 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String phrase = "";
        for (int i = 0; i <3; i++){
            String str = scan.nextLine();
            int findFirst = str.indexOf(';')+1;
            int findLast = str.lastIndexOf(';');
            String element = str.substring(findFirst, findLast);
            phrase += element;
        }
        System.out.println(phrase);
    }
}
