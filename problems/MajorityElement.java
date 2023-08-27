/*
    https://leetcode.com/problems/majority-element/

    Given an array nums of size n, return the majority element.

    The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

    Example 1:
    Input: nums = [3,2,3]
    Output: 3

    Example 2:
    Input: nums = [2,2,1,1,1,2,2]
    Output: 2
*/

package problems;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class MajorityElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int[] nums = new int[size];

        for(int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }
        sc.close();

        int ans = majorityElement(nums);
        System.out.println(ans);
    }

    public static int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {
            if(!map.containsKey(nums[i])) {
                map.put(nums[i], 1);
            }
            else{
                int oldVal = map.get(nums[i]);
                int newVal = oldVal + 1;
                map.put(nums[i], newVal);
            }
        }

        int ans = 0;
        Set<Map.Entry<Integer, Integer>> hmap = map.entrySet();
        for(Map.Entry<Integer, Integer> data : hmap) {
            if(data.getValue() > (nums.length / 2)){
                ans = data.getKey();
            }
        }
        return ans;
    }
}
