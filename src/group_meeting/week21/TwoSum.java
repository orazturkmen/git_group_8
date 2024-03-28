package group_meeting.week21;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
       int[] nums = {16, 3, 11, 5, 15};
       int target = 8;
        /*System.out.println(Arrays.toString(nums));
       Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));

       int[] ans = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int i1 = 0; i1 < nums.length; i1++) {
                if (nums[i] + nums[i1] == target) {
                    ans[0] = nums[i];
                    ans[1] = nums[i1];
                }
            }
        }

        System.out.println(Arrays.toString(ans));*/

        System.out.println(Arrays.toString(twoSum(nums, target)));
    }

    public static int[] twoSum(int[] array, int target){
        int[] result = new int[2];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] + array[j] == target){
                    result[0] = array[i];
                    result[1] = array[j];
                }
            }
        }
        return result;
    }
}
/*
Question-2 Two Sum
Given an array of integers nums and an integer target, return the two numbers such that they add
up to target.
Assume that each input would have exactly one solution, and you should not use the same
element twice.
You can return the answer in any order.
No solution will return empty array.
Please, use two pointer strategy to solve this problem
(Hint : you should sort the input first).
Example:
Input: nums = [16, 3, 11, 5, 15], target = 8
Output: [3, 5]
Explanation: Because nums[1] + nums[3] => 3 + 5 = 8, we return [3, 5]
 */