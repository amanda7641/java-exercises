package exercises;

import java.util.HashMap;
import java.util.Scanner;

public class CountingCharacters {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        HashMap<Character, Integer> counts = new HashMap<>();

        System.out.println("Enter a sentence:");
        String sentence = in.nextLine();
        String sentenceLower = sentence.toLowerCase();
        String sentenceAlpha = sentenceLower.replaceAll("[^a-z]+","");

        char[] charactersInString = sentenceAlpha.toCharArray();

        for (char character : charactersInString){
            if (counts.containsKey(character)){
                int value = counts.get(character);
                value++;
                counts.put(character, value);
            } else{
                counts.put(character, 1);
            }
        }
        System.out.println("The character counts for each letter are:");
        if (counts.size()==0) {
            System.out.println("There are no letters in this sentence.");
        } else{
            for (char letter : counts.keySet()) {
                int number = counts.get(letter);
                System.out.println(letter + ": " + number);
            }
        }

    }
}
