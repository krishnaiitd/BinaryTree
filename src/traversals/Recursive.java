package traversals;

import tree.BTree;

public class Recursive {
    public void printInOrder(BTree root) {
        if (root != null) {
            printInOrder(root.left);
            System.out.print(root.data + ", ");
            printInOrder(root.right);
        }
    }

    public void printPreOrder(BTree root) {
        if (root != null) {
            System.out.print(root.data + ", ");
            printPreOrder(root.left);
            printPreOrder(root.right);
        }
    }

    public void printPostOrder(BTree root) {
        if (root != null) {
            printPostOrder(root.left);
            printPostOrder(root.right);
            System.out.print(root.data + ", ");
        }
    }
}
