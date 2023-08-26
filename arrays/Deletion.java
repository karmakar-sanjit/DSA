package arrays;

import java.util.Scanner;

public class Deletion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int[] arr = new int[size];

        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int position = sc.nextInt();
        deleteElement(arr, position);

        sc.close();
    }

    static void deleteElement(int[] arr, int position) {
        if(position > 0 && position < arr.length + 1) {
            for(int i = position; i < arr.length; i++) {
                arr[i - 1] = arr[i];
            }

            for(int i = 0; i < arr.length - 1; i++) {
                System.out.print(arr[i] + " ");
            }
        }
        else {
            System.out.println("Not a correct position");
        }
    }
}
