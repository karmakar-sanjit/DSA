package arrays;

import java.util.Scanner;

public class BinarySearch {
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
        int low = 0;
        int high = arr.length - 1;

        while(low <= high) {
            int mid = low + (high - low) / 2;

            //Check if mid element match with terget element
            if(arr[mid] == terget) {
                return mid + 1;
            }
            
            //Check if mid is grater than terget, then ignore right half 
            if(arr[mid] > terget) {
                high = mid - 1;
            }
            //Check if mid is less than terget, then ignore left half 
            else {
                low = mid + 1;
            }
        }

        return -1;
    }
}
