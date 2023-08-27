/*
    Given an array arr[] of integers. Find a peak element i.e. an element that is not smaller than its neighbors. 
    Note: For corner elements, we need to consider only one neighbor. 

    The following corner cases give a better idea about the problem. 

    1. If the input array is sorted in a strictly increasing order, the last element is always a peak element. For example, 50 is peak element in {10, 20, 30, 40, 50}.
    2. If the input array is sorted in a strictly decreasing order, the first element is always a peak element. 100 is the peak element in {100, 80, 60, 50, 20}.
    3. If all elements of the input array are the same, every element is a peak element.

    Example:

    Input: array[]= {5, 10, 20, 15}
    Output: 20
    Explanation: The element 20 has neighbors 10 and 15, both of them are less than 20.

    Input: array[] = {10, 20, 15, 2, 23, 90, 67}
    Output: 20 or 90
    Explanation: The element 20 has neighbors 10 and 15, both of them are less than 20, similarly 90 has neighbors 23 and 67.
 */

package problems;

import java.util.Scanner;

public class PeakElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int[] arr = new int[size];

        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();

        peakElement(arr);
    }

    static void peakElement(int[] arr) {
        if(arr.length == 1) {
            System.out.print(arr[0] + " ");
        }

        if(arr[0] > arr[1]) {
            System.out.print(arr[0] + " ");
        }

        if(arr[arr.length-1] > arr[arr.length - 2]) {
            System.out.print(arr[arr.length-1] + " ");
        }

        for(int i=1; i<arr.length - 1; i++) {
            if(arr[i] > arr[i-1] && arr[i] > arr[i+1]){
                System.out.print(arr[i] + " ");
            }
        }
    }
}
