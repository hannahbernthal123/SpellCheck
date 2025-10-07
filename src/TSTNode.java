public class TSTNode {
    // We assume that it is not the end of a word.
    boolean wordCheck = false;

    // This array represents the nodes to the left, center, and right.
    TSTNode[] nextNodes = new TSTNode[3];
    // Instantiate the letter as a blank.
    char letter = '_';

    // Set all the children to null.
    TSTNode left = null;
    TSTNode right = null;
    TSTNode center = null;


    public boolean isAWord() {
        return wordCheck;
    }

    // Setters to be able to update the node.
    public void setLetter(char letter) {
        this.letter = letter;
    }

    public void setLeft(TSTNode node) {
        center = node;
    }

    public void setCenter(TSTNode node) {
        center = node;
    }
    public void setRight(TSTNode node) {
        center = node;
    }

    public void setWord() {
        wordCheck = true;
    }

    // Getters to retrieve information about the node.
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