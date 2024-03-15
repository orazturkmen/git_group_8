package group_meeting.week19;

import java.util.stream.IntStream;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(findFactorial(10));
        System.out.println(factorialWithStream(10));

        try{
            System.out.println(factorialWithStream(-10));
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
    public static long findFactorial(int n){
        if (n < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers");
        }

        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public static long factorialWithStream(int n){
        if (n < 0) throw new IllegalArgumentException("The number can not be negative!");
        return IntStream.range(1, n+1)
                .reduce(1,(a,b) -> a*b);
    }

}
/*
Question-2 Find Factorial
Write a method that returns the factorial number of any given number.
Factorial: Factorial of a non-negative integer, is multiplication of all positive integers smaller
than or equal to n. For example, factorial of 6 is 6*5*4*3*2*1 which is 720
 */