package probleams;

import tree.BTree;

public class CheckMirrorImage {

    /**
     * Tree root1 ->        1
     *                  2       3
     *
     *  Mirror image of above Root
     *      root2->         1
     *                 3        2
     *
     *  So, after root level data validation, we should compare root1.left with root2.right && root1.right with root2.left
     */
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
