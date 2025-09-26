/**
 * Spell Check
 * A puzzle written by Zach Blick
 * for Adventures in Algorithms
 * At Menlo School in Atherton, CA
 *
 * Completed by: Hannah Bernthal
 * */

import java.io.*;
import java.util.*;

public class SpellCheck {


    /**
     * checkWords finds all words in text that are not present in dictionary
     *
     * @param text The list of all words in the text.
     * @param dictionary The list of all accepted words.
     * @return String[] of all mispelled words in the order they appear in text. No duplicates.
     */
    public String[] checkWords(String[] text, String[] dictionary) {
        ArrayList<String> textClone = new ArrayList<>();
        String[] perm = new String[text.length];

        // Collect matches (preserve order, remove duplicates)
        LinkedHashSet<String> incorrectWords = new LinkedHashSet<>();

        for (String word : text) {
            if (!binarySearch(dictionary, word)) {
                incorrectWords.add(word);
            }
        }

        // Method that turns the set into an array.
        return incorrectWords.toArray(new String[0]);
    }

    private boolean binarySearch(String[] dictionary, String currWord) {
            int low = 0;
            int hi = dictionary.length - 1;
            while (low <= hi) {
                int mid = low + (hi - low) / 2;
                // representativeNum is the representation of how the current word compares to the middle of where we are in the dicitonary.
                // repNum = 0 if the words are the same, is positive if
                int repNum = dictionary[mid].compareTo(currWord);
                if (repNum == 0) {
                    return true;
                }
                if (repNum < 0)  {
                    low = mid + 1;
                }
                else {
                    hi = mid - 1;
                }
            }
            return false;

    }


}
