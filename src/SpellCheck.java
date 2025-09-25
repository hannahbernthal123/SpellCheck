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
        LinkedHashSet<String> matches = new LinkedHashSet<>();

        for (String w : text) {
            if (binarySearch(dictionary, w)) {
                matches.add(w);
            }
        }

        return matches.toArray(new String[0]);
    }

    private boolean binarySearch(String[] sorted, String target) {
            int low = 0, hi = sorted.length - 1;
            while (low <= hi) {
                int mid = low + (hi - low) / 2;
                int cmp = sorted[mid].compareTo(target);
                if (cmp == 0) return true;
                if (cmp < 0)  low = mid + 1;
                else          hi = mid - 1;
            }
            return false;

    }

//
//        for (int i = 0; i < text.length - 1; i++) {
//            for (int j = 0; j < dictionary.length - 1; j++) {
//                if (dictionary[j] == text[i]) {
//                    textClone.remove(i);
//                }
//            }
//        }
//
//        int i = 0;
//        while (i < textClone.size() - 1) {
//            String word = textClone.get(i);
//            if (word.equals(textClone.get(i + 1)))
//                textClone.remove(i + 1);
//            else
//                i++;
//        }
//
//        for (int k = 0; k < textClone.size(); k++) {
//            perm[k] = textClone.get(k);
//        }
//
//        return perm;

}
