package group_meeting.week14;

import java.util.*;

public class frequency {
    public static void main(String[] args) {
        System.out.println(getFrequency(null));
        System.out.println(getFrequency(""));
        System.out.println(getFrequency("responsible"));

    }

    public static Map<Character, Integer> getFrequency(String input) {
        if (input == null) {
            return null;
        }

        List<Character> characters = new ArrayList<>();
        for (char each : input.toCharArray()) {
            characters.add(each);
        }

        Map<Character, Integer> frequencyMap = new LinkedHashMap<>();

        for (Character eachChar : characters) {
            frequencyMap.put(eachChar, Collections.frequency(characters, eachChar));
        }

        return frequencyMap;
    }
}
/*
Write a method that returns the frequency of each character of a given String parameter.
 If the given String is null, then return null
 If the given String is empty return an empty map
Example-1
input: “”
output: empty map
explanation: input is empty
Example-2
input: null
output: null
explanation: input is null.
Example-3
input: responsible
output: {r=1, e=2, s=2, p=1, o=1, n=1, i=1, b=1, l=1}
explanation: characters are keys and occurrences are values
 */