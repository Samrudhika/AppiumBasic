package org.JavaProgram;

import java.util.HashMap;
import java.util.Map;

public class LetterCount {
    public static void main(String[] args) {
        String s = "automation";

        // Convert the string to lowercase to make the comparison case-insensitive
        s = s.toLowerCase();

        // Identify and count letters
        Map<Character, Integer> letterCountMap = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);

            // Check if the current character is a letter
            if (Character.isLetter(currentChar)) {
                // Update the count in the map
                letterCountMap.put(currentChar, letterCountMap.getOrDefault(currentChar, 0) + 1);
            }
        }

        // Print each letter along with its count
        System.out.println("Letters and Counts:");

        for (Map.Entry<Character, Integer> entry : letterCountMap.entrySet()) {
            System.out.println(entry.getKey() + "=" + entry.getValue());
        }
    }
}
