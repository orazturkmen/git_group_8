package group_meeting.week25;

public class LengthOfLastWord {
    public static void main(String[] args) {

        System.out.println(length("Hello World"));
        System.out.println(length(" fly me to the moon "));
        System.out.println(length("luffy is still joyboy"));
    }

    public static int length(String s){
        s = s.trim();
        String lastWord = "";
        for (int i = s.length()-1; i > 0; i--) {
            if (s.charAt(i) == ' ') return lastWord.length();
            else lastWord += "" + s.charAt(i);
        }
        return lastWord.length();
    }
}
/*
Question-1 Length of Last Word
Given a string s consisting of words and spaces, return the length of the last word in the string.
A word is a maximal substring consisting of non-space characters only.
Example 1:
Input: s = "Hello World" Output: 5
Explanation: The last word is "World" with length 5.
Example 2:
Input: s = " fly me to the moon " Output: 4
Explanation: The last word is "moon" with length 4.
Example 3:
Input: s = "luffy is still joyboy" Output: 6
Explanation: The last word is "joyboy" with length 6.
Constraints:
 1 <= s.length <= 104
 s consists of only English letters and spaces ' '.
 There will be at least one word in s.
 */