package group_meeting.week34;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseString {
    public static void main(String[] args) {
        String s1 = "the sky is blue";
        String s2 = " hello world ";
        System.out.println("Original String s1: " + s1);
        System.out.println("Original String s2: " + s2);
        System.out.println();
//        System.out.println(reverseString(s));

        System.out.println("With Collection.reverse(s1): " + reverse(s1));
        System.out.println("With Collection.reverse(s2): " + reverse(s2));
        System.out.println();
        System.out.println("With StringBuilder s1: " + reverse2(s1));
        System.out.println("With StringBuilder s2: " + reverse2(s2));

    }

    public static String reverseString(String input){
        StringBuilder sb = new StringBuilder();
        sb.append(input);
        return sb.reverse().toString();
    }

    public static String reverse(String input){
        List<String> str = new ArrayList<>(List.of(input.split(" ")));
        Collections.reverse(str);
        return String.join(" ", str).trim();
    }

    public static String reverse2(String input){
        StringBuilder sb = new StringBuilder();
        String[] array = input.split(" ");
        for (int i = array.length-1; i >= 0; i--) {
            sb.append(array[i]).append(" ");
        }
        return sb.toString().trim();
    }
}
/*
Question-2 Reverse Words in a String
Given an input string s, reverse the order of the words.
A word is defined as a sequence of non-space characters. The words in s will be separated by at least one space.
Return a string of the words in reverse order concatenated by a single space.
Note that s may contain leading or trailing spaces or multiple spaces between two words. The returned string
should only have a single space separating the words. Do not include any extra spaces.
Example 1:
Input: s = "the sky is blue"
Output: "blue is sky the"
Example 2:
Input: s = " hello world "
Output: "world hello"
Explanation: Your reversed string should not contain leading or trailing spaces.
Example 3:
Input: s = "a good example"
Output: "example good a"
Explanation: You need to reduce multiple spaces between two words to a single space in the reversed string.
 */