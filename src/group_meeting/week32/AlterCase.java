package group_meeting.week32;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class AlterCase {
    public static void main(String[] args) throws IOException {
        String input1 = "We are the world";
        String input2 = "Hey I am Oraz";
        String path = "src/group_meeting/week32/input.txt";
//        String input = Files.readString(Path.of(path));
//        String[] lines = input.split("\n");
//        StringBuilder result = new StringBuilder();
//        for (String line : lines) {
//            StringBuilder sb = new StringBuilder();
//            int n = 0;
//            for (Character each:line.trim().toCharArray()) {
//                if (Character.isLetter(each)) {
//                    if (n % 2 == 0) sb.append(Character.toUpperCase(each));
//                    else sb.append(Character.toLowerCase(each));
//                    n++;
//                }
//                else sb.append(each);
//            }
//            result.append(sb).append("\n");
//        }
//
//        System.out.println(result);

        System.out.println(alterCaseForFile(path));
        System.out.println(alterCase(input1));
        System.out.println(alterCase(input2));
    }


    public static String alterCaseForFile(String path) throws IOException {
        String input = Files.readString(Path.of(path));
        String[] lines = input.split("\n");
        StringBuilder result = new StringBuilder();
        for (String line : lines) {
            StringBuilder sb = new StringBuilder();
            int n = 0;
            for (char each : line.trim().toCharArray()) {
                if (Character.isLetter(each)) {
                    if (n % 2 == 0) sb.append(Character.toUpperCase(each));
                    else sb.append(Character.toLowerCase(each));
                    n++;
                } else sb.append(each);
            }
            result.append(sb).append("\n");
        }

        return result.toString();
    }

    public static String alterCase(String input){
        StringBuilder sb = new StringBuilder();
        int n = 0;
        for (char each : input.trim().toCharArray()) {
            if (Character.isLetter(each)){
                if (n%2==0) sb.append(Character.toUpperCase(each));
                else sb.append(Character.toLowerCase(each));
                n++;
            }else sb.append(each);
        }
        return sb.toString();
    }
}
/*
Question-2 Alter Case
Given a path of input file which includes sentence(s), write a program that reads alternates the case of every
alphabetic character, starting with uppercase. Spaces and non-alphabetical characters should be added to the
final output as is, i.e. they should not be taken into account when alternating between upper/lowercase.
Input: Your program should read lines from file as a standard input. Each line contains a sentence. Assume all
characters are ASCII.
Output: For each sentence from standard input, return a string which contains a sentence in each line such that
the first character is uppercase, the next character is lowercase and so on.
Test 1
Test Input: We are the world
Expected Output: We ArE tHe WoRlD
Test 2
Test Input: this is some code
Expected Output: ThIs Is SoMe CoDe
 */