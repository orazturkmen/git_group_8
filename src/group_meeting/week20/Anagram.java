package group_meeting.week20;

import java.util.*;
import java.util.stream.Collectors;

public class Anagram {
    public static void main(String[] args) {
        System.out.println(anagram("anagram", "nagaram"));
        System.out.println(anagram("cat","car"));

        System.out.println(anagramSol2("anagram","nagaram"));
        System.out.println(anagramSol2("cat","car"));
    }

    public static boolean anagram(String s1, String s2){
        if (s1.length() != s2.length()){
            //throw new IllegalArgumentException("Length of strings must be equal!");
            return false;
        }

        List<String> list1 = new ArrayList<>(Arrays.asList(s1.split("")));
        List<String> list2 = new ArrayList<>(Arrays.asList(s2.split("")));

        list1 = list1.stream().sorted().collect(Collectors.toList());
        list2 = list2.stream().sorted().collect(Collectors.toList());

        /*for (int i = 0; i < list1.size(); i++) {
            if (!list1.get(i).equals(list2.get(i))) return false;
        }*/

        return list1.equals(list2);
    }

    public static boolean anagramSol2(String s1, String s2){
        if (s1.length() != s2.length()) return false;

        char[] chars = new char[26];
        for (int i = 0; i < s1.length(); i++) {
            chars[s1.charAt(i) - 'a']++;
            chars[s2.charAt(i) - 'a']--;
        }

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != 0) return false;
        }
        return true;
    }
}
/*
Question-1 Valid Anagram
Given two strings s and t, return true if t is an anagram of s, and false otherwise.
An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase,
typically using all the original letters exactly once.
Constraints:
 1 <= s.length, t.length <= 5 * 104
 s and t consist of lowercase English letters.
Follow up: What if the inputs contain Unicode characters? How would you adapt your solution to
such a case?
Example 1:
Input: s = "anagram", t = "nagaram"
Output: true
Example 2:
Input: s = "rat", t = "car"
Output: false
 */