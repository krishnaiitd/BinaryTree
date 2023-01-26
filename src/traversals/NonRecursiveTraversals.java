package traversals;

import tree.BTree;

import java.util.ArrayDeque;
import java.util.Queue;
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
                System.out.print(root.data + ", ");
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
    public void printLevelOrder(BTree root) {
        if (root == null) {
            return;
        }
        Queue<BTree> queue = new ArrayDeque<>();

        queue.add(root);
        while (!queue.isEmpty()) {
            BTree temp = queue.poll();
            System.out.print(temp.data + ", ");

            if (temp.left != null) {
                queue.add(temp.left);
            }

            if (temp.right != null) {
                queue.add(temp.right);
            }
        }
    }

}
