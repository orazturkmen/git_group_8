package group_meeting.week28;

public class HappyNumber {
    public static void main(String[] args) {
        try {
            System.out.println(happyNumber(365));
        }catch (StackOverflowError e){
            System.out.println(false);
        }

        HappyNumber sol = new HappyNumber();
        System.out.println(sol.solutionWithRecursion(20));

    }

    public static boolean happyNumber(int n){
        int sum = 0;
        while (n != 0){
            sum += (int) Math.pow(n%10,2);
            n = n/10;
        }
        if (sum == 1) return true;
        happyNumber(sum);
        return true;
    }

    private int findSquareSum(int n) {
        int squareSum = 0;
        while (n != 0) {
            int eachDigit = n % 10;
            squareSum += eachDigit * eachDigit;
            n /= 10;
        }
        return squareSum;
    }

    // TC : hard to guess O(log n)  SC: O(log n))
    public boolean solutionWithRecursion(int n) {
        // it becomes infinite loop if n = 4        4 → 16 → 37 → 58 → 89 → 145 → 42 → 20 → 4 → ...
        if (n == 4)
            return false;
        if (n == 1) return true;
        int sum = findSquareSum(n);
        return solutionWithRecursion(sum);
    }

}
/*
Question-2 Happy Number
Write a function that returns true if a number is a happy number, and false if it is an unhappy number.
A happy number is a number defined by the following process:
 1. Starting with any positive integer, replace the number by the sum of the squares of its digits.
 2. Repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which
does not include 1.
 3. Those numbers for which this process ends in 1 are happy.
Example 1:
Input: n = 19 Output: True
Explanation:
 19 is Happy Number,
 1^2 + 9^2 = 82
 8^2 + 2^2 = 68
 6^2 + 8^2 = 100
 1^2 + 0^2 + 0^2 = 1
 As we reached to 1, 19 is a Happy Number.
Example 2:
Input: n = 20 Output: False
Constraints: 1 <= n <= 2^31 - 1
 */