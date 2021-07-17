package bst;

public class LCA {
//    235. Lowest Common Ancestor of a Binary Search Tree

    /**
     * Definition for a binary tree node.
     */
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) {
            return null;
        }

//         if (root.val > p.val && root.val > q.val) {
//             return lowestCommonAncestor(root.left, p, q);
//         }

//         if (root.val < p.val && root.val < q.val) {
//             return lowestCommonAncestor(root.right, p, q);
//         }

//         return root;

        while (root != null) {
            if (root.val > p.val && root.val > q.val) {
                root = root.left;
            } else if (root.val < p.val && root.val < q.val) {
                root = root.right;
            } else {
                break;
            }
        }

        return root;
    }
}
