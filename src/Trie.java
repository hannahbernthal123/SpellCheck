public class Trie {
    Node node = new Node();

    public void insert(String word) {
        Node current = node;
        for (int i = 0; i < word.length(); i++) {
            // The character stored as ASCII. This index is where that character will be stored in the big array.
            int index = word.charAt(i);

            // If the letter you're looking to add doesn't exist...
            if (current.getNext()[index] == null) {
                current.getNext()[index] = new Node();
            }
            // Set our current node to the child node.
            current = current.getNext()[index];
        }
        // Set the boolean to true so you know it is the final node of a word.
        current.setWordCheck();
    }

    public boolean find(String word) {
        Node current = node;
        for (int i = 0; i < word.length(); i++) {
            int index = word.charAt(i);

            // If the letter you're looking to add doesn't exist...
            if (current.getNext()[index] == null) {
                // The word does not exist in the trie so return false.
                return false;
            }

            // Set our current node to the child node.
            current = current.getNext()[index];
        }

        // When this returns false, the word does not exist in the dictionary.
        return current.isAWord();
    }
}
