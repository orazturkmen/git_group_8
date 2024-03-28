package group_meeting.week21;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MissingNumber {
    public static void main(String[] args) {
        int[] ar = {0,1,2,3,5};
        System.out.println("missing number: " + missingNum(ar));

        int[] num1 = {0,1};
        System.out.println("missing number: " + missingNum(num1));

        int[] num2 = {9,4,5,8,6,1,3,2,0};
        System.out.println("missing number: " + missingNum(num2));

        System.out.println(sol2(num1));

        System.out.println(sol3(num2));
        System.out.println(sol3(num1));
        System.out.println(sol3(ar));

        System.out.println(sol3(new int[]{2, 0, 5, 7, 10, 1, 3, 4, 8, 9}));

    }


    public static int missingNum(int[] array){
        int n = array.length;

        int[] ints = new int[n+1];
        for (int j : array) {
            ints[j]++;
        }

        for (int i = 0; i < ints.length; i++) {
            if (ints[i] == 0) n = i;
        }
        return n;
    }

    public static int sol2(int[] array){
        int n = array.length;
        int actualSum = IntStream.rangeClosed(0,n).sum();
        int expectedSum = Arrays.stream(array).sum();
        return actualSum - expectedSum;
    }

    public static int sol3(int[] array){
        int n = 0;
        Set<Integer> collect = Arrays.stream(array)
                .boxed()
                .collect(Collectors.toSet());
        for (int i = 0; i < array.length+1; i++) {
            if (!collect.contains(i)) n = i;
        }
        return n;
    }
}
/*
Question-1 Missing Number
Given an array nums containing n distinct numbers in the range [0, n], return the only number in
the range that is missing from the array.
Example 1:
Input: nums = [3, 0, 1]
Output: 2
Explanation: n = 3 since there are 3 numbers, so all numbers are in the range [0, 3]. 2 is the missing
number in the range since it does not appear in nums.
Example 2:
Input: nums = [0, 1]
Output: 2
Explanation: n = 2 since there are 2 numbers, so all numbers are in the range [0, 2]. 2 is the missing
number in the range since it does not appear in nums.
Example 3:
Input: nums = [9, 6, 4, 2, 3, 5, 7, 0, 1]
Output: 8
Explanation: n = 9 since there are 9 numbers, so all numbers are in the range [0, 9]. 8 is the missing
number in the range since it does not appear in nums.
Constraints:
 n == nums.length
 1 <= n <= 104
 0 <= nums[i] <= n
 All the numbers of nums are unique.
 */