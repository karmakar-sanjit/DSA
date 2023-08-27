/*
    Given a sorted array arr[] and a number x, write a function that counts the occurrences of x in arr[]. Expected time complexity is O(Logn) 

    Examples: 
    Input: arr[] = {1, 1, 2, 2, 2, 2, 3},   x = 2
    Output: 4 // x (or 2) occurs 4 times in arr[]

    Input: arr[] = {1, 1, 2, 2, 2, 2, 3},   x = 3
    Output: 1 

    Input: arr[] = {1, 1, 2, 2, 2, 2, 3},   x = 1
    Output: 2 

    Input: arr[] = {1, 1, 2, 2, 2, 2, 3},   x = 4
    Output: -1 // 4 doesn't occur in arr[] 
 */

package problems;

import java.util.Scanner;

public class Frequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int[] arr = new int[size];

        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        
        int num = sc.nextInt();
        sc.close();

        computeFrequency(arr, num);
    }

    static void computeFrequency(int[] arr, int num) {
        int count = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == num) {
                count++;
            }
        }

        if(count > 0){
            System.out.println(count);
        }
        else {
            System.out.println(-1);
        }
    }
}
