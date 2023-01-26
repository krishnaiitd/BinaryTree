package tree;

public class BTree {
    public int data;
    public BTree left;
    public BTree right;

    public BTree(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}
