package group_meeting.week18;

import java.util.ArrayList;

import static group_meeting.week18.Palindrome.palindrome;

public class PalindromeArray {
    public static void main(String[] args) {
        String[] arr = {"abc", "car", "ada", "racecar", "cool"};
        System.out.println(palindromesInArray(arr));

        String[] arr2 = {"def", "ab"};
        System.out.println(palindromesInArray(arr2));

    }

    public static ArrayList<String> palindromesInArray(String[] array){
        ArrayList<String> palindromes = new ArrayList<>();

        for (String each : array) {
            if (palindrome(each)) palindromes.add(each);
        }
        return palindromes;
    }
}
