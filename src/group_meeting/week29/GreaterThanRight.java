package group_meeting.week29;

import java.util.*;

public class GreaterThanRight {
    public static void main(String[] args) {
        GreaterThanRight solution = new GreaterThanRight();
        int[] array = {10, 4, 6, 3, 5};
        System.out.println(sol1(array));

        System.out.println(solution.sol2(array));
        System.out.println(solution.withDeque(array));

    }


    Deque<Integer> withDeque(int[] arr){
        Deque<Integer> stack = new LinkedList<>();
        if (arr == null || arr.length == 0) return stack;

        stack.push(arr[arr.length-1]);

        for (int i = arr.length-2; i >= 0; i--) {
            if (stack.peek() < arr[i]) stack.push(arr[i]);
        }
        return stack;
    }

    public static List<Integer> sol1(int[] array){
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < array.length; i++) {
            while (!stack.isEmpty() && array[i] >= array[stack.peek()]){
                stack.pop();
            }
            stack.push(i);
        }

        List<Integer> temp = new ArrayList<>(stack);
        List<Integer> list = new ArrayList<>();
        for (Integer integer : temp) {
            list.add(array[integer]);
        }
        return list;
    }

    List<Integer> sol2(int[] arr){
        LinkedList<Integer> stack = new LinkedList<>();
        for (int value : arr) {
            while (!stack.isEmpty() && value > stack.peek()){
                stack.pop();
            }
            stack.push(value);
        }

//        Collections.reverse(stack);
        stack.sort(Collections.reverseOrder());
        return stack;
    }
}
/*
Question-1 Find All Elements Greater Than Their Right
Given an unsorted integer array, return all greater elements than all elements present to their right using
Stack.
Example:
Input: [10, 4, 6, 3, 5]
Output: [10, 6, 5]
The elements that are greater than all elements to their right are 10, 6, and 5.
10 > 4 & 10 > 6 & 10 > 3 & 10 > 5
 */