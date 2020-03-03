/* Lab 5: Arrays, HashMaps and API */
package Y1S1.lab5;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        // Instantiates two quotes.
        WordGroup platoQuote = new WordGroup("You can discover more about a person in an hour of play than in a year of conversation");
        WordGroup rooseveltQuote = new WordGroup("When you play play hard when you work dont play at all");

        // Converts the strings to arrays of strings.
        String[] platoArray = platoQuote.getWordArray();
        String[] rooseveltArray = rooseveltQuote.getWordArray();

        // Prints the two quotes.
        for (int i = 0; i < platoArray.length; i++) {
            System.out.println(platoArray[i]);
        }

        System.out.println("");

        for (int i = 0; i < rooseveltArray.length; i++) {
            System.out.println(rooseveltArray[i]);
        }

        System.out.println("");

        // Instantiates a new hash set.
        HashSet<String> hashSet = platoQuote.getWordSet(rooseveltQuote);

        // Prints the contents of the hash set.
        for (String s : hashSet) {
            System.out.println(s);
        }

        System.out.println();

        // Instantiates two hash maps.
        HashMap<String, Integer> platoMap = platoQuote.getWordCounts();
        HashMap<String, Integer> rooseveltMap = rooseveltQuote.getWordCounts();

        // Gets the set of keys for the hash maps.
        Set<String> platoSet = platoMap.keySet();
        Set<String> rooseveltSet = rooseveltMap.keySet();

        // Prints the two hash maps.
        for (String s : platoSet) {
            System.out.println(s + ": " + platoMap.get(s));
        }

        System.out.println("");

        for (String s : rooseveltSet) {
            System.out.println(s + ": " + rooseveltMap.get(s));
        }

        System.out.println("");

        // Prints the combined hash set of the quotes.
        for (String s : hashSet) {
            int combinedCount = 0;

            if (platoSet.contains(s)) {
                combinedCount += platoMap.get(s);
            }
            if (rooseveltSet.contains(s)) {
                combinedCount += rooseveltMap.get(s);
            }

            System.out.println(s + ": " + combinedCount);
        }
    }
}
