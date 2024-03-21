package group_meeting.week20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static group_meeting.week20.Reverse.reverse;

public class Palindrome {
    public static void main(String[] args) {

        System.out.println(palindrome("Do geese see God?"));
        System.out.println(palindrome("Was it a car or a cat i saw?"));
        System.out.println(palindrome("A brown fox jumping over"));

        System.out.println(palindromeSol2("Do geese see God?"));
        System.out.println(palindromeSol2("Was it a car or a cat i saw?"));
        System.out.println(palindromeSol2("A brown fox jumping over"));

    }
    public static boolean palindrome(String s){
        // Convert the string to lowercase and remove non-alphanumeric characters
        String[] array = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "").split("");
        List<String> list1 = new ArrayList<>(Arrays.asList(array));
        List<String> list2 = reverse(list1);

        boolean b = false;
        for (int i = 0; i < list1.size(); i++) {
            b = list1.get(i).equals(list2.get(i));
            if (!b) return b;
        }
        return b;
    }

    public static boolean palindromeSol2(String s){
        // Convert the string to lowercase and remove non-alphanumeric characters
        s = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");

        int right = 0, left = s.length()-1;
        while(right < left){
            if (s.charAt(right) != s.charAt(left)) return false;
            right++;
            left--;
        }
        return true;
    }
}
/*
Question-2 Valid Palindrome
Write a function that accepts a string and determines whether it is a palindrome, ignoring nonalphanumeric characters and case and returns true if it is palindrome.
(A string is said to be palindrome if it reads the same backward as forward, after converting all
uppercase letters into lowercase letters and removing all non-alphanumeric characters).
Examples:
Input: Do geese see God? Output: True
Input: Was it a car or a cat I saw? Output: True
Input: A brown fox jumping over Output: False
Constraints:
• 1 <= s.length <= 2 * 105
• s consists only of printable ASCII characters
 */