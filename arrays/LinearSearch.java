package arrays;
import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int[] arr = new int[size];

        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int terget = sc.nextInt();
        sc.close();
        int result = searchingElement(arr, terget);
        System.out.println(result);
    }

    static int searchingElement(int[] arr, int terget) {
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == terget) {
                return i + 1;
            }
        }
        return -1;
    }
}