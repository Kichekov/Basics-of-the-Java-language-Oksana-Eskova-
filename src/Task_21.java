import java.util.Scanner;

public class Task_21 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int a= scan.nextInt();
        int b = scan.nextInt();
        int min = Math.min(a,b);
        int max = Math.max(a,b);


        for (int i=min; i<=max; i++){
            if (Math.abs(i/10+i%10)>Math.abs(min/10+min%10)){
                min=i;
            }
        }
        System.out.println(min);
    }
}
