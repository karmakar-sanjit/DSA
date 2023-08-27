/*
    https://leetcode.com/problems/majority-element-ii/

    Given an integer array of size n, find all elements that appear more than ⌊ n/3 ⌋ times.

    Example 1:
    Input: nums = [3,2,3]
    Output: [3]

    Example 2:
    Input: nums = [1]
    Output: [1]
    
    Example 3:
    Input: nums = [1,2]
    Output: [1,2]
*/


package problems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class MajorityElement2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int[] nums = new int[size];

        for(int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }
        sc.close();

        List<Integer> ans = majorityElement(nums);
        for(int data : ans) {
            System.out.print(data + " ");
        }
    }

    public static List<Integer> majorityElement(int[] nums) {
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

        List<Integer> list = new ArrayList<>();
        Set<Map.Entry<Integer, Integer>> hmap = map.entrySet();
        for(Map.Entry<Integer, Integer> data : hmap) {
            if(data.getValue() > (Math.floor(nums.length / 3))){
                list.add(data.getKey());
            }
        }
        return list;
    }
}
