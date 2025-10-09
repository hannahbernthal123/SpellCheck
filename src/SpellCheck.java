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
//        // Trie initialization.
//        Trie dictionaryTrie = new Trie();
//
//        for (String word : dictionary) {
//            dictionaryTrie.insert(word);
//        }
//
//        Trie misspelledTrie = new Trie();
//        ArrayList<String> misspelledWords = new ArrayList<String>();
//
//        for (String word : text) {
//            if (!dictionaryTrie.find(word) && !misspelledTrie.find(word)) {
//                misspelledTrie.insert(word);
//                misspelledWords.add(word);
//            }
//        }
//
//        String[] misp = misspelledWords.toArray(new String[misspelledWords.size()]);
//        return misp;

        // TST initalization.
        TST dictionaryTST = new TST();

        for (String word : dictionary) {
            dictionaryTST.insert(word);
        }

        TST misspelledTST = new TST();
        ArrayList<String> misspelledWords = new ArrayList<String>();

        for (String word : text) {
            if (!dictionaryTST.find(word) && !misspelledTST.find(word)) {
                misspelledTST.insert(word);
                misspelledWords.add(word);
            }
        }

        String[] misp = misspelledWords.toArray(new String[misspelledWords.size()]);
        return misp;

    }

}
