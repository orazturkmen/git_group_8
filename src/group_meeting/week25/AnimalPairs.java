package group_meeting.week25;

import java.util.*;

public class AnimalPairs {
    public static void main(String[] args) {

        System.out.println(pairs(new ArrayList<>(Arrays.asList("dog", "cat", "dog", "cow", "cat"))));

        System.out.println(pairs(new ArrayList<>(Arrays.asList("cat", "lion", "sheep", "cat", "horse", "horse", "sheep", "lion", "lion"))));


        List<String> animals = Arrays.asList("goat", "goat", "rabbit", "rabbit", "rabbit", "duck", "horse", "horse", "swan");
        System.out.println(pairs(animals));
    }

    public static Map<String, Integer> pairs(List<String> listOfAnimal){
        Map<String, Integer> animalPairs = new LinkedHashMap<>();
        for (String eachAnimal : listOfAnimal) {
            if (Collections.frequency(listOfAnimal, eachAnimal) < 2) continue;
            animalPairs.put(eachAnimal, 2);
        }
        return animalPairs;
    }
}
/*
Question-2 The Animals Went in Two by Two
A great flood has hit the land, and just as in Biblical times we need to get the animals to the ark in pairs. We
are only interested in getting one pair of each animal, and not interested in any animals where there are
less than 2. They need to mate to repopulate the planet after all!
Write a function that takes a list of animals as a parameter, which you need to check to see which animals
there are at least two of, and then return a Map<String, Integer> that contains the name of the animal
along with the fact that there are 2 of them to bring onto the ark.
Examples:
Input: []
Output: {}
Input: ['goat']
Output: {}
Input : ["dog", "goat", "dog"]
Output: {dog=2}
Input : ["dog", "cat", "dog", "cat", "beaver", "cat"]
Output: {cat=2, dog=2}
Input: ["goat", "goat", "rabbit", "rabbit", "rabbit", "duck", "horse", "horse", "swan"]
Output: {horse=2, rabbit=2, goat=2}
 */