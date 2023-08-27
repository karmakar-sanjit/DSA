/*
    Given an array A[] consisting of only 0s, 1s, and 2s. The task is to write a function that sorts the given array. The functions should put all 0s first, then all 1s and all 2s in last.

    This problem is also the same as the famous “Dutch National Flag problem”. The problem was proposed by Edsger Dijkstra. The problem is as follows:

    Given N balls of colour red, white or blue arranged in a line in random order. You have to arrange all the balls such that the balls with the same colours are adjacent with the order of the balls, with the order of the colours being red, white and blue (i.e., all red coloured balls come first then the white coloured balls and then the blue coloured balls). 

    Examples:
    Input: {0, 1, 2, 0, 1, 2}
    Output: {0, 0, 1, 1, 2, 2}

    Input: {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1}
    Output: {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2}
*/

package problems;

import java.util.Arrays;
import java.util.Scanner;

public class DutchNationalFlag {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int[] arr = new int[size];

        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();

        sorting3(arr);
    }

    static void sorting(int[] arr) {
        Arrays.sort(arr);

        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static void sorting2(int[] arr) {
        int count0 = 0;
        int count1 = 0;
        int count2 = 0;

        for(int i=0; i<arr.length; i++) {
            if(arr[i] == 0) {
                count0++;
            }
            if(arr[i] == 1) {
                count1++;
            }
            if(arr[i] == 2) {
                count2++;
            } 
        }

        for(int i=0; i<count0; i++) {
            arr[i] = 0;
        }

        for(int i=count0; i<count0+count1; i++) {
            arr[i] = 1;
        }

        for(int i=count0+count1; i<count0+count1+count2; i++) {
            arr[i] = 2;
        }
        
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static void sorting3(int[] arr) {
        int low = 0;
        int mid = 0; 
        int high = arr.length - 1;

        while(mid <= high) {
            switch(arr[mid]) {
                case 1: {
                    mid++;
                    break;
                }

                case 0: {
                    int temp = arr[mid];
                    arr[mid] = arr[low];
                    arr[low] = temp;

                    mid++;
                    low++;
                    break;
                }

                case 2: {
                    int temp = arr[mid];
                    arr[mid] = arr[high];
                    arr[high] = temp;
                    high--;
                    break;
                }
            }
        }

        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
