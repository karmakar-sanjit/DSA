package arrays;

import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int[] arr = new int[size];

        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();

        sorting(arr);
    }

    static void sorting(int[] arr) {
        for(int i = 0; i < arr.length - 1; i++) {
            int smallest = i;
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[smallest] > arr[j]) {
                    smallest = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[smallest];
            arr[smallest] = temp;
        }

        for(int i = 0; i < arr.length; i ++) {
            System.out.print(arr[i] + " ");
        }
    }
}
