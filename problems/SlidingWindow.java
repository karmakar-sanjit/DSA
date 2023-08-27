/*
    Given an array of integers of size ‘n’, Our aim is to calculate the maximum sum of ‘k’ consecutive elements in the array.

    Input  : arr[] = {100, 200, 300, 400}, k = 2
    Output : 700

    Input  : arr[] = {1, 4, 2, 10, 23, 3, 1, 0, 20}, k = 4 
    Output : 39
    We get maximum sum by adding subarray {4, 2, 10, 23} of size 4.

    Input  : arr[] = {2, 3}, k = 3
    Output : Invalid
    There is no subarray of size 3 as size of whole array is 2.
*/

package problems;

import java.util.Scanner;

public class SlidingWindow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int[] arr = new int[size];

        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int window = sc.nextInt();
        sc.close();

        int ans = findingLargestSumSubarrayOfSizeK(arr, window);
        System.out.println(ans);
    }

    static int findingLargestSumSubarrayOfSizeK(int[] arr, int window) {
        int windowSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int i=0; i<window; i++) {
            windowSum += arr[i];
        }

        for(int i=window; i<arr.length; i++) {
            windowSum = windowSum - arr[i - window] + arr[i];
            maxSum = Math.max(maxSum, windowSum);
        }

        return maxSum;
    }
}

