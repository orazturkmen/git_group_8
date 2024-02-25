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