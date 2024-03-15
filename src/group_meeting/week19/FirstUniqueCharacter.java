package group_meeting.week19;


import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.stream.IntStream;

public class FirstUniqueCharacter {
    public static void main(String[] args) {
        System.out.println(firstUniqueChar("success"));
        //System.out.println(firstUniqueChar(null));

        System.out.println("********************************************************************");
        Map<String, Integer> map = new LinkedHashMap<>();
        map.put("oraz", 10);
        map.put("ahmet", 7);
        map.put("jan", 5);
        map.put("maysa", 8);
        System.out.println(map.get("oraz"));
        System.out.println(map.getOrDefault("oraz",0));
        System.out.println(map.getOrDefault("araz",0));

        String str = "success";
        Map<Character, Integer> map1 = new LinkedHashMap<>();
        char[] chars = str.toCharArray();
        for (char ch : chars) {
            map1.put(ch, map1.getOrDefault(ch, 0) + 1);
            System.out.println(map1);

        }

        System.out.println("********************************************************************");
        System.out.println(firstUniqueWithMap("success"));

        System.out.println("********************************************************************");

        String word = "successue";
        Map<String,Integer> frequencyMap = new LinkedHashMap<>();
        for (String ch : word.split("")) {
            frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1);
        }
        System.out.println(frequencyMap);
        String st = frequencyMap.keySet().stream()
                .filter(p -> frequencyMap.get(p) == 1)
                .findFirst().orElse("No unique character!");
        System.out.println("First Unique Character: " + st);

    }

    public static String firstUniqueChar(String str){
        if (str == null) throw new IllegalArgumentException("Input can not be null");

        for (String each : str.split("")) {
            int count=0;
            for (String c : str.split("")) {
                if (c.equals(each)) count++;
            }
            if (count == 1) return each;
        }
        return " ";
    }

    public static char firstUniqueWithMap(String str){
        if (str == null) throw new IllegalArgumentException("Input can not be null");
        Map<Character,Integer> map = new LinkedHashMap<>();
        char[] ch = str.toCharArray();
        for (char c : ch) {
            map.put(c, map.getOrDefault(c,0) + 1);
        }

        for (Map.Entry<Character, Integer> each : map.entrySet()) {
            if (each.getValue() == 1) return each.getKey();
        }
        return ' ';
    }
}
/*
Question-3 First Unique Character
Write a function that returns the first non-repeated character from a string.
If all characters are repeated return a space character.
EXAMPLE:
Input: "success" output: u
Explanation: u and e are non-repeated, u is the first non-repeated character
 */