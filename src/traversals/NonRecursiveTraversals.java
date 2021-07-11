package traversals;

import tree.BTree;

import java.util.Stack;

public class NonRecursiveTraversals {

    public void printInOrder(BTree root) {
        Stack<BTree> s = new Stack<>();
        while (root != null || !s.isEmpty()) {
            if (root != null) {
                s.push(root);
                root = root.left;
            } else {
                root = s.pop();
                System.out.println(root.data + ", ");
                root = root.right;
            }
        }
    }

    public void printPreOrder(BTree root) {
        Stack<BTree> s = new Stack<>();
        while (root != null || !s.isEmpty()) {
            if (root != null) {
                System.out.println(root.data + ", ");
                s.push(root);
                root = root.left;
            } else {
                root = s.pop();
                root = root.right;
            }
        }
    }
}
