import java.util.Scanner;

public class ImportMassiv {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int start = scan.nextInt();
        int[] arr = new int[start];
        for (int i=0; i<arr.length; i++){
            arr[i] = scan.nextInt();
        }

        print(arr);

    }
    public static void print(int[] b){
        for (int i=0; i<b.length; i++){
            System.out.print(b[i]+" ");;
        }
    }

}