/*
    Given an array and a number K where K is smaller than the size of the array. Find the K’th smallest element in the given array. Given that all array elements are distinct.

    Examples:  

    Input: arr[] = {7, 10, 4, 3, 20, 15}, K = 3 
    Output: 7

    Input: arr[] = {7, 10, 4, 3, 20, 15}, K = 4 
    Output: 10 
 */

package problems;

import java.util.Arrays;
import java.util.Scanner;

public class KthSmallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int[] arr = new int[size];

        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        
        int k = sc.nextInt();
        sc.close();

        computeKthSmallest(arr, k);
    }

    //Time Complexity: O(N log N)
    static void computeKthSmallest(int[] arr, int k) {
        Arrays.sort(arr);
        System.out.println(arr[k-1]);
    }
}
