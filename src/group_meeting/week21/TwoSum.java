package group_meeting.week21;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {16, 3, 11, 5, 15};
        int target = 14;

        System.out.println(Arrays.toString(twoSum(nums, target)));

        System.out.println(Arrays.toString(sol2(nums, 19)));
        System.out.println(Arrays.toString(sol2(nums, 20)));
    }

    public static int[] twoSum(int[] array, int target) {
        int[] result = new int[2];
        for (int j : array) {
            for (int k : array) {
                if (j + k == target & j != k) {
                    result[0] = j;
                    result[1] = k;
                }
            }
        }
        return result;
    }
    //3,5,11,15,16  :  20
    public static int[] sol2(int[] array, int target){
        Arrays.sort(array);
        int left = 0, right = array.length - 1;
        while (left < right){
            if (array[left] + array[right] == target) return new int[]{array[left], array[right]};
            else if (array[left] + array[right] > target) right--;
            else left++;
        }
        return new int[0];
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