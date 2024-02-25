package group_meeting.week14;

import java.util.LinkedHashMap;
import java.util.Map;
import static group_meeting.week14.frequency.getFrequency;

public class firstNonRepeatedVowel {
    public static void main(String[] args) {
        System.out.println(getFirstIndex("google"));
        System.out.println(getFirstIndex("mood"));
        System.out.println(getFirstIndex("responsible"));

    }

    public static int getFirstIndex(String input){
        Map<Character, Integer> map = new LinkedHashMap<>(getFrequency(input));

        int firstIndex = Integer.MAX_VALUE;

        for (Map.Entry<Character, Integer> eachEntry : map.entrySet()) {
            if (eachEntry.getKey() == 'a' || eachEntry.getKey() == 'o' || eachEntry.getKey() == 'e' || eachEntry.getKey() == 'i' || eachEntry.getKey() == 'u'){
                if (eachEntry.getValue() == 1){
                    if (firstIndex > input.indexOf(eachEntry.getKey())){
                        firstIndex = input.indexOf(eachEntry.getKey());
                    }
                }
            }
        }
        if (firstIndex == Integer.MAX_VALUE){
            firstIndex = -1;
        }
        return firstIndex;
    }
}
/*
Given a string, write a method to find the index of first non-repeating vowel (a, e, i, o, u) in it and return it.
If it doesn't exist, return -1. Assume that string is not empty, and all the characters of the String is
lowercase.
Try to solve with Map data structure like using a Map<Character, Integer>.
Example-1:
Input: “google”
Output: 5
Explanation: only e is non-repeated vowel and it’s index is 5
Example-2:
Input: “responsible”
Output: 4
Explanation: e is repeated, o and i are not repeated, o is the first non-repeating vowel
Example-3:
Input: “mood”
Output: -1
Explanation: o is repeated, no non-repeating vowel
 */