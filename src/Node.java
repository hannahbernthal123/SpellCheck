public class Node {
    // radix = 256 because that is the extended ASCII letters.
    int radix = 256;
    boolean wordCheck = false;
    Node[] nextNode = new Node[radix];

    public boolean isAWord() {
        return wordCheck;
    }

    public void setWordCheck() {
        wordCheck = true;
    }

    // Recursive function that drops you down to the next node.
    public Node[] getNext() {
        return nextNode;
    }
}
