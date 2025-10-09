public class TSTNode {
    boolean wordCheck;
    TSTNode[] nextNodes;
    char letter;
    TSTNode left;
    TSTNode right;
    TSTNode center;

    public TSTNode(char letter) {
        this.letter = letter;
        wordCheck = false;
        nextNodes = new TSTNode[3];
        left = null;
        right = null;
        center = null;

    }


    public boolean isAWord() {
        return wordCheck;
    }

    public void setLeft(TSTNode node) {
        left = node;
    }

    public void setCenter(TSTNode node) {
        center = node;
    }
    public void setRight(TSTNode node) {
        right = node;
    }

    public void setWord() {
        wordCheck = true;
    }

    public TSTNode getLeft() {
        return left;
    }

    public TSTNode getRight() {
        return right;
    }

    public TSTNode getCenter() {
        return center;
    }

    public char getLetter() {
        return letter;
    }

    // Recursive function that drops you down to the next node options.
    public TSTNode[] getNext() {
        return nextNodes;
    }
}