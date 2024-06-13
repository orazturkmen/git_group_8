package group_meeting.week30;

public class Stairs {
    public static void main(String[] args) {
        Stairs solution = new Stairs();

        System.out.println("Stairs = 1, ways: " + solution.climbStairs(1));
        System.out.println("Stairs = 2, ways: " + solution.climbStairs(2));
        System.out.println("Stairs = 3, ways: " + solution.climbStairs(3));
        System.out.println("Stairs = 4, ways: " + solution.climbStairs(4));
        System.out.println("Stairs = 5, ways: " + solution.climbStairs(5));
        System.out.println("Stairs = 6, ways: " + solution.climbStairs(6));

        System.out.println("****************************************************************");

        System.out.println("Stairs = 1, ways: " + solution.sol2(1));
        System.out.println("Stairs = 2, ways: " + solution.sol2(2));
        System.out.println("Stairs = 3, ways: " + solution.sol2(3));
        System.out.println("Stairs = 4, ways: " + solution.sol2(4));
        System.out.println("Stairs = 5, ways: " + solution.sol2(5));
        System.out.println("Stairs = 6, ways: " + solution.sol2(6));


    }

    int climbStairs(int n){
        if (n == 0 || n == 1) return 1;
        return climbStairs(n-1) + climbStairs(n-2);
    }



    int sol2(int n){
        if (n == 0 || n == 1) return 1;

        int prev = 1, cur = 1;
        for (int i = 2; i <= n; i++) {
            int temp = cur;
            cur = prev + cur;
            prev = temp;
        }
        return cur;
    }

    int solFor3Steps(int n){
        if (n == 0 || n == 1) return 1;
        if (n == 2) return 2;

        int prev = 2, cur = 2;
        for (int i = 3; i <= n; i++) {
            int temp = cur;
            cur = prev + cur;
            prev = temp;
        }
        return cur;
    }
}
/*
Simba has a number of staircases in his house, and he likes to climb each staircase 1 or 2 steps at a time.
It takes n steps to reach the top. In how many distinct ways can he climb to the top?
Example 1:
Input: n = 2 Output: 2
Explanation: There are two ways to climb to the top.
1. 1 step + 1 step
2. 2 steps
Example 2:
Input: n = 3 Output: 3
Explanation: There are three ways to climb to the top.
1. 1 step + 1 step + 1 step
2. 1 step + 2 steps
3. 2 steps + 1 step.
Constraints:
• 1 <= n <= 45
 */