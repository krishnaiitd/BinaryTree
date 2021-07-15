package probleams;

import traversals.NonRecursiveTraversals;
import tree.BTree;

import java.util.*;

public class CreateMirrorImageTree {
    public static BTree getMirrorImageTreeRecursive(BTree root) {
        if (root == null) {
            return null;
        }

        BTree newNode = new BTree(root.data);
        newNode.left = getMirrorImageTreeRecursive(root.right);
        newNode.right = getMirrorImageTreeRecursive(root.left);
        return newNode;
    }

    public static BTree mirrorImageNonRecursive(BTree root) {
        if (root == null) {
            return null;
        }

//        Queue<BTree> queue = new LinkedList<>();
        Queue<BTree> queue = new ArrayDeque<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            BTree temp = queue.poll();

            BTree left = temp.left;
            temp.left = temp.right;
            temp.right = left;

            if (temp.left != null) {
                queue.add(temp.left);
            }
            if (temp.right != null) {
                queue.add(temp.right);
            }
        }

        return root;
    }


    public static void main(String[] args) {
        BTree tree = new BTree(1);
        tree.left = new BTree(3);
        tree.right = new BTree(4);
        tree.left.left = new BTree(5);
        tree.left.right = new BTree(6);
        NonRecursiveTraversals traversals = new NonRecursiveTraversals();
        traversals.printInOrder(tree);
        BTree mirrorImage = getMirrorImageTreeRecursive(tree);
        System.out.println("\nMirrorImage");
        traversals.printInOrder(mirrorImage);
        System.out.println("\nMirrorImageNonRecursive");
        traversals.printInOrder(mirrorImageNonRecursive(tree));

        System.out.println("\nLevelOrder");
        traversals.printLevelOrder(tree);

    }
}
