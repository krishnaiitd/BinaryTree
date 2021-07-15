package probleams;

import tree.BTree;

public class CheckMirrorImage {
    public static boolean areMirrorImage(BTree root1, BTree root2) {
        if (root1 == null && root2 == null) {
            return true;
        }
        if (root1 == null || root2 == null) {
            return false;
        }

        // Now both of them are non empty, compare recursively
        return root1.data == root2.data && areMirrorImage(root1.left, root2.right) && areMirrorImage(root1.right, root2.left);
    }
}
