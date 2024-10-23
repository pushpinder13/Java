

public class Symmetric_Tree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(3);

        System.out.println(Solution.isSymmetric(root));
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}

class Solution {
    public static boolean isSymmetric(TreeNode root) {
        return solve(root.left, root.right);
    }

    static boolean solve(TreeNode node1, TreeNode node2) {
        if (node1 == null && node2 == null) {
            return true;

        }
        if (node1 == null || node2 == null) {
            return false;
        }
        return node1.val == node2.val && solve(node1.left, node2.right) && solve(node1.right, node2.left);

    }
}