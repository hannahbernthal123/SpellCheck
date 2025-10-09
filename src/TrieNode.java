public class TrieNode {
    // radix = 256 because that is the extended ASCII letters.
    int radix = 256;
    boolean wordCheck = false;
    TrieNode[] nextNodes = new TrieNode[radix];

    public boolean isAWord() {
        return wordCheck;
    }

    public void setWord() {
        wordCheck = true;
    }

    // Function that drops you down to the next node options.
    public TrieNode[] getNext() {
        return nextNodes;
    }
}
