import java.util.Scanner;

public class Task_56 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String[] arr = str.split(" ");
        String newArr = "";
        for (int i =0; i < arr.length;i++){
            newArr+=arr[i].substring(0,1).toUpperCase()+arr[i].substring(1)+" ";
        }
        System.out.print(newArr);

    }
}
