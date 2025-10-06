public class TSTNode {
    boolean wordCheck = false;
    TSTNode[] nextNodes = new TSTNode[3];
    char letter;

    public boolean isAWord() {
        return wordCheck;
    }

    public void setLetter(char letter) {
        this.letter = letter;
    }

    public void setWordCheck() {
        wordCheck = true;
    }

    // Recursive function that drops you down to the next node.
    public TSTNode[] getNext() {
        return nextNodes;
    }
}