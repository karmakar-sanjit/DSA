/*
    https://www.geeksforgeeks.org/largest-sum-contiguous-subarray/

    Problem: https://leetcode.com/problems/maximum-subarray/
    
*/

package problems;

import java.util.Scanner;

public class KadanesAlgorithm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int[] arr = new int[size];

        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();

        int ans = largestSumSubarrySum(arr);
        System.out.println(ans);
    }

    static int largestSumSubarrySum(int[] arr) {
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;

        for(int i = 0; i < arr.length; i++) {
            if(currentSum >= 0) {
                currentSum = currentSum + arr[i];
            }
            else {
                currentSum = arr[i];
            }

            if(currentSum > maxSum){
                maxSum = currentSum;
            }
        }

        return maxSum;
    }
}
