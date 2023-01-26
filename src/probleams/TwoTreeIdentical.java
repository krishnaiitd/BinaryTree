package probleams;

import tree.BTree;

import java.util.ArrayDeque;
import java.util.Queue;

public class TwoTreeIdentical {
    public static boolean isTreeIdenticalRecursive(BTree root1, BTree root2) {
         if (root1 == null && root2 == null) {
             return true;
         }

         if (root1 != null && root2 != null) {
           return (root1.data == root2.data) && isTreeIdenticalRecursive(root1.left, root2.left) && isTreeIdenticalRecursive(root1.right, root2.right);
         }

         return false;
    }

    public static boolean isTreeIdentical(BTree root1, BTree root2) {
        if (root1 == null && root2 == null) {
            return true;
        }

        if ((root1 == null && root2 != null) || (root1 != null && root2 == null)) {
            return false;
        }

        Queue<BTree> q1 = new ArrayDeque<>();
        Queue<BTree> q2 = new ArrayDeque<>();

        q1.add(root1);
        q2.add(root2);

        while (!q1.isEmpty() && !q2.isEmpty()) {
            BTree node1 = q1.poll();
            BTree node2 = q2.poll();

            if (node1.data != node2.data) {
                return false;
            }
            // Left side
            if (node1.left != null && node2.left != null) {
                q1.add(node1.left);
                q2.add(node2.left);
            }
            // One has left and other don't have
            if ((node1.left != null && node2.left == null) || (node1.left == null && node2.left != null)) {
                return false;
            }

            // Right side
            if (node1.right != null && node2.right != null) {
                q1.add(node1.right);
                q2.add(node2.right);
            }
            // One has left and other don't have
            if ((node1.right != null && node2.right == null) || (node1.right == null && node2.right != null)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

    }
}
