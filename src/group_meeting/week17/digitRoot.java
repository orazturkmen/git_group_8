package group_meeting.week17;

public class digitRoot {
    public static void main(String[] args) {
        System.out.println(digitalRoot(555));
        System.out.println(digitalRoot(16));
        System.out.println(digitalRoot(942));
        System.out.println(digitalRoot(132189));
        System.out.println(digitalRoot(493193));

    }
    public static int digitalRoot(int number){
        if (number < 10) return number;
        int sum = 0;
        while (number != 0){
            sum += number % 10;
            number /= 10;
        }

        return digitalRoot(sum);
    }
}
/*
Question-2 Sum of Digits Until Producing Single Digit
Digital root is the recursive sum of all the digits in a number.
Given n, write a method that returns the sum of the digits of n. If that value has more than one digit,
continue reducing in this way until a single-digit number is produced. The input will be a non-negative
integer.
Examples
 16 --> 1 + 6 = 7
 942 --> 9 + 4 + 2 = 15 --> 1 + 5 = 6
132189 --> 1 + 3 + 2 + 1 + 8 + 9 = 24 --> 2 + 4 = 6
493193 --> 4 + 9 + 3 + 1 + 9 + 3 = 29 --> 2 + 9 = 11 --> 1 + 1 = 2
 */