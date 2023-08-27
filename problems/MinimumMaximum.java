/*
    Given an array of size N. The task is to find the maximum and the minimum element of the array using the minimum number of comparisons.

    Examples:

    Input: arr[] = {3, 5, 4, 1, 9}
    Output: 
    Minimum element is: 1
    Maximum element is: 9

    Input: arr[] = {22, 14, 8, 17, 35, 3}
    Output:  
    Minimum element is: 3
    Maximum element is: 35
 */

package problems;

import java.util.Scanner;

public class MinimumMaximum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int[] arr = new int[size];

        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();

        computeMinimumMaximum(arr);
    }

    static void computeMinimumMaximum(int[] arr) {
        int max = arr[0];
        int min = arr[0];

        for(int i=0; i<arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }

            if(arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println(min + " " + max);
    }
}
