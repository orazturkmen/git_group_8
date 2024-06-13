package group_meeting.week33;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SingleNumber {
    public static void main(String[] args) {
        int[] arr = {4,1,2,1,2};
        System.out.println(singleNum(arr));
        System.out.println(singleNum(new int[]{1, 2, 3, 5, 2, 5, 3, 4, 4}));
        System.out.println(singleNum(new int[]{}));

    }

    public static int singleNum(int[] array){
        if (array == null || array.length == 0) throw new IllegalArgumentException("Array can not be null or empty!");
        Map<Integer,Integer> map = new HashMap<>();
        for (int each : array) {
            map.put(each, (int) Arrays.stream(array).filter(p->p == each).count());
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) return entry.getKey();
        }
        return 0;
    }
}
/*
Question-1 Single Number
Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
Example 1: Example 2:
Input: nums = [2,2,1] Output: 1 Input: nums = [4,1,2,1,2] Output: 4
Example 3:
Input: nums = [1] Output: 1
Constraints:
 1 <= nums.length <= 3 * 104
 -3 * 104 <= nums[i] <= 3 * 104
 Each element in the array appears twice except for one element which appears only once.
 Follow-up question: Can you implement a solution with a linear runtime complexity and use only constant
extra space?
 */