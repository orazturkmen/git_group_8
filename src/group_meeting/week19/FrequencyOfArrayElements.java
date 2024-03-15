package group_meeting.week19;

import java.beans.Introspector;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FrequencyOfArrayElements {
    public static void main(String[] args) {
        String[] array = {"Apple", "Banana", "apple", "Cherry", "Apple"};

        System.out.println(frequencyArray(array));
//        System.out.println(frequencyArray(new String[0]));

        System.out.println(Arrays.stream(array).filter(p -> p.equals("Apple")).count());
        System.out.println("\n");
        Stream<Object> a = Arrays.stream(array).distinct().map(p -> Arrays.stream(array).filter(string -> string.equals(p)).count());
        a.forEach(System.out::println);

        Map<String,Integer> map = new LinkedHashMap<>();
        for (String each : array) {
            map.put(each, (int)Arrays.stream(array).filter(p->p.equals(each)).count());
        }
        System.out.println(map);

        String[] name = {"oraz", "aygul", "ahmet", "jemal", "oraz", "maysa", "aygul"};
        System.out.println(frequency(name));

        System.out.println(frequency2(name));
    }

    public static Map<String, Integer> frequencyArray(String[] array){
        if (array == null || array.length == 0) throw new IllegalArgumentException("Array can not be null or empty!");
        Map<String,Integer> map = new HashMap<>();
        for (String each : array) {
            map.put(each, map.getOrDefault(each,0) + 1);
        }
        return map;
    }

    public static Map<String,Integer> frequency(String[] array){
        if (array == null || array.length == 0) throw new IllegalArgumentException("Array can not be null or empty!");
        Map<String,Integer> map = new LinkedHashMap<>();
        for (String each : array) {
            map.put(each, (int) Arrays.stream(array).filter(p->p.equals(each)).count());
        }
        return map;
    }

    public static Map<String,Long> frequency2(String[] array){
        if (array == null || array.length == 0) throw new IllegalArgumentException("Array can not be null or empty!");
        return Arrays.stream(array)
                .filter(Objects::nonNull)
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
    }


}
/*
Question-4 Frequency of Array Elements
Write a function that takes a String array as parameter and returns a map object that
contains each element of array as key and their occurrence counts as value.
For calculating occurrence, array elements should be checked by regarding case sensitivity.
Order is not important.
EXAMPLE:
Input: {"Apple", "Banana", "apple", "Cherry", "Apple"}
Output: returning map elements: {Apple=2, apple=1, Cherry=1, Banana=1}
 */