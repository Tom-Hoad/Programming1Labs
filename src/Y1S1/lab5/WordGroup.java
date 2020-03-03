/* Lab 5: Arrays, HashMaps and API */
package Y1S1.lab5;

import java.util.HashMap;
import java.util.HashSet;

public class WordGroup {
    private String words;

    // WordGroup constructor.
    public WordGroup(String words) {
        this.words = words.toLowerCase();
    }

    // WordGroup string splitter.
    public String[] getWordArray() {
        return this.words.split(" ");
    }

    // Adds two strings to a hash set.
    public HashSet<String> getWordSet(WordGroup words) {
        // Creates a new hash set, splits up both strings.
        HashSet<String> hashSet = new HashSet<>();
        String[] thisArray = getWordArray();
        String[] wordsArray = words.getWordArray();

        // Adds the this string array to the hash set.
        for (int i = 0; i < thisArray.length; i++) {
            hashSet.add(thisArray[i]);
        }

        // Adds the words array to the hash set.
        for (int i = 0; i < wordsArray.length; i++) {
            hashSet.add(wordsArray[i]);
        }

        return hashSet;
    }

    // Adds words of a string to a hash map.
    public HashMap<String, Integer> getWordCounts() {
        // Creates an empty hash map, splits the string.
        HashMap<String, Integer> hashMap = new HashMap<>();
        String[] wordsArray = getWordArray();

        for (String word : wordsArray) {
            // Checks if the word has already appeared in the hash map.
            if (hashMap.containsKey(word)) {
                // Updates value linked to the key.
                int oldValue = hashMap.get(word);
                hashMap.replace(word, oldValue, oldValue + 1);
            } else {
                // Adds a new word to the hash map.
                hashMap.put(word, 1);
            }
        }

        return hashMap;
    }
}
