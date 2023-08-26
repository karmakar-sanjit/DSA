package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Insertion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int[] arr = new int[size];

        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int position = sc.nextInt();
        int newElement = sc.nextInt();

        insert(arr, position, newElement);

        System.out.println(Arrays.toString(arr));
        sc.close();
    }

    //Insert an element by index position
    static void insert(int[] arr, int position, int newElement) {
        if(position < arr.length) {
            for(int i = arr.length - 1; i <= position; i++) {
                arr[i] = arr[i - 1];
            }
            arr[position] = newElement;
        }
    }
}
