package group_meeting.week18;

public class SumOfDigits {
    public static void main(String[] args) {
        sumOfDigits(687);
        sumOfDigits(555);
        sumOfDigits(12);
    }

    public static int sumOfDigits(int number){
        int sumOfDigits = 0;
        while (number != 0){
            sumOfDigits += number % 10;
            number /= 10;
        }
        System.out.println(sumOfDigits);
        return sumOfDigits;
    }

}
/*
Question-1 Sum of Digits
Given a number, write a method that finds the sum of its digits.
Examples :
Input: n = 687
Output: 21
Input: n = 12
Output: 3
 */
