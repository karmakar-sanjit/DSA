/* 
    https://www.geeksforgeeks.org/boyer-moore-majority-voting-algorithm/

    The Boyer-Moore voting algorithm is one of the popular optimal algorithms which is used to find the majority element among the given elements that have more than N/ 2 occurrences. This works perfectly fine for finding the majority element which takes 2 traversals over the given elements, which works in O(N) time complexity and O(1) space complexity.

    Let us see the algorithm and intuition behind its working, by taking an example –

    Input :{1,1,1,1,2,3,5}
    Output : 1
    Explanation : 1 occurs more than 3 times.

    Input : {1,2,3}
    Output : -1
*/

package problems;

import java.util.Scanner;

public class BoyerMooreVotingAlgorithm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int[] nums = new int[size];

        for(int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }
        sc.close();

        int ans = majority(nums);
        System.out.println(ans);
    }

    static int majority(int[] nums) {
        int majority = nums[0];
        int count = 1;

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == majority) {
                count++;
            }
            else {
                count--;
            }

            if(count == 0) {
                majority = nums[i];
                count = 1;
            }
        }

        return majority;
    }
}
