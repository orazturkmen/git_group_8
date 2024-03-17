package group_meeting.week19;


import java.util.Arrays;

public class ArrayOfDigits {
    public static void main(String[] args) {
        int a = 490;
        System.out.println(String.valueOf(a).length());

        int[] b = new int[String.valueOf(a).length()];
        for (int i = b.length - 1; i >= 0; i--) {
            b[i] = a % 10;
            a = a / 10;
        }
        System.out.println(b.length);
        System.out.println(Arrays.toString(b));

        System.out.println("**********************************************************************");

        System.out.println(Arrays.toString(numToArray(365)));

        System.out.println(Arrays.toString(solWithStream(764)));

        System.out.println(Arrays.toString(numToArray(1005)));

        System.out.println(Arrays.toString(solWithStream(423)));
    }

    public static int[] numToArray(int n){
        int[] array = new int[String.valueOf(n).length()];
        for (int i = array.length - 1; i >= 0; i--) {
            array[i] = n % 10;
            n = n / 10;
        }
        return array;
    }


    public static int[] solWithStream(int n){
        return Integer.toString(n)
                .chars()
                .map(Character::getNumericValue)
                .toArray();
    }

}
/*
Question-5 Array of Digits
How to convert a positive int to an array of digits.
Input: 490 Output: [4, 9, 0] (as int Array)
 */