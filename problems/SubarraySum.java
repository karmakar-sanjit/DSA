/*
    Given an array arr[] of non-negative integers and an integer sum, find a subarray that adds to a given sum.

    Note: There may be more than one subarray with sum as the given sum, print first such subarray. 

    Examples: 

    Input: arr[] = {1, 4, 20, 3, 10, 5}, sum = 33
    Output: Sum found between indexes 2 and 4
    Explanation: Sum of elements between indices 2 and 4 is 20 + 3 + 10 = 33


    Input: arr[] = {1, 4, 0, 0, 3, 10, 5}, sum = 7
    Output: Sum found between indexes 1 and 4
    Explanation: Sum of elements between indices 1 and 4 is 4 + 0 + 0 + 3 = 7

    Input: arr[] = {1, 4}, sum = 0
    Output: No subarray found
    Explanation: There is no subarray with 0 sum
*/

package problems;

import java.util.Arrays;
import java.util.Scanner;

public class SubarraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int[] arr = new int[size];

        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int terget = sc.nextInt();
        sc.close();

        int[] ans = findingSubarraySum2(arr, terget);
        System.out.println(Arrays.toString(ans));
    }

    static int[] findingSubarraySum(int[] arr, int terget) {
        int[] ans = new int[2];
        for(int i=0; i<arr.length; i++) {
            int sum = 0;
            for(int j=i; j<arr.length; j++) {
                sum = sum + arr[j];
                if(sum == terget) {
                    ans[0] = i;
                    ans[1] = j;
                    return ans;
                }
            }
        }

        return ans;
    }

    static int[] findingSubarraySum2(int[] arr, int terget) {
        int[] ans = new int[2];

        int left = 0;
        int right = 0;
        int windowSum = arr[0];
        
        for(right=1; right<arr.length; right++) {

            while(windowSum > terget && left < right - 1) {
                windowSum = windowSum - arr[left];
                left++;
            }

            if(windowSum == terget) {
                ans[0] = left;
                ans[1] = right - 1;
                return ans;
            }

            if(right < arr.length) {
                windowSum = windowSum + arr[right];
            }
        }

        return ans;
    }
}
