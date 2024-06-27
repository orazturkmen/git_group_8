package group_meeting.week35;

import java.util.ArrayList;
import java.util.List;

public class LongestSubstringWRC {
    public static void main(String[] args) {
        String s = "pwwkew";
        String s2 = "abcabcbb";
        String s3 = "bbbbb";
        String s4 = "java";
        String s5 = "developer";


        System.out.println("Longest Substring Without Repeating Characters: " + longestSubstring(s) + ",    Length: " + longestSubstring(s).length());
        System.out.println("Longest Substring Without Repeating Characters: " + longestSubstring(s2) + ",    Length: " + longestSubstring(s2).length());
        System.out.println("Longest Substring Without Repeating Characters: " + longestSubstring(s3) + ",      Length: " + longestSubstring(s3).length());
        System.out.println("Longest Substring Without Repeating Characters: " + longestSubstring(s4) + ",    Length: " + longestSubstring(s4).length());
        System.out.println("Longest Substring Without Repeating Characters: " + longestSubstring(s5) + ",  Length: " + longestSubstring(s5).length());
    }
    public static String longestSubstring(String string){
        String[] array = string.trim().split("");
        List<String> list = new ArrayList<>();
        int a = 0;
        for (int i = 0; i < array.length; i++) {
            List<String> temp = new ArrayList<>();
            for (int k = a; k < array.length; k++) {
                if (!temp.contains(array[k])) temp.add(array[k]);
                else break;
            }
            if (temp.size() > list.size()) list = temp;
            a++;
        }
        return String.join("",list);
    }
}
/*
Question-2 Longest Substring Without Repeating Characters
Given a string s, find the length of the longest substring without repeating characters.
Example 1:
Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.
Example 2:
Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
Example 3:
Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
Constraints:
• 0 <= s.length <= 5 * 104
• s consists of English letters, digits, symbols, and spaces.
 */