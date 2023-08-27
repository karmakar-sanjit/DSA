package problems;
import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int[] arr = new int[size];

        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();

        reverseArray(arr);
        System.out.println("");
        reverseArray2(arr);
    }

    static void reverseArray(int[] arr) {
        int[] ans = new int[arr.length]; 
        for(int i = arr.length - 1; i > -1; i--) {
            ans[arr.length - 1 - i] = arr[i];
        }

        for(int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }

    static void reverseArray2(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while(start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }

        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
